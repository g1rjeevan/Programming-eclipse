package tests;

public class Apattern {
	public static void main(String[] args) {
		int line=6;
		for (int i = 0; i <=line; i++) {
			for (int j = 0; j <=line; j++) {
				if(i==0||j==0||j==line||i==(line/2))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
