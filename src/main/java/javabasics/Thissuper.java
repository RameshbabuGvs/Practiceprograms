package javabasics;



class P{//Parent class
	int  phnumber;
	String name;
	String Grade;
	int Age;
	String subject;
	String s="ParentVariable";
	
	
	P(){//parent constructors
		System.out.println("Non Parameterised constructor");}
	
P(int x){
System.out.println(this.s);
	//this();//current class constructor 
	System.out.println("hello");
	}

public static void Ram() {
	System.out.println("HI");
}
P(int x, String n){//Parameterized Constructor
	
	this();//this()means it call current class constriuctor
	
	
	phnumber=x;
	name=n;
	System.out.println("Phoneumber: " +phnumber +" Name: "+ name);
}

   public void m() {
		
		System.out.println(this.s);}

}

class C extends P{//Child class
	String s="Child Variable";//varible
	
	C(){
		System.out.println("Child class");
	}
	public void m1() {
		
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
System.out.println(super.Age);
super.Ram();

	}}


public class Thissuper {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
P p= new P();
C c= new C();
P c1= new P(10,"Ram");
c.m1();

	}

}





