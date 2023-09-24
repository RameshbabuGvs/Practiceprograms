package controlstatments;

public class Switchstatment {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**int day=2;
		String day="Monday";
//switch is one statment
//if u are not declare Break statment it doesnot stop the execution
switch (day) {
case 1://condition
System.out.println("This is Number 1");
break;

case 2:
	System.out.println("This is number 2");
	break;
case 3:
	System.out.println("This is number 3");
	
	break;

default:
	System.out.println("Condition not matched:Please enter correct value");
	//break;
}**/
		
		
		String day="Monday";
		//switch is one statment
		//if u are not declare Break statment it doesnot stop the execution
		switch (day) {
		case "Monday"://condition
		System.out.println("Condition Matched: Monday");
		break;

		case "Tuesday":
			System.out.println("Condition Matched: Tuesday");
			break;
		case "Wednesday":
			System.out.println("Condition Matched: Wednesday");
			
			break;

		default:
			System.out.println("Condition not matched:Please enter correct value");
			//break;
		}

	}

}
