package test4;

public class PClass {
	  static int k;
static {
	System.out.println("=========PClass Static Block================");
	System.out.println("The value of k: "+k);

}
{
	System.out.println("==========PClass Instance Block==============");
	System.out.println("The value of k: "+k);

}
}
