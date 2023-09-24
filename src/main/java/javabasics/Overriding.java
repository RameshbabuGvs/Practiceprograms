package javabasics;



public class Parent{
	public static void Surname() {
		System.out.println("Hi I am x surname");
	}
	
	public static void HouseAddress() {
		System.out.println("Hyderabad");
	}
}
public class Overriding extends Parent {
	
	public static void Surname() {
	
		System.out.println("Hi I have also my mother surname");
	
	}
	public static void HouseAddress() {
		System.out.println("I have also same mother address");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Overriding ov= new Overriding();
Parent p= new Parent();

p.HouseAddress();
ov.HouseAddress();

//p.Surname();
//ov.Surname();

		
		
	}

}

