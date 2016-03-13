package com.hrs;

import java.util.Scanner;

public class Fac {
	
	public static void main(String[] args) {
		
		int fact=0,n=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		fact=fac(n);
		System.out.println(fact);
		
	}

	static int fac(int n)
	{
		if(n==0){
			return 1;
		}
		return n*fac(n-1);
	}
}
