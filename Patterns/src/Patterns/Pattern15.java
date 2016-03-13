class Pattern15 
{
	public static void main(String[] args) 
	{
		int row=5,column=5,k=4;
		for(int i=0;i<=row;i++)
		{
		for(int j=0;j<=(column+k);j++)
			{
			System.out.print(" ");
			}
		System.out.println("*");
		k--;
		}

	}
}
