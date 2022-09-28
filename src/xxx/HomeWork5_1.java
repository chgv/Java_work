package xxx;

import java.util.Scanner;

public class HomeWork5_1 {
//	• 請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形，如
//	圖：
	public static void main(String[] args) {
		int width, height;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("請輸入高:");
			height = sc.nextInt();
			System.out.println("請輸入寬:");
			width = sc.nextInt();
			if (height <= 0 || width <= 0) {
				System.out.println("==========數值錯誤請重新輸入==========");
				continue;
			}
			break;
		}
		HomeWork5_1method hw = new HomeWork5_1method();
		hw.starSquare(width, height);
	}
}

