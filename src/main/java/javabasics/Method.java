package javabasics;



public class Method {
	int x=10;//Non -static varaible
	static int y=20;//Static varaible



	public static void Begum1() {//Static method
		System.out.println("I am a Static Method");}


		public void Begum() {//Non static method
			System.out.println("I am Non-static method");}
		
		
		
		public void Begum2() {//Non Static method alos
			Begum();
			System.out.println("I am Non-static method");}
		

		public Method() {//COnstructor
			System.out.println("Iam a Constructor");}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	int a=5;
	System.out.println(a);
	Begum1();

	System.out.println(y);
	Method method=new Method();
	System.out.println(method.x);//by using object we are calling non stat varaible
	method.Begum();//by using object we are calling non static method
	method.Begum2();


		}

}
