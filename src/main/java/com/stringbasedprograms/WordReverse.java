package com.stringbasedprograms;



public class WordReverse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String str="This is Rameshbabu";
		String str1="";
		String a[]=str.split(" ");
		
		for(int i=0;i<a.length;i++){
		System.out.print(a[i]+" ");}
		
		System.out.println();
		
		for(int i=a.length-1;i>=0;i--){
			System.out.print("Reverse of word "+a[i] +" ");}
		*/
		
		String inputstring="Ram is good";
		System.out.println(" Before String: "+inputstring);
		char[] chars=inputstring.toCharArray();
		int length=chars.length;
		System.out.println(length);
		
		//Method1
		for(int i=length-1;i>=0;i--){
		System.out.print(chars[i]);
		}
		System.out.println();
		
		 //Method2 
		String reverseword=""; 
		for(int i=length-1;i>=0;i--){
		reverseword=reverseword+inputstring.charAt(i); }
		System.out.println("Method2 "+reverseword);
		
		 //Method3 System.out.println("\n-------------------");
		StringBuffer stringbuffer=new StringBuffer(inputstring);
		System.out.println("Method3 "+stringbuffer.reverse());
		

		
	
	
	}
	
	
}
