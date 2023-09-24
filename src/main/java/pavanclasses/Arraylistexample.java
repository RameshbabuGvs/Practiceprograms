package pavanclasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arraylistexample {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			
			ArrayList<String> ar1=new ArrayList<String>();
			ar1.add("java");
			ar1.add("Python");
			ar1.add("Selenium");
			ar1.add("Testing");
			
			ArrayList<String> ar2=new ArrayList<String>();
			ar2.add("Tosca");
			ar2.add("devops");
			//System.out.println(ar1);
			//System.out.println(ar2);
			//ar1.addAll(1, ar2);
			ArrayList<String>ar3= new ArrayList<String>();
			ar3.add("Ram");
			ar3.add("Mahesh");
			ar3.add("Kumar");
			/*ar1.addAll(1, ar2);
			System.out.println(ar1);
			//ar1.clear();
	        //System.out.println(ar1);
	*/        ArrayList<String> cloneList=(ArrayList<String>)ar1.clone();
	          System.out.println(cloneList);
	          
	          System.out.println(ar1.contains("Python"));
	          System.out.println(ar1.contains("C"));
	          System.out.println(ar1.indexOf("java")>1);
	        ArrayList<String> list1=new ArrayList<String>(Arrays.asList("Java","Selenium","Tosca","Katalon","Java"));
	        System.out.println(list1);
	        int i =list1.lastIndexOf("Katalon");
	        System.out.println(i);
	    
	        System.out.println(list1.remove(1));
	        System.out.println(list1.remove("Tosca"));
	        System.out.println(list1);
	        ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
	        numbers.removeIf(num -> num%2==0);
	        System.out.println(numbers);
	        
	        ArrayList<String> nameslist=new ArrayList<String>(Arrays.asList("Naveen","Tom","Peter","Steven","Tom"));
	        System.out.println(nameslist);
	        nameslist.retainAll(Collections.singleton("Tom"));
	        System.out.println("Repeted word are  "+nameslist);
	        
		}

	}

	

