package com.hrs;

import java.util.Scanner;

public class Prime {
	private static Scanner s;
	
	public static void main(String[] args) {
		int count;
		s = new Scanner(System.in);
		
		System.out.println("Enter the prime till:");
		count=s.nextInt();
		int i=10;
		{
			if(count>10)
			{   
				System.out.print("2,3,5,7,");
			}
			for(int j=i;j<count;j++)
			{
				
				if(i%2!=0&&i%3!=0&&i%5!=0&&i%7!=0)
				{   
					
					System.out.print(i+",");
				}
				i++;
				
			}
		}
	}

}
