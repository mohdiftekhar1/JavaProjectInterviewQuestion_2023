package demo;

public class MaxArray {

	public static void main(String[] args) {
		
		int arr[] = {12,34,23,45,67,13,456,78,98};
		
		int max=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
		

	}

}
