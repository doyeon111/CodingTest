import java.io.IOException;
import java.util.Scanner;

public class 개수세기 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //정수의 개수
        int sum [] = new int[n];
        int number = 0;
        
        for(int i=0; i<n; i++) {
            sum[i] = sc.nextInt();
        }
    
        int v = sc.nextInt(); //찾으려고 하는 정수

        for(int j=0; j<sum.length; j++) {
            if(sum[j] == v) {
                number++;
            }
        }
        
        System.out.println(number);

        sc.close();

    }
}
