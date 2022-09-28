package xxx;

public class HomeWorkNineNine {

	public static void main(String[] args) {
//		for+while
		int i = 1, j = 1;
		for (i = 1; i <= 9; i++) {
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			}
			j = 1;
			System.out.println();
		}

		System.out.println("==========================================================");
//		for+do while
		i = 1;
		j = 1;
		for (i = 1; i <= 9; i++) {
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j <= 9);
			j = 1;
			System.out.println();
		}

		System.out.println("==========================================================");
//		while+do while
		i = 1;
		j = 1;
		while (i <= 9) {
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j <= 9);
			i++;
			j = 1;
			System.out.println();
		}
	}
}
