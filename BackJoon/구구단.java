import java.util.Scanner;

public class practice {

	public static void main(String[] args) {

		int n;

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.println(n + " * " + i + " = " + (n * i));

		}

	}

}
