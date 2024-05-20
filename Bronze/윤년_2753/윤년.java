package CodingTest.BackJoon.Bronze.윤년_2753;

import java.util.Scanner;

public class 윤년 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		if (year % 4 == 0) {
			if (year % 100 != 0 || year % 400 == 0) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		} else {
			System.out.println("0");
		}

        sc.close();
	}
}
