package javaclassesfrombasics;



public class LocalVaraible {
	static String ram="babu";//Static varaible

	String ram1="babu";// class Vraible 
	String Instance="New keyword";//Non-Static varaible

	public static String Sudheer="How areyou";
	public void Ramesh() {
		int a=1;//local varaible
		System.out.println(ram);
	}
	public void Sudheer() {
		int b=1;
		System.out.println(ram);	
	}
	public static void main(String[] args) {

		/*String a="12";//local varaible
		System.out.println(a);
		System.out.println(ram);
        System.out.println(Sudheer);
        LocalVaraible smatha= new LocalVaraible();//Object
		System.out.println(smatha.Instance);
		*/
		AccebilityPublic Ap=new AccebilityPublic();
		Ap.Ramesh();
		
}

}
