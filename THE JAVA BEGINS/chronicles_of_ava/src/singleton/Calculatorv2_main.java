package singleton;

public class Calculatorv2_main {

	
	  public static void main(String[] args) {
		System.out.println("Enter the dividend and divisor");
		System.out.println("********************"
				+ ""
				+ "");
		Calculatorv2 c1= Calculatorv2.getInstance();
		c1.divide(25, 5);
		System.out.println("********************"
				+ ""
				+ ""
				+ "");
		c1.divide(26, 3);
		System.out.println("********************"
				+ ""
				+ "");
		Calculator c2=Calculator.getInstance();
	    c2.divide(215767331, 8787372);
	  }
	}

