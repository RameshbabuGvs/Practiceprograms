package numbers;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		boolean isPrime=true;
		for(int i=2;i<=num/2;i++) {
			System.out.println(i);
		
		if(num %i==0) {
			isPrime=false;
		break;
		}
		}
		if(isPrime) {
			System.out.println(num +"is prime number");
		}
		else {
			System.out.println(num +" is not prime number");
		}
	
		/*	if(num>-1) {
			for(int i=2;i*i<num;i++) {
				if(num%2==0) {
					isPrime=false;}}
			if(isPrime) {
				System.out.println("The number "+ num +"is prime");
			}
			else {
				System.out.println("The number "+num+"is not prime");
			}}
		
		else {
			System.out.println("The number "+num+"is negative");
		}	
		*/
		
		
		
		
		
}
}

