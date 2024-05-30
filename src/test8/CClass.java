package test8;

public class CClass extends PClass{

	public CClass(int x, int y) {
		super(x);
		System.out.println("y:"+y);
	}
	
	public CClass(int x, int y, int z) {
		this(x,y);
		System.out.println("z:"+z);
	}
}
