package CodingTest.BackJoon.Bronze.줄번호_4470;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine(); 
        for(int i=0; i<n; i++) {
            String str = sc.nextLine();
            System.out.println(i+1 + ". " + str);
        }

        sc.close();
    }
}
