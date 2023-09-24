package com.stringbasedprograms;



public class StringinAlphbeticalorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="ramesh";
char ar[]=str.toCharArray();
char temp;
for(int i=0;i<ar.length;i++) {
	
	for(int j=i+1;j<ar.length;j++) {
		
		if(ar[i] > ar[j]) {
			
			temp= ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
			}}
	

	
	
}
		
System.out.println(new String(ar));	
		
	}

}
