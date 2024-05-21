import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // 처음에 몇 줄 출력할 것인지
        
        for(int i=0; i<num; i++) {
            int r = sc.nextInt(); //문자열을 r번 반복
            String s = sc.next(); //입력받을 문자열
            
            for(int j=0; j<s.length(); j++) {
                for(int k=0; k<r; k++) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
        sc.close();
    }
}