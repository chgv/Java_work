package xxx;

public class HomeWork2 {
//	• 請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)
	public static void main(String[] args) {
		int sum_i = 0;
		for (int i = 2; i <= 1000; i += 2) {
			sum_i += i;
		}
		System.out.println(sum_i);
		System.out.println("=====================================================");
//	• 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
		int sum_f = 1;
		for (int f = 1; f <= 10; f++) {
			sum_f *= f;
		}
		System.out.println(sum_f);
		System.out.println("=====================================================");
//	• 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
		int sum_w = 1;
		int w = 1;
		while (w <= 10) {
			sum_w *= w;
			w++;
		}
		System.out.println(sum_w);
		System.out.println("=====================================================");
//	• 請設計一隻Java程式，輸出結果為以下：
//	1 4 9 16 25 36 49 64 81 100
		for (int j = 1; j <= 10; j++) {
			System.out.printf("%d ", j * j);
		}
		System.out.println();
		System.out.println("=====================================================");
//	• 阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//	輸出結果為阿文可以選擇的數字有哪些？總共有幾個？

		int n, total = 0;
		System.out.println("可選擇的數字有:");
		for (n = 1; n <= 49; n++) {
			if (!(n % 10 == 4 || n / 10 == 4)) { // 4 14 24 34 // 40...49
				System.out.printf("%d ", n);
				total++;
			}
		}

		System.out.println();
		System.out.println("總共有:" + total + "個數字");
		System.out.println("=====================================================");

//	• 請設計一隻Java程式，輸出結果為以下：
//	1 2 3 4 5 6 7 8 9 10
//	1 2 3 4 5 6 7 8 9
//	1 2 3 4 5 6 7 8
//	1 2 3 4 5 6 7
//	1 2 3 4 5 6 
//	1 2 3 4 5
//	1 2 3 4 
//	1 2 3 
//	1 2 
//	1

		for (int x = 10; x >= 1; x--) {
			for (int y = 1; y <= x; y++) {
				System.out.printf("%d ", y);
			}
			System.out.println();
		}
		System.out.println("=====================================================");
//  • 請設計一隻Java程式，輸出結果為以下：
//  A
//  BB
//  CCC
//  DDDD
//  EEEEE
//  FFFFFF

//       System.out.println((int)'A');
//		 A=65 B=66 C=67 D=68 E=69 F=70

		for (int l = (int)'A'; l <= (int)'F'; l++) {
			for (int a = 65; a <= l; a++) {
				System.out.printf("%c", l);
			}
			System.out.println();
		}
	}
}
