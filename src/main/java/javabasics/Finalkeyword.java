package javabasics;



public class Finalkeyword {
	int speedlimit=90;//final variable  
	
	 void run(){  
	  speedlimit=400;  
	 }  
	 public static void main(String args[]){  
		 Finalkeyword obj=new  Finalkeyword();  
	 obj.run();  
	 }  
}
