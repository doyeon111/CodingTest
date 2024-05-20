package CodingTest.BackJoon.Bronze.최댓값_2652;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int a [] = new int[9];
        int max = a[0];//최대값
        int num = 0; //자리수
        
        for(int i=0; i<9; i++) {
            a[i]= sc.nextInt();    
        }
        

        for(int i=0; i<a.length; i++) { 
            if(a[i] > max) {
                max = a[i];
                num = i+1;
            }
        }
        
        System.out.println(max);
        System.out.println(num);

        sc.close();
        
    }
}
