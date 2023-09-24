package arrays;

public class Duplicatearrays {

/*public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,5,4,2,1,4,1,4};
Set<Integer> uniquenumber=new HashSet<>();
boolean isDuplicateExist=false;
for(int i=0;i<arr.length;i++) {
	if(uniquenumber.contains(arr[i])) {
		isDuplicateExist=true;
		System.out.println(" Duplicate Element " +arr[i]);
	}         
	else {
		uniquenumber.add(arr[i]);
	}
}
		
if(!isDuplicateExist) {		
	System.out.println(-1);}
	}
*/

	
	public static void main(String[] args) {  
        //Initialize array  
        int [] arr = new int [] {1,  3, 4, 2, 7, 8, 8, 5,1};  
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j]) { 
                    System.out.println(" Duplicate Element is " +arr[j]);  }
            }  
        }  
    } 
	

}