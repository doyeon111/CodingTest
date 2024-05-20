import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //바구니의 총 개수
        int m = sc.nextInt(); // 공을 바꿀 횟수


        int boxArr[] = new int[n]; // 바구니의 총 개수만큼 배열저장
        int temp;

        //이미 바구니에는 바구니와 같은 번호인 공이 들어가있음.
        for(int k=0; k<boxArr.length; k++) {
            boxArr[k] = k+1; 
        }

        for(int p=0; p<m; p++) {
            int i = sc.nextInt(); //i번 바구니부터
            int j = sc.nextInt(); // j번 바구니까지
            //i번 바구니와 j번 바구니의 공을 서로 교환
            temp = boxArr[i-1];
            boxArr[i-1] = boxArr[j-1];
            boxArr[j-1] = temp;
        
        }

        for(int a=0; a<boxArr.length; a++) {
            System.out.print(boxArr[a] + " ");
        }

        sc.close();
    }
}
