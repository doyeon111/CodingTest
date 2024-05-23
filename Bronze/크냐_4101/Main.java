package CodingTest.BackJoon.Bronze.크냐_4101;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a != 0 && b != 0) {
                if(a > b) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                break;
            }
        }

        sc.close();
    }
}
