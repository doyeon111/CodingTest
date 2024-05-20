package CodingTest.BackJoon.Bronze.영수증_25304;

import java.io.IOException;
import java.util.Scanner;

public class 영수증 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); // 영수증에 적힌 총 금액
        int n = sc.nextInt(); // 영수증에 적힌 구매한 물건의 종류의 수
        int sum = 0;
        
        for(int i=0; i<n; i++) {
            int a = sc.nextInt(); //a의 개수
            int b = sc.nextInt(); //b의 개수

            sum += a * b;
        }

        if(x == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
