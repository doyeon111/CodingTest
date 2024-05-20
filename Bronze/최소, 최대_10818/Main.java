import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a [] = new int[n];

        
        for(int i=0; i<n; i++) {
            a[i]= sc.nextInt();
            
        }
        int max = a[0]; //최대값
        int min = a[0]; //최소값
        
        for(int i=1; i<n; i++) {
            if(a[i] > max) {
                max = a[i];
            }
            if(a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(min + " " + max);
        
        sc.close();
    }
}
