package demo;

public class PrintUpperCase {

	public static void main(String[] args) {
		
		String s = "I Am Software Engineer";
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(ch>='A' && ch<='Z')
			{
				System.out.print(ch);
			}
			
		}
		

	}

}
