package com.hrs;
import java.util.Scanner;


public class Fibonacci {

private static Scanner s;

public static void main(String[] args){
		
		int n1=0,n2=1,n3=0;
		int count, tsum=0;
		s = new Scanner(System.in);
        System.out.println("Enter the fibonacci till :");
        count=s.nextInt();
        for(int i=0;i<count;i++)
        {   
        	n3=n1+n2;
        	tsum=tsum+n1;
        	System.out.println("Sum of "+ n1 +" and "+ n2 +" "+ n3);
        	n1=n2;
        	n2=n3;
        }
        System.out.println(tsum);

	}

}
