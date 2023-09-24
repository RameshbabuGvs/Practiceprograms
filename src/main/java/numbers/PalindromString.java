package numbers;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a String");
		
		//String str=sc.next();
		String str="KAK";
		String OriginalString=str;
		
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--){
			rev=rev+str.charAt(i);}
		if(OriginalString.equals(rev)){
			System.out.println("It is Palindrome String  "+rev);}
		else{
			System.out.println("It is Nor Palindrome String");
		}
		//System.out.println("Palindrome String  " + rev);
		}
}
