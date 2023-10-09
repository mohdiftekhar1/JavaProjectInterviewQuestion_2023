package demo;

public class MinArray {

	public static void main(String[] args) {
		
		int arr[] = {12,32,9,20,10,56,67,45};
		
		int minNum=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] < minNum)
			{
				minNum = arr[i];
			}
		}
		System.out.println("Minimum number are : "+minNum);

	}

}
