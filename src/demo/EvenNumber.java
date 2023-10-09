package demo;

public class EvenNumber {

	public static void main(String[] args) {
		int num=100;
		System.out.println("Even Numbers are : ");
		for(int i=0;i<=num;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
			
		}
		
		System.out.println();
		
		System.out.println("Odd numbers are : ");
		
		for(int i=0;i<=num;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
		}
	}
}
