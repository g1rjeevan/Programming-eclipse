package tests;

import java.util.*;

public class Organise_the_int_at_first_and_char_at_last {
	public static void main(String[] args) {
		String arr1=null;
		System.out.println("Enter the sample");
		Scanner s = new Scanner(System.in);
		arr1=s.next();
		char[] c=arr1.toCharArray();
		int e=c.length;
		char[] a = new char[e];
		char[] b = new char[e];
		int j=0,k=0;
		for (int i = 0; i < c.length; i++) {
			if(c[i]>=48&&c[i]<=57){
				a[j]=c[i];
				j++;
			}
			else if(c[i]>=65&&c[i]<=90||c[i]>=97&&c[i]<=122){
				b[k]=c[i];
				k++;
			}
		}//sorting the numbers and alphabets in the above loop
		//and storing them to different loop
		for (int i = 0; i < a.length-1; i++) {
			for (int l = i; l < a.length; l++) {
				if(a[i]<a[l]){
					a[i]=(char)(a[i]+a[l]);
					a[l]=(char)(a[i]-a[l]);
					a[i]=(char)(a[i]-a[l]);
				}
			}
		}//arranging the numbers in the descending order
		Arrays.sort(b);
		for (int m = 0; m < c.length; m++) {
			System.out.print(c[m]+" ");
		}
		System.out.println();
		for (int m = 0; m < c.length; m++) {
			System.out.print(a[m]+" ");
			
		}
		System.out.println();
		for (int m = 0; m < c.length; m++) {
			System.out.print(b[m]+" ");
			
		}
		for (int m = 0; m < a.length; m++) {
			
			if(a[m]>=48&&a[m]<=57){
				b[m]=a[m];
			}
		}
		System.out.println();
		for (int m = 0; m < c.length; m++) {
			System.out.print(b[m]+" ");
		}
		
	}
}