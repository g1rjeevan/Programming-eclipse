class Pattern3
{
	public static void main(String[] args) 
	{
		int row=4,column=4,a=1,b=6;
	 for(int i=1;i<=row;i++)
		{
		 for(int j=1;j<=column;j++)
			{
			if(a<b)
				{
                 System.out.print(a);
				 a++;
				}
            else
				{
				System.out.print(a);
				b--;
				a=1;
				}
				
			}
			System.out.println(" ");

		}
	}
}