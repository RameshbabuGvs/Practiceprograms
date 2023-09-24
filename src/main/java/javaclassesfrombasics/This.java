package javaclassesfrombasics;



public class This {
static String section="ECE-A";
	int n=10;
	public  void Method() {
		System.out.println("it calls current class Varaibles");
		System.out.println(this.section);
		this.Method1();}
	public  void Method1() {
		System.out.println("it is Method");
		//System.out.println(this.section);
		}
	public void  Method2() {
		System.out.println("it calls current class Method");
		this.Method();
		}
	// This constructor
	public This(){
		int a=10;
		String name="Samatha";
		System.out.println(a);
		System.out.println("Current class Constructor  "+name);}
	
	public This(String City){
		System.out.println(City);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      This t=new This();
      This t2=new This("USA");
             t.Method2();	}}
