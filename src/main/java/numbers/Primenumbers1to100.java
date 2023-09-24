package numbers;

public class Primenumbers1to100 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=2;i<=100;i++) {
			boolean isPrimeNumber=true;
			for(int j=2;j<i;j++) {
				
				if(i%j==0) {
					isPrimeNumber=false;
					break;}}
			
		if(isPrimeNumber) {
			System.out.println(i+" it is prime number ");}
		else {System.out.println(i+" it is not prime number ");}
		}
		
	}
}
