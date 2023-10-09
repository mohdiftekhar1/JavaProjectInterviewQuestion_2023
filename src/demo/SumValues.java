package demo;

public class SumValues {

	public static void main(String[] args) {
		//Print sum of all values
		
		int arr[]={1,2,3,4,5,6,7,8,9,10};
	    
		int sum=0;
		
		for(int i=0;i<=arr.length; i++)
		{
			sum=sum+i;
		}
		
		System.out.println("The sum values are : "+sum);

	}

}
