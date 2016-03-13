/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;*/
import java.util.Scanner;

class TestClass {
   
    
	public static void main(String args[] ) throws Exception {
       Scanner s1 = new Scanner(System.in);
       
       
        int N,D,i= 0,y=0;
        int Xs=0;
        
        D=s1.nextInt();
     
        
        N=s1.nextInt();
        int T[]=new int[N];
        int X[]=new int[N];
        int Y[]=new int[N] ;
        for(i=0;i<N;i++)
        {
        
            T[i]=s1.nextInt();
            
            
            X[i]=s1.nextInt();
            
            Y[i]=s1.nextInt();
            
        }
        Xs=X[N-1];
        int Yl=Y[N-1];
        	
        for(i=0;i<N;i++)
        {
        	if((X[i]<=Xs)&&(Y[i]>=Yl)){
        		Xs=X[i];
        	    Yl=Y[i];
        	    y=i;}
        }
        
        System.out.println(y+1);
    }
        
        
   
}
