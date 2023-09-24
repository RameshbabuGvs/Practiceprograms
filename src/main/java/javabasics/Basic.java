package javabasics;

public class Basic {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// data types and varaibles
		int i=10;
		int j=10; // int should be only numbrs with out point values
		float f=100.5f;//float should be we can declare point values and declare f
		
		String str="Ramesh";
		
		int v=10;
		
		String str1="Ramesh";//String should very "double quotes"
		char ch='A';// every time charcater should single quote

	
//Operators
		//Addition operator
		int k=10;
		int m=20;
		 int l=k+m;
		
		 
		 System.out.println("Addition operator value -->  "+l);
		 //Substraction
		 int s=m-k;
		 System.out.println("Substraction value --> "+ m);
		 //Multiplication
		 int mul=k*m;
		 System.out.println("Multiplication value --> "+mul);
		 //division
		 
		 int div=m/k;
		 System.out.println("division value --> "+div);
		// 5.Reminder ‘%’ 
		 int re=m%k;
		 System.out.println("5.Reminder ‘% value --> "+re);
		 
		
		//equlaity operators
		 
		 String string1="Ram";
		 String string2="Ramesh";
		 String string3="Ram";
		 
		 System.out.println(string1==string2);
		 
		 System.out.println(string1!=string3);
		 
		 System.out.println(string1=string3);
	}

}
