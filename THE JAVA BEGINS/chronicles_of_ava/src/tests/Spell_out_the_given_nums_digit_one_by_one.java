package tests;

import java.util.Scanner;

public class Spell_out_the_given_nums_digit_one_by_one {
	private static Scanner s;
	public static void main(String[] args) {
	int num=0;
	s=new Scanner(System.in);
	System.out.println("Enter the number: ");
	num=s.nextInt();
	int size=0;
	int[] temp=new int[10];
	for (int i = 0; i < temp.length; i++)  {
		temp[i]=num%10;
		
		num=num/10;
		if(num!=0){
			size++;
			}
	}
	for (int j =size; j>=0; j--) {
		
		System.out.print(temp[j]+"-");	
	switch(temp[j]){
	case 1:System.out.print("ONE, ");
	       break;
	case 2:System.out.print("TWO, ");
	       break;
	case 3:System.out.print("THREE, ");
			break;
	case 4:System.out.print("FOUR, ");
			break;
	case 5:System.out.print("FIVE, ");
			break; 
	case 6:System.out.print("SIX, ");
			break;
	case 7:System.out.print("SEVEN, ");
			break;
	case 8:System.out.print("EIGHT, ");
			break;
	case 9:System.out.print("NINE, ");
			break;
			default:System.out.print("ZERO, ");
			break;
			}
	
		}
	}
}

