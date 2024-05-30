package CodingTest.BackJoon.Bronze.개표_10102;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int v = Integer.parseInt(br.readLine());
        char[] ch = new char[v];
        int cnt = 0;
        int cnt2 = 0;

        for(int i=0; i<ch.length; i++) {
            ch[i] = (char) br.read();

            if(ch[i] == 'A') cnt++;
            else cnt2++;
        }
        if(cnt > cnt2) System.out.println("A");
        else if(cnt < cnt2) System.out.println("B");
        else System.out.println("Tie");
        
        br.close();
    }
}
