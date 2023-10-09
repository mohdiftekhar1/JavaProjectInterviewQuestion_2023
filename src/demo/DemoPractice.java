package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DemoPractice {

	public static void main(String[] args) {
		
		//write java program to find multiple occurance of character.
				String s = "aaaaaaaaaabbcccccccccccccdddd";
				
				ArrayList<Character> al = new ArrayList<>();
				
				for(int i=0;i<s.length();i++)
				{
					al.add(s.charAt(i));
				}
				
				HashMap<Character, Integer> hm = new HashMap<>();
				for(int i=0;i<s.length();i++)
				{
					hm.putIfAbsent(al.get(i), Collections.frequency(al, al.get(i)));
				}
				
				for(Map.Entry<Character, Integer> e :hm.entrySet())
				{
					System.out.println("Character is : "+e.getKey() +" and Its count is : "+e.getValue());
				}
				
				
				
				
				
	}

}
