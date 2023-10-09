package demo;

public class DuplicateCharInString {

	public static void main(String[] args) {
		
		
		//String s1 = "Automation Testing";
		
		String s2 = "contract to Hire";
		
		char ch[] = s2.toCharArray();
		
		int count;
		
		System.out.println("Duplicate character from String");
		for(int i=0;i<s2.length();i++)
		{
			count=1;
			for(int j=i+1;j<s2.length();j++)
			{
				if(ch[i] == ch[j] && ch[i]!=' ')
				{
					count++;
					
					ch[j] ='0';
				}
			}
			

			if(count>1 && ch[i]!='0')
			{
				System.out.print(ch[i]);
			}
		}
		
		
	}

}
