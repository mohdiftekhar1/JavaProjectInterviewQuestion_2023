package demo;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		
		//String s1 = "Hello World";
		String s1="Big black bug bit a big black dog on his big black nose";
		
		System.out.println("Origional String is : "+s1);
		
		String s2 = "";
		
		for(int i=0;i<s1.length();i++)
		{
			char ch = s1.charAt(i);
			
			if(s2.indexOf(ch)==-1)
			{
				s2 = s2+ch;
				
				
			}
		}
		
		System.out.println("After Remove : "+s2);

	}

}
