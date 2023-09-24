package publicpackage;

public class StaticMethod {
	
	static int n=10;
	int nm=10;
// Static method
	static void Samatha() {
		System.out.println("Static method");
	}
	//Non-Static Method
	 void Ramesh() {
		System.out.println("Non-Static method");
	}
	
	 public StaticMethod() {
		 System.out.println("This is  Constructor");
		 
	 }
	 public StaticMethod(String Name) {
		 System.out.println("This is Parametrised Constructor");
		 
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod SM=new StaticMethod();
		
		StaticMethod SM1=new StaticMethod("Ramesh");
		//SM.Ramesh();
		//SM.Samatha();
	//System.out.println(n);
	//System.out.println(SM.nm);
	}

}
