package javaclassesfrombasics;



class P{//Parent class
	int  phnumber;
	String name;
	String Grade;
	int Age;
	String subject;
	String s="ParentVariable";
	public P(){
		System.out.println("Non Parameterised constructor");}
	public P(int x){
//this();//current class constructor 
		System.out.println("hello");
	}
P(int x, String n){//Parameterized Constructor
	this();
	phnumber=x;
	name=n;
	System.out.println("Phoneumber: "+phnumber+" Name: "+ name);
}
public void m() {	System.out.println(this.s);}
}
class Thissuper extends P{//Child class
	String s="Child Variable";//varible
		public void m1() {
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);}
		//}
//public class Thissuper {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//P p= new P();
		Thissuper c= new Thissuper();
P c1= new P(10,"Ram");
c.m1();}}

  