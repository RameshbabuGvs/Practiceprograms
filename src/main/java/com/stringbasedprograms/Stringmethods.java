package com.stringbasedprograms;



public class Stringmethods {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str="Ramesh";
	String str1="Ramesh";
	String str2="Rameshb";
	//charAT
	//System.out.println("This is charAT method  -- "+str.charAt(3));
	//length
	//System.out.println("length of the string value ---- "+str.length());
	/*//compare method
	System.out.println(str.compareTo(str1));
	System.out.println(str.compareTo(str2));
	System.out.println(str2.compareTo(str));

	//contains()
	
	System.out.println(str.contains(str1));
	System.out.println(str.contains("R"));
	System.out.println(str.contains("G"));
	System.out.println(str.contains("Ram"));
	*/
/*	//concat method
	System.out.println(" concat method " + str+str1);
	System.out.println(str.concat(" concat method " +str2));
	*/
	
	/*//string ends with
	String Str4="Rameshbabu";
	System.out.println(Str4.endsWith("u"));
	System.out.println(Str4.endsWith("babu"));
	System.out.println(Str4.endsWith("Ram"));
	
	// string stratswith method
	String strats="Ameena";
	System.out.println(strats.startsWith("A"));
	System.out.println(strats.startsWith("Amee"));
	
	*/
	
	//equals method
	String str5="Ram";
	String str6="Ram";
	String str7="RAM";
	String str8="RAM";
	System.out.println("equals method "+str5.equals(str6));
	System.out.println("equals method "+str6.equals(str7));
	System.out.println("equals method "+str5.equals(str7));
	System.out.println("== method "+str5==str6);
	System.out.println("== method "+str7==str8);
	System.out.println("equalsIgnoreCase "+str5.equalsIgnoreCase(str7));
	
	/*//index method
	String str8="Ramesh is tester";
	System.out.println(str8.indexOf("h"));
	System.out.println(str8.indexOf('h',5));
	System.out.println(str8.indexOf("tester"));
//charAT method
	System.out.println(str8.charAt(5));
	
	//lastindex
	String s8="Hithis is Ram";
	int index=s8.lastIndexOf('m');
System.out.println(index);
int i1=s8.lastIndexOf('t', 5);
System.out.println(i1);*/

/*//string replace method we need to use character,String also
String str9="Ramesh is";
System.out.println(str9.replace('R', 'J'));

System.out.println(str9.replace("is","Hi"));

//replace All method need to use only String no it not accepts character
System.out.println(str9.replaceAll("is", "How"));
//System.out.println(str9.replaceAll('A', 'B'));

//Split method
System.out.println(str9.split("\\s"));
String[] word=str9.split("\\s");
System.out.println(word);
// substring
String str10="Ramesh";
String str11="Elephant";
System.out.println(str11.substring(5,7));
System.out.println(str10.substring(1));
System.out.println(str10.substring(4));
System.out.println(str10.substring(2, 4));
*/
	/*
//string lower case
String str12="RAMESH";
System.out.println(str12.toLowerCase());
String str13="Ramesh";
System.out.println(str13.toLowerCase());
//String upper case
String str14="ramesh";
String str15="Ramesh";
System.out.println(str14.toUpperCase());
System.out.println(str15.toUpperCase());
//Trim
String str16="Ameena Based out of USA";
String str17=str16.trim();
System.out.println(str17);
System.out.println(str16.trim());*/
/*	
//forward string
	String str16="Ramesh";
	char[] chars=str16.toCharArray();//it converts string to character
	int length=chars.length;//it finds the length
	System.out.println(length);// it print the lenth of the value
	for(int i=0;i<length;i++) {// by using for lopp it iterates
		System.out.println(chars[i]);
	//	System.out.print(chars[i]);
	}
	//String reverse method
	String Name="RameshbabuGvs";
	char[] reverse=Name.toCharArray();
	System.out.println(reverse);
	System.out.println(Name.length());
	
	for(int i=reverse.length-1;i>=0;i--){
		
		System.out.print(reverse[i]);
	}
	*/
	String str17= "This#string%contains^special*characters&.";   
	String str18 = str17.replaceAll("[^a-zA-Z0-9]", " ");  
	System.out.println(str18);
	System.out.println(str17.replaceAll("[a-z]", ""));
	
	int i=10;
	int j=20;
    int k=i+j;
	System.out.println(k);//30
System.out.println(i=k-i);//30-10=20
System.out.println(j=k-j);//30-20=10

System.out.println(j=j-i);//20-10=10
System.out.println(i=i+j);//20
	
	}

	
}
