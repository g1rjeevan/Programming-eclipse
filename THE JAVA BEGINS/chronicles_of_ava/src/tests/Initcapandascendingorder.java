package tests;

public class Initcapandascendingorder {

	public static void main(String[] args) {
		String[] s=new String[7];
		String s1="i am not a good guy";
		System.out.println(s1);
		char[] c=s1.toCharArray();
		int startIndex=0, endIndex=0,l=0;
		for (int i = 0; i < c.length; i++) {
			
				if(c[i]==32){
				endIndex=i;
				s[l]=s1.substring(startIndex,endIndex);
				System.out.println(s[l]);
				startIndex=i+1;
				l++;
				}
			}
			endIndex=c.length;
			s[l]=s1.substring(startIndex,endIndex);
			System.out.println(s[l]);
			char[] c1 = {0, 0, 0, 0, 0, 0, 0, 0};
			
			for (int r = 0; r <=l; r++) {
				char[] y=s[r].toCharArray();
				
				c1[r]=y[0];
				
			}
			String temp;
			
			for(int h=1;h<l;h++){
				for (int i = h+1; i <l-h; i++) {
					if(c1[h-1]>c1[h]){
						temp=s[h-1];
						s[h-1]=s[h];
						s[h]=temp;
				}
				}
			}
			for (int i = 0; i<=l; i++) {
				System.out.print(s[i]+" ");
			}
			
	}
}
	

