package com.stringbasedprograms;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Tester {

	
	 public static void main(String[] args)

	    {

	        List<String> list = new LinkedList<>();

	        list.add("Geeks");

	        list.add("For");

	        list.add("Geeks");

	        list.add("GeeksforGeeks");

	        Iterator<String> iter = list.iterator();


	        while (iter.hasNext())

	            System.out.printf(iter.next() + " ");


	        System.out.println();

	    }
}
