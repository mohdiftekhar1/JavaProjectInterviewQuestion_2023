package demo;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int a = 123456789;
		
		String b = Integer.toString(a);
		
		System.out.println("Reverse Number are: ");
		for(int i=b.length()-1;i>=0;i--)
		{
			System.out.print(b.charAt(i));
		}
		
		System.out.println("=============================================");

		int num = 123456;
		int rev = 0;
		
		while(num!=0)
		{
			int remainder = num%10;
			rev=rev*10+remainder;
			num=num/10;
			
		}
		System.out.println("reverse Number is : ");
		System.out.print(rev);
		
		
	}

}
