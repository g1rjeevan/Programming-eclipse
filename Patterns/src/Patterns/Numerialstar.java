package Patterns;

public class Numerialstar {

	public static void main(String[] args) {
		int count=0,n=25,i=0,l=5,r=0;
		
			while(i<n){
				i++;
				System.out.print(i+"*");
				
				count++;
				if(count==(n/l)){
				i=i+l;
				count=0;
				r++;
				System.out.println();
				}
		}
			i=i-(l*r-1);
			for(int k=0;k<l*2;k++){
				
				System.out.print(i+"*");
				i++;
				count++;
				if(count==l){
				i=i-(l*r);
				count=0;
				System.out.println();
				}
			}
			
	}
}

