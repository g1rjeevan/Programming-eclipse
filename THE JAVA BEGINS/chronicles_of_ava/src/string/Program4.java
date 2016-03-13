package string;

import java.util.Scanner;

class Program4 
{
	public static void main(String[] args) 
	{
		int lines,stars,c,d;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number of lines");
		lines = in.nextInt();

		stars = lines;

		c = 1;
		d = lines;

		int mid = (lines+1)/2;

		for(int i = 1; i <= lines; i++)
		{
			for(int j = 1; j <= stars; j++)
			{
				if(j == 1 || j == i || j == lines-i+1|| j == lines)
				{
					System.out.print("*");
				}
				else if((j > 1 && j < c) || (j < lines && j > d))
				{
					System.out.print("-");
				}
				else
					System.out.print(" ");
			}

			System.out.println();

			if(i < mid)
			{
				c++;
				d--;
			}

			else
			{
				c--;
				d++;
			}
		}
		in.close();

	}
}
