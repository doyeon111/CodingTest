package CodingTest.BackJoon.Bronze.다이얼_5622;

import java.util.Scanner;

public class 다이얼 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String [] num = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        int sum = 0;

        for(int i=0; i<str.length(); i++) {
            for(int j=0; j<num.length; j++) {
                if(num[j].contains(Character.toString(str.charAt(i))) == true) {
                    sum+=j+3;
                }
            }
        }

        System.out.println(sum);
        sc.close();
    }
}
