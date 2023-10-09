package demo;

import java.util.Arrays;

public class FindMax123Array {

	public static void main(String[] args) {
		
		int arr[] = {12,34,23,45,67,13,456,78,98};
		
		//Sort Array using array method
		//Arrays.sort(arr);
		
		//sort array without using array method
		
		int temp;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					//swap
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		//print array
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//find max 3rd array.
		System.out.println("Max 3rd Array "+arr[arr.length-3]);
		
		
		
		

	}

}
