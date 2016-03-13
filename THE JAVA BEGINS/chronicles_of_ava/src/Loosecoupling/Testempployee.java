package Loosecoupling;

import java.util.*;

public class Testempployee {
 private static Scanner s;

public static void main(String[] args) {
	
	System.out.println("*******************");
	
	Garage g1 = new Garage();
    
	Employee e1=new Employee();
	System.out.println("Enter the starting character of the vehicle");
	s = new Scanner(System.in);
	char s1=s.next().charAt(0);
	e1.initVehicle(g1.getVehicle(s1));
	
	e1.commute();
	
	
	System.out.println("*******************");
}
}
