package tests;

import java.util.Arrays;

public class Test { 
	public static void main(String[] args) throws Exception { 
		char[] chars = new char[] {'\u0057'}; 
		String str = new String(chars); 
		byte[] bytes = str.getBytes(); 
		System.out.println(Arrays.toString(bytes)); 
		Test t = new Test();
	}
}

