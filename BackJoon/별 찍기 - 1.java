package practice04;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {

		int n;

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for(int i=1; i<=n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
