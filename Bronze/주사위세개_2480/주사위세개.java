package CodingTest.BackJoon.Bronze.주사위세개_2480;

import java.util.Scanner;

public class 주사위세개 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int max;

        if (x == y && x == z) {
            System.out.println(10000 + x * 1000);
        } else if ((x == y && x != z) || (x == z && x != y)) {
            System.out.println(1000 + x * 100);
        } else if((y == z && x != y)) {
            System.out.println(1000 + y * 100);
        } else {
            max = Math.max(Math.max(x, y), z);
            System.out.println(max * 100);
        }

        sc.close();

    }
}
