import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String st = sc.next();
        int num = sc.nextInt();

        System.out.println(st.charAt(num-1));

        sc.close();
        
    }
}
