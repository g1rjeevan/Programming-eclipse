package javaeight;

public abstract class AbstractClassOne {
	private static int one=1;
	public static int one1=1;
	static int one2=1;
	protected static int one3=1;
	static {
		System.out.println("Only once bro");
	}
	
	{
		System.out.println("Every time instantiate bro");
	}
	public AbstractClassOne() {
		System.out.println(one+" "+one1+" "+one2+" "+one3);
	}
}
