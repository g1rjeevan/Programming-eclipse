package tests;

public class Two_complement {

	public static void main(String[] args) {
		int[] t=new int[8];
		t=One_complement.main(176);
		System.out.println(t);
		
		t[0]=t[0]+1;
		if(t[0]==2){
			t[0]=0;
		}
		for (int i = t.length-1; i >=0 ; i--) {
			System.out.print(t[i]+"\t");
		}
		System.out.println();
		System.out.println("---------------------------------------------------------");
	}
}
