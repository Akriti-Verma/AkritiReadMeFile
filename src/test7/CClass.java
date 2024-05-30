package test7;

public class CClass extends PClass{
public void m(int x, int y) {
	super.m(x);
	System.out.println("y:"+y);
}
public void m(int x, int y, int z) {
	this.m(x, y);
	System.out.println("z:"+z);
}
}
