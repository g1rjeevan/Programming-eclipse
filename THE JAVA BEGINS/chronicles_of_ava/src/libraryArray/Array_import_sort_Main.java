package libraryArray;
import java.util.Scanner;

import java.util.Arrays;
//Arrays has sort() f'n which is overloaded
//it is a static method

public class Array_import_sort_Main {

	
private static Scanner s1;

public static void main(String[] args) {
		System.out.println("**********************");
		
		s1 = new Scanner(System.in);
		int size=0;
		int[] arr1=null;
		System.out.println("enter the size of the array");
		size = s1.nextInt();
		arr1= new int[size];
		System.out.println("enter the array elements");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=s1.nextInt();
		}
		System.out.println("Unsorted array elements are");
		for (int i = 0; i < arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		Arrays.sort(arr1);
		System.out.println("Sorted array element");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println("**********************");
	}

}
