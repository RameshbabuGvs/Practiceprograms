package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ComparetwoArraylist {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> l1=new ArrayList<>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> l2=new ArrayList<>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> l3=new ArrayList<>(Arrays.asList("A","B","C","D","E"));
		Collections.sort(l1);
		Collections.sort(l2);
		Collections.sort(l3);
		System.out.println(l1.equals(l2));
		System.out.println(l1.equals(l3));
	//	System.out.println(l2);
		//2 Compare two list  find out Additional  element
		ArrayList<String> l4=new ArrayList<>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> l5=new ArrayList<>(Arrays.asList("A","B","C","D","E"));
		
		l4.removeAll(l5);
		System.out.println(l4);//o.p--F
	//Findout Missing Elements
		l5.removeAll(l4);
		System.out.println(l5);//E
		//find out Common elements
		
		ArrayList<String> lang1=new ArrayList<>(Arrays.asList("Java","Python","Testing","dot"));
		ArrayList<String> lang2=new ArrayList<>(Arrays.asList("Java","Python","Testing","C#"));
	lang1.retainAll(lang2);
	System.out.println(lang1);
		
		
	
	}
	

}
