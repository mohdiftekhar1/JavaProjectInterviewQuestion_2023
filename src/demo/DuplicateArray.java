package demo;

public class DuplicateArray {

	public static void main(String[] args) {
		
		int arr [] = {12,32,43,12,34,54,34,43,67,32};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i] == arr[j] && i!=j)
				{
					System.out.print(arr[j] +" ");
				}
			}
		}

	}

}
