package tests;

import java.util.Scanner;

public class Missingnuminconsecutiveseries {

	private static Scanner s;

	public static void main(String[] args) {
		int size=0;
		s = new Scanner(System.in);
		System.out.println("Enter the size of the consecutive series");
		size=s.nextInt();
		int[] arr1=new int[size-1];
		System.out.println("Enter the consecutive nos. ");
        for (int i = 0; i < arr1.length; i++) {
			arr1[i]=s.nextInt();
		}  
        int sumO=(size)*(size+1)/2;
        int sum=0;
        for(int e:arr1){
        	
        	sum=sum+e;
        }
        int diff=sumO-sum;
        System.out.println("Missing no. in the consecutive series is : "+(diff));
        
	}

}
