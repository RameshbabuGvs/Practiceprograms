package com.occurances;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OccuranceofwordsinastringbyusingHashMap {
public static void main(String[] args){
		
		String str="grape is is grape son";
		int length=str.length();
		System.out.println(length);
		String [] words=str.split(" ");
		Map<String,Integer> wordMap=new HashMap<>();
		for(String st:words){
			if(wordMap.containsKey(st)){
			wordMap.put(st,wordMap.get(st)+1);
			}
			else{
				wordMap.put(st,1);
			}		
		}
		Set<String> keys=wordMap.keySet();
		for(String st:keys){
			
		if(wordMap.get(st)>1){
			//if u are want 
			System.out.println("Character "+ st+  "  repeating  "+wordMap.get(st) +"  times  ");	
		}		
		}
		}
	
	
}
