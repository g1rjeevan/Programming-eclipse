package inheritance;

public class SampleOne extends DemoOne {
	private static int sameoneSampleOne = 5;
	public final int sameTwoSampleOne = 6;
	private int sameThreeSampleOne = 7;
	public int sameFourSampleOne = 8;

	static {

		// sameone+sameThree+sameFive Not visible due to private
		// sameTwo + "" + sameFour + "" + non-static cannot be called in static
		System.out.println(sameSix + "" + sameSeven);
		//sameSix =7;
		sameSeven =8; //public static can also be overridden
		System.out.println(sameSix + "sameSeven =8;" + sameSeven);

	}

	{
		System.out.println(sameTwo + "" + sameFour + "" + sameSix + "" + sameSeven);
		// sameone = 5; Not visible due to private
		// sameTwo = 6; final cannot be overridden
		// sameThree = 7;Not visible due to private
		sameFour = 8; // only public non-static can be overridden
		// sameFive = 9;Not visible due to private
		// sameSix = 10; final cannot be overridden
		sameSeven = 12; // though it is static variable it can be overridden
		System.out.println(sameTwo + "" + sameFour + "" + sameSix + "" + sameSeven);
	}

	private static void sameOne() {
		System.out.println("SampleOne sameOne");
	}

	public final void sameTwo(int i) {
		System.out.println("SampleOne sameTwo");
	}

	private void sameThree() {
		System.out.println("SampleOne sameThree");
	}

	public void sameFour() {
		System.out.println("SampleOne sameFour");
	}

	public static final void sameFive() {
		System.out.println("SampleOne sameFive");
	}
}
