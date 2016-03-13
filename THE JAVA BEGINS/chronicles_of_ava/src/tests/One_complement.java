package tests;

public class One_complement {

	public static int[] main(int args) {
		int[] o=new int[8];
		o=Integer2Binary.main(args);		
		System.out.println(o);
		System.out.println("---------------------------------------------------------");
		System.out.println("1's complement");
		System.out.println("---------------------------------------------------------");
		for (int k = o.length-1; k >=0; k--) {
			if(o[k]==1){
				o[k]=o[k]*0;
			}
			else if(o[k]==0){
				o[k]=1;
			}
		}
		for (int j = o.length-1; j>=0  ; j--) {
			System.out.print(o[j]+"\t");
		}
		System.out.println();
		System.out.println("---------------------------------------------------------");
		return o;
	}
}
