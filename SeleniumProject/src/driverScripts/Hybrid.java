package driverScripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import methods.OrgHRMMaster;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Hybrid {

	public static void main(String[] args) throws IOException
	{
		DateFormat formate=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date=new Date();
		
		System.out.println(date);
		String a=formate.format(date);
//		System.out.println(a);
		String b=((a.replace("/", "")).replace(" ", "")).replace(":", "");
//		System.out.println(b);
		OrgHRMMaster om=new OrgHRMMaster();
		String xlpath="E:\\Divya\\Deepthi_Workspace\\SeleniumProject\\src\\testData\\Hybrid.xlsx";
		String xlout="E:\\Divya\\Deepthi_Workspace\\SeleniumProject\\src\\results\\HybridRes"+b+".xlsx";
		String res=null;
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Testcase");
		XSSFSheet ws1=wb.getSheet("Teststeps");
		XSSFSheet ws2=wb.getSheet("TestData");
		XSSFSheet ws3=wb.getSheet("EmpReg");
		
		int tcRc=ws.getLastRowNum();
		int tsRc=ws1.getLastRowNum();
		int empRc=ws3.getLastRowNum();
		
		for (int i = 1; i <= tcRc; i++)
		{
			ws.getRow(i).createCell(3);
			String exe=ws.getRow(i).getCell(2).getStringCellValue();
			if (exe.equalsIgnoreCase("Y"))
			{
				String tcId=ws.getRow(i).getCell(0).getStringCellValue();
				
				for (int j = 1; j <= tsRc; j++)
				{
					String tstcId=ws1.getRow(j).getCell(0).getStringCellValue();
					if (tcId.equalsIgnoreCase(tstcId))
					{
						String keyword=ws1.getRow(j).getCell(3).getStringCellValue();
						System.out.println(keyword);
						switch (keyword)
						{
						case "Launch":
							res=om.org_Launch(ws2.getRow(1).getCell(0).getStringCellValue());
							break;
						case "login":
							String u=ws2.getRow(1).getCell(1).getStringCellValue();
							String p=ws2.getRow(1).getCell(2).getStringCellValue();
							res=om.org_Login(u, p);
							break;
						case "logout":	
							res=om.org_Logout();
							break;
						case "Empreg":
							for (int k = 1; k <= empRc; k++)
							{
								String f=ws3.getRow(k).getCell(0).getStringCellValue();
								String l=ws3.getRow(k).getCell(1).getStringCellValue();
								res=om.org_Empreg(f, l);
								ws3.getRow(k).createCell(2).setCellValue(res);
							}
							
							break;
						case "Usereg":
							String ename=ws2.getRow(1).getCell(5).getStringCellValue();
							String uname=ws2.getRow(1).getCell(6).getStringCellValue();
							String pswd=ws2.getRow(1).getCell(7).getStringCellValue();
							String cpswd=ws2.getRow(1).getCell(8).getStringCellValue();
							res=om.org_Userreg(ename, uname, pswd, cpswd);
							break;
						case "Ulogin":	
							String un=ws2.getRow(1).getCell(6).getStringCellValue();
							String ps=ws2.getRow(1).getCell(7).getStringCellValue();
							res=om.org_Login(un, ps);
							break;
						default:
							System.out.println("Please give proper keyword");
							break;
						}
						//result updation in test steps sheet
						ws1.getRow(j).createCell(4).setCellValue(res);
						//result updation in test case sheet
						if (!ws.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail"))
						{
							ws.getRow(i).getCell(3).setCellValue(res);
						}
					}
				}
			}
			else
			{
				ws.getRow(i).createCell(3).setCellValue("BLOCKED");
			}
		}
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();

	}

}
