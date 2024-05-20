package CodingTest.BackJoon.Bronze.합_8393;

import java.util.Scanner;

public class 합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n, sum = 0;
		n = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			if (n >= 1 && n <= 10000) {
				sum += i;
			}
		}
		System.out.println(sum);

        sc.close();
	}
}
