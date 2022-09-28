package xxx;

import java.util.Scanner;

public class HomeWork4_2 {
	public static void main(String[] args) {
//	• 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//	表如下：
//	請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//	有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//	員工編號: 25 19 27 共 3 人!」
//	(提示：Scanner，二維陣列)

		int n = 1;
		if (n > 0) {
			System.out.println("請輸入欲借金額:");
			try (Scanner sc = new Scanner(System.in)) {
				n = sc.nextInt(); // 取得輸入的數字指定給n
			}
		}
		int[][] MoneyList = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };
		int total = 0;
		System.out.print("有錢可借的員工編號:");
		for (int i = 0; i < MoneyList.length; i++) {
			for (int j = 0; j < MoneyList[i].length; j++) {
				if (n <= MoneyList[i][j]) {             //輸入金額<=可借金額
					total++;                            //可借計次
					System.out.printf("%d ", MoneyList[i][0]);  //員工編號
				}
			}
		}
		System.out.printf("共%d人!", total);
	}
}
