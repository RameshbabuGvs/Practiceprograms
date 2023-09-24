package javabasics;



public class ParameterizeddnonParameterized {
	public static void parameterized() {
		String str="This is a not parameterized method";	
		System.out.println(str);
	}
	
	public static void Parameterizedstaticmethod(String name, String classname) {
		String str="This is a Parameterized static method";
		//System.out.println(str);
		
		System.out.println(classname+name);
	}
	
	public void Nonstaticparameret(String Section,String Marks) {
		System.out.println(Section+Marks);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameterizedstaticmethod("Venkat", "CSC");
		parameterized();
		
ParameterizeddnonParameterized pm=new ParameterizeddnonParameterized();
pm.Nonstaticparameret("A", "100");
pm.Nonstaticparameret("BSC", "200");
pm.Nonstaticparameret("CEC", "90");
		
		
	}

}
