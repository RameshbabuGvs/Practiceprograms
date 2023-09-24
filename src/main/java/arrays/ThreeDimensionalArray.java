package arrays;
public class ThreeDimensionalArray {
public static void main(String[] args) {
int [] [] [] arr= {{{7,8,9},{1,2,3},{8,5,2},{2,2,2},{1,1,1},{3,3,3}}};
		int sum=0;
		System.out.println(arr.length);
		for(int i=0; i < arr.length; i++){
			  for(int j=0; j < arr[i].length; j++){
			   for(int k=0; k < arr[i][j].length; k++){
			    System.out.print( arr[i][j][k] + "\t");
		sum +=arr[i][j][k];	    }
			  }
			  }
		System.out.println();
		System.out.println("sum = " + sum);
	}}

