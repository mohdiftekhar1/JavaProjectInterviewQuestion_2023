package demo;

import java.util.Set;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
	
		
		
		
		String s1 = "Java#Selenium#TestNG#Cucumber#API#GIT";
		
		String b[] = s1.split("#", 6);
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		

	}

}
