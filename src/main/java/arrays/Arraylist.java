package arrays;

import java.util.StringTokenizer;

public class Arraylist {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "HI Ramesh how are you";
		StringBuilder builder = new StringBuilder();
		StringTokenizer tokenizer = new StringTokenizer(str);
		while (tokenizer.hasMoreTokens()) {
			builder.append(new StringBuilder(tokenizer.nextToken()).append(" ").reverse());

		}

		System.out.println(builder);

	}

}
