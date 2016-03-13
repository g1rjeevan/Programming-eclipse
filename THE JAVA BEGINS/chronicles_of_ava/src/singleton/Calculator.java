package singleton;

public class Calculator {

	private Calculator(){
		System.out.println("Running constructor now");
	}
	void divide(int n1,int n2){
		System.out.println("number "+n2+" is dividing "+n2);
		double result=(double)n1/n2;
		System.out.println("Result "+result);
	}
	
	public static Calculator getInstance(){
		Calculator c = new Calculator();
		return c;
	}
}
