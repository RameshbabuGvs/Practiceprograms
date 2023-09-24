package arrays;

public class Sumof2dimensinal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  int a[][] = {{1, 4}, {2, 3}, {7, 6}, {9,1}, {1,8}};
	        int sum = 0;
	        for(int i = 0; i < a.length; i++)
	        	
	        {
	            for(int j = 0; j < a[i].length; j++)
	            {
	                sum += a[i][j];
	            }
	        }
	        System.out.println("sum = " + sum);
	    }}
		
		
		
		
	
