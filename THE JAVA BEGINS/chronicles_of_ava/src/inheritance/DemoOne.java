package inheritance;

public class DemoOne {

	private static int sameone = 1;
	public final int sameTwo = 2;
	private int sameThree = 3;
	public int sameFour = 4;
	private static final int sameFive = 5;
	public static final int sameSix = 6;
	public static int sameSeven = 7;

	private static void sameOne() {
		System.out.println("DemoOne sameOne");
	}

	public final void sameTwo() {
		System.out.println("DemoOne sameTwo");
	}

	private void sameThree() {
		System.out.println("DemoOne sameThree");
	}

	public void sameFour() {
		System.out.println("DemoOne sameFour");
	}

	public static void sameFive() {
		System.out.println("DemoOne sameFive");
	}
}
