package arrays;

public class Arrayiteration {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="apple";
		char[] ca=str.toCharArray();
		char first=ca[0];
		int size=ca.length;
		for(int i=0;i<size-1;i++) {
			ca[i]=ca[i+1];	}
		ca[size-1]=first;
		StringBuffer sb=new StringBuffer();
		for(char c:ca) {
			sb.append(c);}
		System.out.println(sb);	
	}}
