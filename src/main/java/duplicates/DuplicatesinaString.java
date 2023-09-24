package duplicates;

public class DuplicatesinaString {
	
	//public class DuplicatesinString {
	public static void main(String [] args){
	//String str="RRameshbabu";
		String str="RRameshbabu";	
	int length=str.length();
	char[] ch=str.toCharArray();
	for(int i=0;i<length;i++){
	for(int j=i+1;j<length;j++){
		if(ch[i]==ch[j]){
	System.out.println("Duplicates characters are : "+ch[j]);
	break;
	}
		}
	
	}
	}

}

