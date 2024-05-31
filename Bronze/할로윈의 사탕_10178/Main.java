import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken()); // 사탕의 개수
            int v = Integer.parseInt(st.nextToken()); // 형제의 수

            System.out.println("You get " + (c/v) + " piece(s) and your dad gets " + (c%v) + " piece(s).");
        }

        
        br.close();
    }
}
