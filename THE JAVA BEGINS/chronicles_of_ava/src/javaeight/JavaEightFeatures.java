package javaeight;

import java.util.Arrays;

public class JavaEightFeatures {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(args).toString());
		ExponentialNumber x =(num)-> num*num;
		mainL(x);
		x=(num)->4+num;
		mainL(x);
		JavaEightFeatures eightFeatures =new JavaEightFeatures();
		eightFeatures.gayLikeC();
	}

	public static void mainL(ExponentialNumber i) {
		System.out.println(i.exponent(5));
	}

	@FunctionalInterface
	private interface ExponentialNumber {
		public int exponent(int a);
	}

	public  void gayLikeC() {
		System.out.println("I am gay like c++ now");

	}
}