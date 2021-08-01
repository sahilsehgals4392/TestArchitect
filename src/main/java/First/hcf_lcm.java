package First;

import java.io.IOException;

public class hcf_lcm {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n1 = 72, n2 = 120, gcd = 1;
		for (int i = 1; i <= n1 && i <= n2; ++i) {
			// Checks if i is factor of both integers
			if (n1 % i == 0 && n2 % i == 0)
				gcd = i;
		}

		int lcm = (n1 * n2) / gcd;
		// System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);

		// LCM Logic 2:

		int lcmNew = (n1 > n2) ? n1 : n2;
		while (true) {
			if (lcmNew % n1 == 0 && lcmNew % n2 == 0) {
				break;
			}
			lcmNew++;
		}

	}

}
