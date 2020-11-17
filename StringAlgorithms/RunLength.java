package StringAlgorithms;

import java.util.Scanner;

/*
 * Runlength - given aabbbaa converts to a2b3a2.
 */
public class RunLength {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter input string");
		String input = scanner.nextLine();
		System.out.println("Input String is: " + input);

		int N = input.length();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			int runLen = 1;
			while (i + 1 < N && input.charAt(i) == input.charAt(i + 1)) {
				runLen++;
				i++;
			}

			sb.append(input.charAt(i));
			sb.append(runLen);
		}

		System.out.println(sb.toString());
	}

}
