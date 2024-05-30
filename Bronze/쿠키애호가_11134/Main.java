package CodingTest.BackJoon.Bronze.쿠키애호가_11134;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); //개수 T

        for(int i=0; i<t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); // 철수가 가진 쿠키의 개수
            int c = Integer.parseInt(st.nextToken()); // 날마다 먹는 쿠키의 개수
            if(n % c != 0) {
                System.out.println((n/c) + 1);
            } else {
                System.out.println(n / c);
            }
        }

        br.close();
    }
}
