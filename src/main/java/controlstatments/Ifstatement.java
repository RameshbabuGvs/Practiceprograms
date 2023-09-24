package controlstatments;

public class Ifstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=5;
		int y=5;
		int z=x+y;
		System.out.println(z);
		
		if(z<10) {
			
			System.out.println("z value is less than 10");
		}
		else if(z==10){
			System.out.println("Z is  equal 10");
		}
		else {
			System.out.println("z is enot eqal");
		}
	}

}
