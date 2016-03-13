package tests;


import java.util.Arrays;

public class Find_the_frequency_of_the_given_array_data
{
	public static void main(String[] args) {
		int[] arr1={9,4,5,4,3,8,7,6,2,1,1,5,4,1,4,3,4,1,6,5,7,6,8,5,8,5,6,8,5,7};
		
		for(int i=0;i<arr1.length-1;i++){
			int min=i;
			for (int j = i+1; j < arr1.length; j++) {
				if(arr1[min]>arr1[j]){
					min=j;
				}
			}
			int temp=arr1[i];
			arr1[i]=arr1[min];
			arr1[min]=temp;
		}
		Arrays.sort(arr1); 
		/*either anyone*/
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+", ");
		}
		System.out.println();
		
		int count=1;
		for (int i = 0; i < arr1.length;) {
			
			for (int j = i+1; j < arr1.length; j++) {
				if(arr1[i]==arr1[j]){
					count++;
				}
			}
			if(count>=1){
				System.out.println(arr1[i]+" repeated "+count+" times");
			}
			i=i+count;
			count=1;
			
		}
	}

}
