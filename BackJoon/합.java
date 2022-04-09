package practice04;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {

		int n, sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("a: ");
		n = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			if (n >= 1 && n <= 10000) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
 
