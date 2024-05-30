package test9;

public class CClass extends PClass{
	public static void m(int x, int y) {
		System.out.println("y:"+y);
	}
public static void m(int x, int y, int z) {
	System.out.println("z:"+z);
}

public void access(int x, int y, int z) {
	super.m(x);
	this.m(x, y);
	this.m(x, y, z);
	
}
}
