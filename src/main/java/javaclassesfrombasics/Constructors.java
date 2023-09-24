package javaclassesfrombasics;



public class Constructors {
	/*public  Constructors() {
	String str="This is a Constructor";
	System.out.println(str);
}*/
public  Constructors(String name) {
	String str="This is a Constructor";
	System.out.println(name);
}

public static void Constructors1() {
	System.out.println("This is a Method");
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Constructors c=new Constructors("Ramesh");
	

}

}