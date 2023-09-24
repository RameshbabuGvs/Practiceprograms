package arrays;

public class Secondlargestnumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]= {1,3,5,9,12,25};
			int n=num.length;
			int highest=Integer.MIN_VALUE;
			int secondHighest=Integer.MIN_VALUE;
			
			for(int i=0;i<n;i++) {
				if(num[i]>highest) {
					secondHighest=highest;
					highest=num[i];}
				if(num[i] < highest &&  num[i]>secondHighest) {
					secondHighest=num[i];}	}
     System.out.println("Second highest number  "+secondHighest);
			}}
