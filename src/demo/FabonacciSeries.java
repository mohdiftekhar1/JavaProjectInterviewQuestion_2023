package demo;

public class FabonacciSeries {

	public static void main(String[] args) {
		
		int num=10;
		
		int a=0;
		int b=1;
		int c;
		
		for(int i=0;i<=num;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			
			a=b;
			b=c;
					
		}
	}

}
