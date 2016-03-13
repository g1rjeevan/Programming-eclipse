package c_oClass.Objects;

import java.util.Scanner;
class Circle 
                                                {   
	double rad;
	final static double PI=3.1423;
	
	void area()
	{
		
		double A=PI*rad*rad;
		System.out.println("Area is :"+A);
    }
		void circum()
	{
		double C=PI*rad*2;
        System.out.println("Circumference is :"+C);
    }
}
	
	
class Circle_Main
{
    
	private static Scanner s1;

	public static  void main(String[] args)
		{   
		s1 = new Scanner(System.in);
		
		Circle circ1=new Circle();
		System.out.print("Enter the radius : ");
        circ1.rad=s1.nextDouble();
		circ1.area();
		circ1.circum();
		Circle circ2=new Circle();
        
		System.out.println();

		System.out.print("Enter the radius : ");
        circ2.rad=s1.nextDouble();
		
		
		
		circ2.area();
		circ2.circum();
        System.out.println();


	}
}
