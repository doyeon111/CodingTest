import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // 개수

        for (int i = 1; i <= t; i++) {
            int a = sc.nextInt(); // 첫번째 더할 수
            int b = sc.nextInt();

            int sum = a+b;
            System.out.println("Case #" + i + ": " + a + " + " + b + " = " + sum);
        }
    
        sc.close();

    }
}
