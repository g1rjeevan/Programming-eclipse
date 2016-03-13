package Patterns;

class Pattern12
{
	public static void main(String[] args) 
	{
		int row=13,column=13;
		int mid=(row+1)/2;
	 for(int i=1;i<=row;i++)
		{
		 for(int j=1;j<=column;j++)
			{
			     if (j==1||j==row)
			     {
					 System.out.print("* "+" ");
			     }
				 else
					 System.out.print(" ");
            }
			System.out.println();

		}
	}
}