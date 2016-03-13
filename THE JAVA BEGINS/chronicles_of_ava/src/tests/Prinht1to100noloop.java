package tests;

public class Prinht1to100noloop {

	public static void main(String[] args) {
		int n=1;

	Bitch.call(n);
	}
}
class Bitch{
	static int call(int n){
		if(n==100){
			System.out.println(n);
		return 0;
		}
		
		System.out.println(8*n);
		n++;
		return call(n);
		}
}