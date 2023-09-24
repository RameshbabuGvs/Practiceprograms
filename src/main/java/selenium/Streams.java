package selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Streams {
	//@Test
		public void regular(){
		ArrayList<String> names = new ArrayList<String> ();

		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Anand");
		//names.add("Ram");
		int count =0;
		
		for(int i=0;i<names.size();i++){
			
			String actual = names.get(i);
			if(actual.startsWith("A")){
				
				count++;
				}
			}
		System.out.println(count);
		}
		
		//@Test
		public void streamFilter(){
			ArrayList<String> names = new ArrayList<String> ();

			names.add("Abhijeet");
			names.add("Don");
			names.add("Alekhya");
			names.add("Adam");
			names.add("Anand");
			names.add("Ram");
		//it Reduce the Code Size-- This is Single line code
		//there is no life for intermediate Operation if there is no terminal operation
		//terminal operation will execute only if internal operation(Filter) is True
		//We can create stream
		//How to to use fileter stream in API   
		Long c = names.stream().filter(s->s.startsWith("D")).count();//--This is Terminal Operation
		System.out.println(c);
		
		//Every time it is Not mandtry to create Collection u can use stream methodi Single lin u can store 
		
		long d =Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->{
			
		s.startsWith("A");
		return true;
		}).count();
	System.out.println(d);
	//print all the names of ArrayList

	names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	//Foreachmethod it scan entire method
	names.stream().filter(s->s.length()>4).limit(2).forEach(s->System.out.println(s));//it limits the size of the data

		
		}
		
	//@Test
	//This is Sorted model
	public void streamMap() {
		
	//print names which have last letter as "a" with uppercase 
		Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).
		forEach(s->System.out.println(s));
		//print names which have first letter as a with Uppercase and sorted
		
		//Arrays to ArraysList conversion Use below method--Arrays.asList("")
		
		List<String>names=Arrays.asList("Azbhijeet","Don","Alekhya","Adam","Rama");
		//Sorting method sorted Alaphbets order
		names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
	}
	//@Test
	//MergingOperation
	public void streamMap1() {
		
		ArrayList<String> names = new ArrayList<String> ();

		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Anand");
		
	//print names which have last letter as "a" with uppercase 
		Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).
		forEach(s->System.out.println(s));
		//print names which have first letter as a with Uppercase and sorted
		
		//Arrays to ArraysList conversion Use below method--Arrays.asList("")
		
		List<String>names1=Arrays.asList("Abhijeet","Don","Alekhya","Adam","Rama");
		//Sorting method sorted Alaphbets order
		names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//Merging Two different lists
		Stream<String> newStream = Stream.concat(names.stream(),names1.stream());
		//newStream.sorted().forEach(s->System.out.println(s));
		boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("Adam1"));
		System.out.println(flag);
		Assert.assertTrue(flag);
		}

		//Stream Collection Method
	@Test
	public void streamcollect(){
		
		//list 
		List<String> ls = Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		
		//scan the name coloumn with get text--Rice--Print the price of the Rice
		//Here we are writing Custom Method
		//elementsList.stream().filetr(s->s.getText().contains("Beans")).
		//map(s->getPriceveggie()).collect(Collectors.toList());

		
		//List<String>price = elementsList.stream().filter(s->s.getText().contains("Beans")).
		//map(s->getPriceVeggie(s)).collect(Collectors.toList());

	}


}
