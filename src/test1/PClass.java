package test1;

public class PClass {

	int a=10;
	static int b=20;
	public void pm1() {
		System.out.println("===========PClass pm1()=============");
		System.out.println("a:" +a);
		System.out.println("b:" +b);
	}
	
	public static void pm2() {
		System.out.println("==========PClass pm2()===========");
		System.out.println("b:"+b);
	}
}
