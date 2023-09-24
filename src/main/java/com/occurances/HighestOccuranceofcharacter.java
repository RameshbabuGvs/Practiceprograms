package com.occurances;
public class HighestOccuranceofcharacter {
	public static void main(String[] args) {
		String highestOccStr="aabbbbbbbbcccccab";
		int i, max = 0;
		int[] charFreq = new int[256];
		for(i = 0; i < highestOccStr.length(); i++)
		{
			charFreq[highestOccStr.charAt(i)]++;
		}
		for(i = 0; i < 256; i++) {
			if(charFreq[i] > charFreq[max]) {
				max = i;}}
		//System.out.format("The Highest Occurring Character = %c",  max);
		
		System.out.format("\n'%c' Higest Character Occurs %d Times ", max, charFreq[max]);	
	}
}
