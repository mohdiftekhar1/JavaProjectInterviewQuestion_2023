package demo;

public class RemoveDuplacyArray {

	public static void main(String[] args) {
		
		int arr[] = {12,23,34,54,12,56,78,56,23};
		
		//sort array
		
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				//swap
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
		
		
		
		
		int temp1[] = new int [arr.length];
		
		int j=0;
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i] != arr[i+1])
			{
				temp1[j]=arr[i];
				j++;
			}
		}
		temp1[j] = arr[arr.length-1];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(temp1[i]+" ");
		}

	}

}
