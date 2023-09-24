package javaclassesfrombasics;



public class MethodOverloading {

	int a;
	int b;
	int c;
	public static int add(int a,int b){//Non static Method
		
		System.out.println("Print the values");
		return a+b;
	}
public static int add(int a,int b,int c){//Non static Method
		
		System.out.println("Print the values");
		return a+b+c;
	}

public static int add(int a,int b,int c,int d){//Non static Method
	
	System.out.println("Print the values");
	return a+b+c+d;
}
public static double add(double a,double b,double c){//Non static Method
	
	System.out.println("Print the values");
	return a+b+c;
}






public static String method(String name){//Non static Method
	System.out.println("Print the values");
	return name;
}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
    MethodOverloading mo=new MethodOverloading();
     System.out.println(mo.add(10, 10));
     System.out.println(mo.add(10, 10,10));
     System.out.println(mo.add(15.6, 16.6,17.6));
    System.out.println(mo.add(10, 20, 30, 40));
   System.out.println( mo.method("Ramesh"));
	}
	/*
	public static void main(String[] args){System.out.println("Parameters method");}  
	public static void main(String args){System.out.println("main with String");}  
	public static void main(){System.out.println("main without args");}
*/

	
}