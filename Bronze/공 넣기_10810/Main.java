import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //바구니의 총 개수
        int m = sc.nextInt(); // 공을 넣을 수


        int ballArr[] = new int[n]; // 바구니의 총 개수만큼 배열저장

        for(int p=0; p<m; p++) {
            int i = sc.nextInt(); //i번 바구니부터
            int j = sc.nextInt(); // j번 바구니까지
            int k = sc.nextInt(); // k번 번호가 적혀있는 공을 넣는다.

            //i번부터 j번바구니까지.. k번 번호의 공을 넣는다

            for(int t=i-1; t<=j-1; t++) {
                ballArr[t] = k;
                // 1 2 3 4 5
                // 3 3 0 0 0
                // 3 3 4 4 0
                // 1 1 1 1 0
                // 1 2 1 1 0
            }
        
        }

        for(int a=0; a<ballArr.length; a++) {
            System.out.print(ballArr[a] + " ");
        }

        sc.close();
    }
}
