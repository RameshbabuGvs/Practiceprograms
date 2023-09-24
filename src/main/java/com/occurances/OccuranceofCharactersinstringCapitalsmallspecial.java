package com.occurances;

public class OccuranceofCharactersinstringCapitalsmallspecial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="RameshBabu@123%$";
		int length=str.length();
		System.out.println(length);
		int Upper=0;int Lower=0; int number=0;int Special=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A'&& ch<='Z') {
				
				Upper++;	}
			else if(ch>='a' && ch<='z') {
				Lower++;
				}
			else if(ch>='@'&& ch<='%') {
				number++;}
			else Special++;
			}
		
		System.out.println("Upeer case character: "+Upper);
		System.out.println("Lower case character: "+Lower);
		System.out.println("number case character: "+number);
		System.out.println("Special case character: "+Special);
		
		
		
		
		}

	}

