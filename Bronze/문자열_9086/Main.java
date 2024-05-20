package CodingTest.BackJoon.Bronze.문자열_9086;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();//개수
        String st;

        for(int i=0; i<t; i++) {
            st = sc.next();

            System.out.print(st.charAt(0));
            System.out.println(st.charAt(st.length()-1));
        }

        sc.close();
        
    }
}
