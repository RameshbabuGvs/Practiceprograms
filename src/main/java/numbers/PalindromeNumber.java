package numbers;

import java.util.Scanner;

//Palindrome number in java: A palindrome number is a number that is same after reverse. 
//For example 545, 151, 34543, 343, 171, 48984 are
public class PalindromeNumber {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		//int num=sc.nextInt();
		int num=121;
		int orginalNumber=num;
		int rev=0;
		while(num!=0){
			
			rev=rev*10+num%10;
			num=num/10;
			
		}
		if(orginalNumber==rev){
	System.out.println("It is a PalindromeNumber");}
		else{
				System.out.println("It is a Not Palindrome Number");}
		System.out.println(rev);}
}

