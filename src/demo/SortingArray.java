package demo;

public class SortingArray {

	public static void main(String[] args) {
		
		int arr[] = {12,32,9,20,10,56,67,45};
		
		int temp;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j] > arr[j+1])
				{
					
					//swap
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		//print array
		System.out.println("Array sort in ascending order");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		 // System.out.println("Max 3rd array is : "+arr[arr.length-3]);

	}

}
