package com.stringbasedprograms;


public class Swapping {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		System.out.println("Before Swapping the values are "+a+" "+b);

		
		 /*// Logic1
		  
		 int c=a;
		 a=b;
		 b=c;
		 System.out.println("With Third Variable"+c+""+a+""+b);
		 */
		
            //Logic2		
		 //With out Using Third Variable
		 a=a+b;//10+20=30
		 b=a-b;//30-20=10
		 a=a-b; //30-10=20
		 System.out.println("With Third Variable" +b+ " "+a);
		
		
		
		/*//Logic3
		//Without using Third Varaible
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("Without using Third varible" +a+ " "+ b);
		*/
		 
	/*	//Logic 4
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("Without using Third varible" +a+ " "+ b);
		*/
		
	}

}
