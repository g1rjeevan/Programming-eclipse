class Pattern13
{
	public static void main(String[] args) 
	{
		int row=13,column=13;
		
	 for(int i=1;i<=row;i++)
		{
		 for(int j=1;j<=column;j++)
			{
			     if (j==1||j==row||i==j||i==(column-j+1))
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