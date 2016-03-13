package Patterns;

public class Pascalstar {
	public static void main(String[] args) {
		int line=12,n=1,space=line-1;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j <=space; j++) {
				System.out.print(" ");
			}
            for (int j = 0; j < n; j++) {
					System.out.print("*"+"   ");
			}
            n++;
            space=space-2;
			System.out.println();
		}
	}
}
