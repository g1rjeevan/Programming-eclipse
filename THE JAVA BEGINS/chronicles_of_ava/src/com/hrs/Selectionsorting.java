package com.hrs;

import java.util.Scanner;

public class Selectionsorting {

	private static Scanner s1;

	public static void main(String[] args){   
		s1 = new Scanner(System.in);
	
		int[] arr;
		int size;
		size=s1.nextInt();
		arr=new int[size];
		System.out.println("enter");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s1.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
			 if(arr[i]<arr[j])
			 {
				 int t=arr[i];
				 arr[i]=arr[j];
				 arr[j]=t;
			 }
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
			
	}
}
