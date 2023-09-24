package pavanclasses;

public class MethodOverloading {

	public void sum(){
		
		System.out.println("First Program");	
	}
	
	public void sum(int a){
		
		System.out.println("Single Parameter");
	}
	public void sum(int a, int b){
		
		System.out.println("Double parameter");
		System.out.println(a+b);
	}
	
	public static void main(String[] args){
		MethodOverloading obj=new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 20);
		
		
	}
}
