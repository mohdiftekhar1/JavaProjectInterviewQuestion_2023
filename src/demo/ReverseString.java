package demo;

public class ReverseString {

	public static void main(String[] args) {
		
		String s1 = " Automation Engineer in Knowaysys Consulting Solution";
		
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			System.out.print(s1.charAt(i));
		}
		System.out.println();
		
		System.out.println("===============================================");
		
		String s2 = " Automation Tester using Selenium Tool";
		String b[]  =s2.split(" ");
		
		for(int i =b.length-1;i>=0;i-- )
		{
			System.out.print(b[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("********************************************************");
		
		String s3 = " Automation Tester using Selenium Tool";

		String c [] = s3.split(" ");
		
		String d ="";
		
		for(int i=c.length-1;i>=0;i--)
		{
			for(int j=0;j<c[i].length();j++)
			{
				d = c[i].charAt(j)+d;
			}
			d = " "+d;
		}
		System.out.println(d);
		
	}

}
