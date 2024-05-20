package CodingTest.BackJoon.Bronze.알람시계_2884;

import java.util.Scanner;

public class 알람시계 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); // 시
        int y = sc.nextInt(); // 분

        x += y / 60;
        y = (y - 45);

        if (y < 0) {
            x -= 1;
            y += 60;
        }

        if(x < 0) {
            x += 24;
        }

        System.out.println(x + " " + y);
        sc.close();

    }
}
