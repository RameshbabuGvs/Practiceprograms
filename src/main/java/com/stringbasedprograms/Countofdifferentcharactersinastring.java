package com.stringbasedprograms;

import java.util.Scanner;

public class Countofdifferentcharactersinastring {
	private static Scanner sc;
	public static void main(String[] args) {
		String aldisp_str;
		int i, alph, digi, spl;
		alph = digi = spl = 0;
		
		String name="aabbc123%^";
		
		//char[] ch=name.toCharArray();
		char ch ;
		
	/*	sc= new Scanner(System.in);
		System.out.print("\nPlease Enter Alpha Numeric Special String =  ");
		aldisp_str = sc.nextLine();
		*/
		for(i = 0; i < name.length(); i++)
		{
			ch = name.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
				alph++;
			}
			else if(ch >= '0' && ch <= '9') {
				digi++;
			}
			else {
				spl++;
			}
		}		
		System.out.println("\nNumber of Alphabet Characters  =  " + alph);
		System.out.println("Number of Digit Characters     =  " + digi);
		System.out.println("Number of Special Characters   =  " + spl);
	}
}
