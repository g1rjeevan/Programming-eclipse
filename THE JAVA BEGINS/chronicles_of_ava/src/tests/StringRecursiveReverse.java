package tests;

import java.util.ArrayList;
import java.util.Arrays;

public class StringRecursiveReverse {

	static int k=1;
	static int j=0;
	public static void main(String[] args) 
	{	int i = 0;
		ArrayList as=new ArrayList();
		String name="shasank is good boy";
		String name1="tydud hfdj tu";
		System.out.println(name1.indexOf(String.valueOf(' ')));
		for (; i < name.length();) {
			
			System.out.println(name.indexOf(' ',i));
			if((i=name.indexOf(' ',i))<=name.length()){
				i=name.indexOf(' ',i);
			}
			
		}
		Recurs(name);

	}
	static String Recurs(String name){
		char[] a=name.toCharArray();
		if((a.length)>=k){
			System.out.print(a[a.length-k]);
			
			k++;
			return (Recurs(name));
		}
		return " ";
	} 
}
