package com.stringbasedprograms;



public class Stringmethodsclass {
	public static void main(String[] args) {
		
		String s1="java";//creating string by Java string literal    
		char ch[]={'s','t','r','i','n','g','s'};    
		String s2=new String(ch);//converting char array to string    
		String s3=new String("java");//creating Java string by new keyword    
		System.out.println(s1);    
		System.out.println(s2);    
		System.out.println(s3);   
		
		
		//Append method
		StringBuilder sb1 = new StringBuilder("Hello");    //String 1  
        StringBuilder sb2 = new StringBuilder(" World");    //String 2  
        StringBuilder sb = sb1.append(sb2);   //String 3 to store the result  
            System.out.println(sb.toString());  //Displays result  
	
            //concatination method
            String sc3="Sachin ";  
            String sc4="Tendulkar";  
            String sc5=sc3.concat(sc4);  
            String sc6=new String(" World");
            System.out.println(sc6+sc3);
            System.out.println(sc5);//Sachin Tendulkar 
            System.out.println(sc3+sb1);
		String sc1="java string";    
		// The string s1 does not get changed, even though it is invoking the method      
		// concat(), as it is immutable. Therefore, the explicit assignment is required here.  
		sc1.concat("is immutable");    
		System.out.println(sc1);    
		sc1=sc1.concat(" is immutable so assign it explicitly");    
		System.out.println(sc1); 
		String sc="india is my country".concat(sc1);
		System.out.println(sc);
		
		//ends with
				String str="Welcome to Rameshbabu you";
				System.out.println(str.endsWith("you"));
				if(str.endsWith("you")) {
			System.out.println("String ends with you");
				}
				else {
					System.out.println("it doesnot ends with you");
				}
				System.out.println("Hi");
				//starts with 
				String string="HI Ramesh";
				System.out.println(string.startsWith(""));   
            

	}

}
