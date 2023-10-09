package demo;

public class CountVowelConsonant {

	public static void main(String[] args) {
		
		String s1 = "Hello world";
		
		s1 = s1.toLowerCase();
		int vCount=0,cCount =0;
		
		for(int i=0;i<s1.length();i++)
		{
			
			if(s1.charAt(i) == 'a' || s1.charAt(i) =='e' || s1.charAt(i) =='i' 
					||s1.charAt(i) =='o' || s1.charAt(i) =='u')
				
			{
				
				vCount++;
				
			}
			
			else if(s1.charAt(i)>'a' && s1.charAt(i) <='z')
			{
				cCount++;
			}
		}
		
		System.out.println("Number of Vowels : "+vCount);
		System.out.println("Number of consonant : "+cCount);

	}

}
