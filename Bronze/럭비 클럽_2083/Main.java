import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            int age = Integer.parseInt(st.nextToken());
            int weigth = Integer.parseInt(st.nextToken());

            if("#".equals(name) && age == 0 && weigth == 0) {
                break;
            } else {
                if(age > 17 || weigth >= 80) {
                    System.out.println(name + " Senior");
                } else {
                    System.out.println(name + " Junior");
                }
            }

        }

        br.close();
    }
}
