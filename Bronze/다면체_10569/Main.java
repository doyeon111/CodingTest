package CodingTest.BackJoon.Bronze.다면체_10569;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); //자연수 T
        
        for(int i=0; i<t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken()); // 꼭짓점의 개수
            int e = Integer.parseInt(st.nextToken()); // 모서리의 개수
            // (면의 수) = 2 - (꼭짓점의 수) + (모서리의 수)
            int num = 2 - v + e;

            System.out.println(num);
        }

        br.close();
    }
}
