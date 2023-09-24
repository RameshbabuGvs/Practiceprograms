package numbers;

import java.util.Scanner;
//output=153
public class Armstrongnumber {
	public static void main(String[] args) 
	   {
	      int number, originalNumber, remainder, result = 0;
	      Scanner in=new Scanner(System.in);
	      System.out.println("Enter the number");
	      number=in.nextInt();
	      
	      originalNumber = number;
	      while (originalNumber != 0)
	      {
	         remainder = originalNumber % 10;
	         result = result + (remainder*remainder*remainder);
	         originalNumber =originalNumber/ 10;
	      }
	      if(result == number)
	         System.out.println(number + " is an Armstrong number.");
	      else
	         System.out.println(number + " is not an Armstrong number.");
	   
		/*
		int n=153;
		int temp=n;
		int r,sum=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+(r*r*r);
			if(temp==sum) {
				System.out.println("it is armstrong number");
			}
			else

				System.out.println("it is not armstrong number");
			}*/
		}
	   
	   }

