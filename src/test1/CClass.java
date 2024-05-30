package test1;

public class CClass extends PClass{
 int x=100;
 static int y=200;
 
 public void cm1() {
	 System.out.println("=================CClass cm1()===================");
  System.out.println("x:"+x);
  System.out.println("y:"+y);
 }
 
 public static void cm2()
{
	 System.out.println("================CClass cm2()==================");
	 System.out.println("y:"+y);
	 }
}
