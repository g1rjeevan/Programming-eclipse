package com.hrs;
import java.util.Scanner;

public class evenodddivide3 {
	
	
 private static Scanner s1;

public static void main(String[] args)
 {  
    s1 = new Scanner(System.in);
    int number, y=1;
	System.out.println("Program Started");
	while(y== 1)
	{
	System.out.println("Enter the number");
	number=s1.nextInt();
	
	Calculate c1=new Calculate();
	c1.process(number);
	System.out.println("\nwanna continue:");
	y=s1.nextInt();
	}
	System.out.println("\nProgram ended");
	
 }
}
class Calculate
{
	void process(int n)
	{
		if(n%2==0)
		{
			System.out.println("The give number is even");
			divide3(n);
		}
		else
		{
			System.out.println("the given number is odd");
			divide3(n);
		}
	}
	void divide3(int m){
		if(m%3==0)
		{
			System.out.print("& also the number is divisible by 3");
			
		}
		else 
		{
			System.out.print("& also the number is not divisible by 3");
		}
	}
}
