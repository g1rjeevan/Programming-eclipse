package tests;

import java.util.StringTokenizer;

public class WithoutAnyAPIfindSUbstring {
	public static void main(String[] args) {
		String s="programming is programming";
		String s1="gram";
		
			StringTokenizer st = new StringTokenizer(s,s1); 
			int key = st.countTokens(); 
				
				System.out.println( st.nextToken(s1)); 
			
		} 
}

