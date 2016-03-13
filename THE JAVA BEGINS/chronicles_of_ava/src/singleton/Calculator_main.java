package singleton;

public class Calculator_main 
{
  public static void main(String[] args) {
	System.out.println("Enter the dividend and divisor");
	Calculator c1=Calculator.getInstance();
	c1.divide(25, 5);
	c1.divide(26, 3);
	Calculator c2=Calculator.getInstance();
    c2.divide(215767331, 8787372);
  }
}
