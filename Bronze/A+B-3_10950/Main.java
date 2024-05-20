import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // 개수
        int sum[] = new int[t];

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(); // 첫번째 더할 수
            int b = sc.nextInt();

            sum[i] = a+b;
        }

        for(int j : sum) {
            System.out.println(j);
        }

        sc.close();
    }
}
