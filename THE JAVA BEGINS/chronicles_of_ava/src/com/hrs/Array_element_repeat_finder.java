package com.hrs;

public class Array_element_repeat_finder {

	public static void main(String[] args) {

		int arr[]={1,3,2,2,2,3,3,3,4,3};
		int count=1;
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++)

		{
			for(int j=0;j<arr.length;j++)
			{
				if(i==j)
					j++;
				if(arr[i]==arr[j])
					count++;
			}
			System.out.println(arr[i]+" repeated "+count);
			
			i=i+count;
			count=1;
		
}
}                                                                                                    
}
