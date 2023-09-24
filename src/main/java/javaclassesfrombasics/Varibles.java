package javaclassesfrombasics;



public class Varibles {

	
	int x=10;//Instance Varaible
	
	static int z=30;//Static Varaible
	
	public  void  Instance() {//method
		 int a=5;
		System.out.println(a);
	}
	public static void main(String[] args) {
		 
		int y=20;//local varaible
		System.out.println("Local Varaible" +y);
		System.out.println("Static Varaible"+z);//Static varible
		
		Varibles var=new Varibles();//Object
		
		System.out.println("Instance varible " +var.x);

	}

}
