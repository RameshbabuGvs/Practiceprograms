package arrays;

import java.util.ArrayList;

public class Stringarraylist {
	public static void main(String[] args) {
		
		String s1="Ramesh";
		ArrayList<String>list=new ArrayList<>();
		list.add("Ravi");
		list.add("Teja");
		list.add("kumar");
		list.add("Ramesh");
		for(String data:list) {
			if(data.equals(s1)){
				System.out.println("data is matched");
			}
			else {
				System.out.println("data is not mathced");
			}
		}

	}}
