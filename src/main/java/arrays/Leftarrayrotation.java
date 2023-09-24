package arrays;
import java.util.Scanner;
public class Leftarrayrotation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,5,6,7,8,9};
System.out.println("Input array : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter how many times you want to rotate array to left : ");
		int no=sc.nextInt();
		for(int i=0;i<no;i++) {
	    int first =a[0];
	
		for(int j=0;j<a.length-1;j++) {
			a[j]=a[j+1];
			}
		a[a.length-1]=first;
		}
		System.out.println();
	
		
		System.out.println("Output array :   " );
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
