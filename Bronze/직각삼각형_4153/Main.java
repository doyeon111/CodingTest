package CodingTest.BackJoon.Bronze.직각삼각형_4153;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a != 0 && b != 0 && c != 0) {
                int pa = (int) Math.pow(a, 2);
                int pb = (int) Math.pow(b, 2);
                int pc = (int) Math.pow(c, 2);

                if(pa + pb == pc) {
                    System.out.println("right");
                } else if(pb + pc == pa) {
                    System.out.println("right");
                } else if(pc + pa == pb) {
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            } else {
                break;
            }
        }

        sc.close();
    }
}

