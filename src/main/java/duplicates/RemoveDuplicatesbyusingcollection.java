package duplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;
public class RemoveDuplicatesbyusingcollection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Method1
		ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9));
		LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<Integer>(numbers);
		ArrayList<Integer>numbersListwithoutDuplicates=new ArrayList<Integer>(linkedHashSet);
		System.out.println("Method1 RemoveDuplicatesbyusingcollection "+numbersListwithoutDuplicates);
		
		/*//Method2
		ArrayList<Integer> marklist=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9));
		ArrayList<Integer> marksListUnique= (ArrayList<Integer>) marklist.stream().distinct().collect(Collectors.toList());
		System.out.println("Method2 marksListUnique "+marksListUnique);
	*/
	}

}
