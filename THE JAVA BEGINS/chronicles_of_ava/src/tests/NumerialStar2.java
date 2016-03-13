package tests;

public class NumerialStar2 {

	public static void main(String[] args) {
		int n=25,count=0,row=0,l=5;
		for (int i = 1; i <=n; i++) {
			row++;
			
			for (int j = 1; j <=l; j++) {
				System.out.print(i+"*");
				i++;
				count++;
				if(count==l)
				{
					i=i+l;
					System.out.println();
					count=0;
					i--;
				}
			}
		}
		int i=row*l-(l-row)-1;
		count=0;
		
		for (int j = 0; j <l-row; j++) {
			
			for (int k = 1; k <=l; k++) {
				
				
				System.out.print(i+"*");
				i++;
				count++;
				if(count==l)
				{
					i=l;
					System.out.println();
					
					
				}
				
			}
		}
		System.out.println();
	}
}

