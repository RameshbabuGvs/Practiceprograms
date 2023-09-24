package com.stringbasedprograms;
public class Withoutforlopprint1to100 {
	//withrecursivemethod
		public static void printnumber(int number,int endingnumber) {
			if(number<=endingnumber) {
				System.out.println(number);
			number++;
			printnumber(number,100);
			
			}
			
		}
	  public static void main(String args[]) 
	  {
	      printnumber(5, 100);
		  
	  }
}
