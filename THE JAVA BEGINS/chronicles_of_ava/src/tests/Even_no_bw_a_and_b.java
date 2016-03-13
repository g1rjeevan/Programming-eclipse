package tests;

import java.util.Scanner;

public class Even_no_bw_a_and_b {

	public static void main(String[] args) {
		int a,b;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		while(a!=b){
			if(a%2==0){
				System.out.println(a);
				}
			a++;
			}
		}
	}


