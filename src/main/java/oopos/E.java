package oopos;

public  class E {
	
	   static int Ramesh(){
		  int x=10;
		  int y=16;
		  int z=x+y;
		  if(z>30) {
			  System.out.println(z);
			  return z;}
		  else {
			  System.out.println(x);
			  return x; 
			  }
		//return 9;	
		}

	  public static void main(String []args) {
		int c= Ramesh(); 
		System.out.println(c);
	}}
