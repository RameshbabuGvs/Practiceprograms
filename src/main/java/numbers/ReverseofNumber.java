package numbers;
public class ReverseofNumber {
	public static void main(String[] args)   
	{  
	int number = 987654, 
			reverse = 0;  
	while(number != 0)   
	{  
	int remainder = number % 10;  
	reverse = reverse * 10 + remainder;  
	number = number/10;  
	}  
	System.out.println("The reverse of the given number is: " + reverse);  
	}  
		
		
		
		
		
		/*//Logic 2
		//String Builder
		StringBuilder sb1=new StringBuilder();
		sb1.append(num);
		StringBuilder rev =sb1.reverse();
		
		System.out.println("Reverse Number is"+rev);
*/
}
