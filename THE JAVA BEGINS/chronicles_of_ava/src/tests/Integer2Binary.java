package tests;

public class Integer2Binary {
	public static int[] b;
	public static int[] main(int args) {
		b = new int[8];
		int rem,n=args;
		int i=0;
		while(n>=1){
			rem=n%2;
			b[i]=rem;
			n=n/2;
			i++;
		}
		System.out.println("128\t64\t32\t16\t8\t4\t2\t1");
		System.out.println("---------------------------------------------------------");
		for (int j = b.length-1; j>=0  ; j--) {
			System.out.print(b[j]+"\t");
		}
		System.out.println();
		return b;
	}
}
