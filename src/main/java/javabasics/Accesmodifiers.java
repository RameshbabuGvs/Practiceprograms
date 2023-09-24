package javabasics;



public class Accesmodifiers {

	public void method() {
		System.out.println("Hi I am public  method");
	}
	
	private static int a=10;
	
	protected void name() {
		System.out.println("Hi I am protected method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//public,Private ,Protected
		System.out.println(a);
		Accesmodifiers am=new Accesmodifiers();
		am.name();

	}

}

