package tests;


/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.util.Scanner;

class Testclass {
    
    
	public static void main(String args[] ) throws Exception {
		Scanner s1 = new Scanner(System.in);
       
       
        int N,D,i= 0,y=0;
        int Xs=0;
        System.out.println("Enter the D units of the house");
        
        D=s1.nextInt();
        System.out.println("The units of the house: "+D);
        System.out.println();
        System.out.println("Enter the total number of workers");
        
        N=s1.nextInt();
        int T[]=new int[N];
        int X[]=new int[N];
        int Y[]=new int[N] ;
        for(i=0;i<N;i++)
        {
        	System.out.println("--------------------------------");
        	System.out.println("Enter the "+ (i+1)+"th worker details");
        	
        System.out.println("The hiring cost " + (i+1)+"th worker" );
            X[i]=s1.nextInt();
            
            System.out.println("The speed " + (i+1)+"th worker" );
            Y[i]=s1.nextInt();
            System.out.println("--------------------------------");
        }
        Xs=X[N-1];
        int Yl=Y[N-1];
        for(i=0;i<N;i++)
        {
        	
                   System.out.println(T[i]+" "+X[i]+" "+Y[i]);
        }	
        for(i=0;i<N;i++)
        {
        	if((X[i]<=Xs)&&(Y[i]>=Yl)){
        		Xs=X[i];
        	    Yl=Y[i];
        	    y=i;}
        }
        
        System.out.println("Best worker is "+(y+1));
    
   System.out.println("The "+(i+1)+"th worker has his available time T");
            T[i]=s1.nextInt();
            
            System.out.println("The hiring cost " + (i+1)+"th worker" );
            X[i]=s1.nextInt();
            
            System.out.println("The speed " + (i+1)+"th worker" );
            Y[i]=s1.nextInt();
            System.out.println("--------------------------------");
        
        Xs=X[N-1];
        Yl=Y[N-1];
        for(i=0;i<N;i++)
        {
        	
                   System.out.println(T[i]+" "+X[i]+" "+Y[i]);
        }	
        for(i=0;i<N;i++)
        {
        	if((X[i]<=Xs)&&(Y[i]>=Yl)){
        		Xs=X[i];
        	    Yl=Y[i];
        	    y=i;}
        }
        
        System.out.println("Best worker is "+(y+1));
    }
        
        
   
}
