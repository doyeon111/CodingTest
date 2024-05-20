import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int a [] = new int[n];
        
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();

        }

        for(int j=0; j<a.length; j++) {
            if(a[j] < x) {
                System.out.print(a[j] + " ");
            }
        }

        sc.close();

    }
}
