import java.util.*;
public class Xpattern {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == i)
					System.out.print(i + 1);
				else if (i + j == n - 1)
					System.out.print(n - i);
				else
					System.out.print("-");
				if (j != n - 1)
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}