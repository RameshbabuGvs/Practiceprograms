package numbers;

import java.util.Arrays;

public class OccuranceofnumbersinArray {

    
 	/*public static void main(String[] args) {//Input Array
    int[] input = new int[]{ 1,4,5,2,3,5,1,6,4,7,1,3,6,8,2,5};
//countMap holds the count details of each element
    Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
    for (int i = 0; i < input.length; i++)
    {   int key = input[i];
        if (countMap.containsKey(key))
        {
int count = countMap.get(key);
            count++;
            countMap.put(key, count);} 
        else{countMap.put(key, 1); }}
    
    //Printing the Element and its occurrence in the array
    for(Entry<Integer,Integer> val : countMap.entrySet()) 
{ System.out.println(val.getKey() + " occurs " + val.getValue() + " times"); }}
 	
 	*/
//find occurance by using for loop	
public static void main(String args[]) {
	int arr[]= {6,1,2,1,9,9,3,1,2,6,8,5};
	countDuplicate(arr);}
	static void countDuplicate(int arr[]) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) 
					count++;
				else 
					break;}
				if(count>1) {
					System.out.println(arr[i]+" repeated in-> "+count+" times");
					i+=(count-1);}}}
	

}

