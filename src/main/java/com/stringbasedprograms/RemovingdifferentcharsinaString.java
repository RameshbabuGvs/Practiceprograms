package com.stringbasedprograms;



public class RemovingdifferentcharsinaString {
	public static void main(String args[])   
	{ 
		//Removing white spaces
		String s1="  hello string java   ";  
		System.out.println(s1+"javatpoint");//without trim()  
		//System.out.println(s1.trim());//with trim()
	System.out.println("Sucessfully removed white spaces in a Character"+s1.replaceAll("\\s", ""));
	String str1="$THIS java&string%programs^&123";
	String str2="Ramesh1%%";
		//RemovingSmallCharacters
			System.out.println("Sucessfully removed Small letter "+str1.replaceAll("[a-z]", ""));
			
			//RemovingSpecialCharacters
			System.out.println("Sucessfully removed Special Characters "+str1.replaceAll("[^a-zA-Z0-9]", ""));
			
			//RemovingCapitalCharacters
			System.out.println("Sucessfully removed Capital Characters "+str1.replaceAll("[A-Z]", ""));
			//RemovingNumbersinString
			System.out.println("Sucessfully removed Numbersin String "+str1.replaceAll("[0-9]", ""));
			
	
	
	
	
	}  
}



