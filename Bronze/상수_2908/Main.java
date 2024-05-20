package CodingTest.BackJoon.Bronze.상수_2908;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = 0;

        a = Integer.parseInt(new StringBuilder().append(a).reverse().toString());
        b = Integer.parseInt(new StringBuilder().append(b).reverse().toString());

        if(a > b) {
            max = a;
        } else {
            max = b;
        }

        System.out.println(max);

        sc.close();
        
    }
}
