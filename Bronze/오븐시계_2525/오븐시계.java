package CodingTest.BackJoon.Bronze.오븐시계_2525;

import java.util.Scanner;

public class 오븐시계 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); // 시
        int y = sc.nextInt(); // 분
        int z = sc.nextInt(); // 필요한 시간 (분)

        x += z / 60; // 시
        y += z % 60; // 분

        if (y >= 60) { // 계산한 분이 60이상일 경우
            x += (y / 60); // 시에 1을 더해줌
            y -= 60;
        }

        if (x >= 24) {
            x -= 24;
        }

        System.out.println(x + " " + y);
        sc.close();

    }
}
