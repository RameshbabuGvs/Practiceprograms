package com.occurances;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Occuranceofcharacters {

	public static void main(String[] args){
		String str="Rameshbabuu";
		int length=str.length();
		System.out.println(length);
		char[] chars=str.toCharArray();
		Map<Character,Integer> charMap=new HashMap<>();
		for(Character ch:chars){
		if(charMap.containsKey(ch)){
		charMap.put(ch,charMap.get(ch)+1);}
		else{
		charMap.put(ch,1);}}
		Set<Character> keys=charMap.keySet();
		for(Character ch:keys){
		if(charMap.get(ch)>1){
System.out.println
(" Character "+ch+" repeating "+charMap.get(ch) +" times  "); }}
}
	

		//occurance of characters by using hashmap
		/* public static void main(String[]args) { 
			  String str="grapee";
		  Map<Character,Integer> charMapCount=new HashMap<>();
		  for(Character c: str.toCharArray()) {
			  if(charMapCount.containsKey(c)) {
		  charMapCount.put(c, charMapCount.get(c)+1); 
		  } 
			  else { charMapCount.put(c, 1);
			  }
		  } System.out.println("Occurance of characters are  "+charMapCount); }
		  */
		 
	
}


/*output:10
Character a  repeating  2  times  
Character b  repeating  2  times*/ 	
			
		
		
		
		
	
	
