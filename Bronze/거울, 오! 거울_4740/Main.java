import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            String str = sc.nextLine();

            if(str.equals("***")) {
                break;
            } else {
                StringBuffer sb = new StringBuffer(str);
                String reversedString = sb.reverse().toString();

                System.out.println(reversedString);
            }
        }

        sc.close();
    }
}