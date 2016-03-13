package Exceptions;


public class Demo1 {

	public static void main(String[] args){
		System.out.println("**********************");
		
		int i=0;
		int j=0;
		try{
			System.out.println("Running try block");
			j=i/0;
			System.out.println("Exiting the try block");
		}
		catch(ArithmeticException e){
			System.out.println("Exception handled");
		}
        
		System.out.println("i value "+i);
		System.out.println("j value "+j);
		
		System.out.println("**********************");
	}
}
