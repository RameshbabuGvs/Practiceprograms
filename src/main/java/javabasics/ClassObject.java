package javabasics;



public class ClassObject {
	   int x=10;
		int y=20;
		
		public  void  ClassObject() {// this non Static method
			String str="HI";
					System.out.println(str);}
		//This is Non-Static method
		public static void Nname() {
			int a=10;}
		public   ClassObject() {// this is constructor
			String str="HI am constructor";
					System.out.println(str);}
	public static void main(String[] args) {
			// TODO Auto-generated method stub
	int a=10;
		int b=20;
	//Object obj=new Object();	
	ClassObject co=new ClassObject();
	Accesmodifiers am= new Accesmodifiers();
		am.method();
		am.name();
		}

	}
