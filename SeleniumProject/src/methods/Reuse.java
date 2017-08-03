package methods;

public class Reuse {

	public static void main(String[] args) 
	{
//		methodsEg.function1();
		methodsEg m=new methodsEg();
//		m.function3();

//		int res=m.sum(60,40);
//		System.out.println(res);
		
		m.br_Launch("firefox", "http://primusbank.qedgetech.com");
		m.send_Text("id", "txtuId", "Admin");
		m.send_Text("id", "txtPword", "Admin");
		m.click("id", "login");
	}

}
