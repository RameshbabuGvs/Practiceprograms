package arrays;

public class FindtheLargestnumberinArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,3,10,15,84,90};

		int maxnumber=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>maxnumber) {
				maxnumber=arr[i];}}
		System.out.println("The largest number is  "+maxnumber);}
}
