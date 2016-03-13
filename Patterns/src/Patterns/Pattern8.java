class Pattern8 
{
	public static void main(String[] args) 
	{
		int row=13,column=13,mid=(column+1)/2;
	 for(int i=1;i<=row;i++)
		{
		 for(int j=1;j<=column;j++)
			{
			     if (i==mid||j==mid)
			     {
					 System.out.print("*");
			     }
				 else
					 System.out.print(" ");
            }
			System.out.println();

		}
	}
}