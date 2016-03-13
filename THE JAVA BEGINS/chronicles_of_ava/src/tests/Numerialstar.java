package tests;

public class Numerialstar {
	public static void main(String[] args) {
		double n=49,s=n/Math.sqrt(n);
		int line=(int)s,k=0,mid=0,l=0;
		if(n%2==0)
			l=1;
		else
			l=0;
		for (int i = 0; i <s+l; i++) {
			if(((line/2)+1)>mid){
				for (int j = 0; j < s; j++) {
					k++;
					System.out.print(k+"*");
				}
				if(k+(s-1)<n)
					k=(int) (k+s);
				else
					k=(int) (k-(s*2));
				mid++;
				System.out.println();
			}
			else{
				for (int j2 = 0; j2 < s; j2++) {
					k++;
					System.out.print(k+"*");
				}
				k=(int) (k-(s*2)-s);
				System.out.println();
			}
		}
	}
}






