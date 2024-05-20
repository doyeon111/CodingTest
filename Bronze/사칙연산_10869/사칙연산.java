package CodingTest.BackJoon.Bronze.사칙연산_10869;

import java.util.Scanner;

public class 사칙연산 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); 
		int B = sc.nextInt();
		
		System.out.println(A + B);
		System.out.println(A - B);
		System.out.println(A * B);
		System.out.println(A / B);
		System.out.println(A % B);

        sc.close();
    }
}
