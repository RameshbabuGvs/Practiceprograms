package javabasics;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A=20;
		int X=20;
		
		
		  if (A<X) { System.out.println("A value is small compare to X"); } else if
		  (A==X) {
		  
		  System.out.println("A values is equal to X"); }
		  
		  else { System.out.println("A values is big compare  to X"); }
		  
		  System.out.println("forwad order"); //for loop
		  //1.intiliztion,2.Condition,3.ending value
		  
		  for(int i=0;i<=10;i++) {
		  System.out.println(i); }
		  
		  System.out.println("Reverse order"); 
		  
		  for(int j=10;j>=0;j--) {
		  System.out.println(j); }
		  //Logical operators in java
		  
		  int a=10;
		  int b=5;
		  int c=20;
		  System.out.println(a<b&&a<c);//false&true=flase
		  System.out.println((a<b||a<c));
		   
	
	}

}

