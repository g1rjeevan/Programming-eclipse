package com.hrs;

public class Palindrome {

	
		public static void main(String[] args){
			String a="MALAYALAM";
		    char c[]=a.toCharArray();
			int length=c.length,count=0;
			int j =0, k=length-1,mid=length/2;
			for(int i=0;i<length/2;i++){
				if(c[j]==c[k]){
					count++;
					j++;
					k--;
				}
			}
			if(count==mid)
				System.out.println("palindrome");
			else
			
			System.out.println("not a pallindrome");
		}
}
