package arrays;

public class Rightrotation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int a[]= {1,2,3,4,5,6,7,8,9};
	   System.out.println("before Right rotation");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");}
	    int noofTimes=1;
		for(int k=0;k<noofTimes;k++) {
			int lastelement=a[a.length-1];
			for(int j=a.length-1;j>0;j--) {
				a[j]=a[j-1];}
			a[0]=lastelement;
			}
		System.out.println();
		System.out.println("after Right rotation");
		for(int l=0;l<a.length;l++) {
			System.out.print(a[l]+ " ");
		}
		
	   /*
		//Left rotation Array
		int noOfTimes=2;
		for(int k=0;k<noOfTimes;k++) {
			int firstElement = arr2[0];
			for(int j=0;j<arr2.length-1;j++) {
				arr2[j]=arr2[j+1];
			}
			arr2[arr2.length-1]=firstElement;	}
		System.out.println();
		for(int l=0;l<arr2.length;l++) {
			System.out.print(arr2[l]+" ");}*/
		
	}}
