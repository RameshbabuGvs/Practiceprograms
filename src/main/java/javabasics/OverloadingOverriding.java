package javabasics;



public class OverloadingOverriding {
	public static void Student() {
		System.out.println("HI Iam student");	
			
		}

		public static void Student(String Fname,String lname) {
			System.out.println(Fname+lname);
			
		}
		public static void Student(int marks,int rollno) {
			System.out.println(marks+rollno);
		}
		public static void Student(int number,String subject) {
			System.out.println(number+subject);
		}

		public static void Student(int number,String subject,String Class) {
			System.out.println("Number---  "+number+" Subject--- "+subject+ "  CLass --- "+Class);
		}
		
		public static void main() {
			System.out.println("It is not fully main methid ");
			
		}
		public static void main(String args) {
			System.out.println("It is not fully main methid ");
			
		}
		public void Student(int number) {
			System.out.println(number);
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Student();
	Student(10, 20);
	Student("Ram", "G");
	Student(10, "Science", "CSC");
	OverloadingOverriding Ov=new OverloadingOverriding();
	Ov.Student(10);
		}

}
