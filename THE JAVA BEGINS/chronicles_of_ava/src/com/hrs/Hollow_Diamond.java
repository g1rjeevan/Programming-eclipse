package com.hrs;

public class Hollow_Diamond {
   public static void main(String[] args){
		
		int row=10,star=1,space=9,mid=row/2+1;
		for(int i=0;i<2*row;i++){
			
			for(int j=0;j<space;j++){
				System.out.print("  ");
			}
			
			for(int j=0;j<star;j++){
				
				  if(j==0||j==star-1){
			   System.out.print("* ");
			}
				  
			    else{
					System.out.print("  ");
				}
			}
			     if(i<=mid){
			star+=2;
			space--;
			System.out.println();
		         }
			     else{
					star-=2;
					space++;
					System.out.println();
				}
		}
	}
}
