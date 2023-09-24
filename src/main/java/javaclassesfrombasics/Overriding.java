package javaclassesfrombasics;



//Over riding also called Run time polymorphism
class AB{//Parentclass or Super class
	
public void property() {

	System.out.println("Gold Loan");
}

public void cash() {
	System.out.println("Cash in Rupees");
}

}

class BB extends AB{//child class
	public void cash() {//Non-Static method
		System.out.println("Cash in Lakhs");
		}
	}

public class Overriding{
		public static void main(String [] args) {
			
	AB ab=new AB();
	//ab.cash();//Parent class
	BB b= new BB();
	//b.cash();
	AB a=new BB();
	ab.cash();//Parent classab.
	ab.property();
	b.cash();
	
		}
		}