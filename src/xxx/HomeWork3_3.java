package xxx;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HomeWork3_3 {
	public static void main(String[] args) {
//		• 阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//		厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//		的號碼與總數，如圖
//		(提示：Scanner)

		int n = 1, total = 0;
		if (0<n && n<10) {
			System.out.println("阿文...請輸入你討厭哪個數字?");
			Scanner sc = new Scanner(System.in);
				n = sc.nextInt(); // 取得輸入的數字指定給n
		}
		for (int i = 1; i <= 49; i++) {
			if (!(i % 10 == n || i / 10 == n)) { // 剔除n在個位數&n在十位數
				System.out.printf("%4d", i);
				total++;
				if (total % 6 == 0) // 6個數字一排,方便閱讀
					System.out.println();
			}
		}
		System.out.printf("  總共有%d數字可選",total);

//		(進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複)
//		int n=1;
//		if (n < 10 && n > 0) {
//			System.out.println("阿文...請輸入你討厭哪個數字?");
//			Scanner sc = new Scanner(System.in);
//			n = sc.nextInt(); // 取得輸入的數字指定給n
//		}
//		Random rd = new Random(); // 產生Random物件
//		List<Integer> al = new ArrayList<>(); // 建立一個數組al
//
//		while (al.size() <= 5) { // 總共6個數字
//			int n1 = rd.nextInt(49)+1; // 產生1~49數字
//			if (al.contains(n1)) {
//				continue; // 重複的不加入
//			} else if (n1 % 10 == n || n1 / 10 == n) {  //排除指定數字
//				continue;
//			} else
//				al.add(n1); //加入數組
//			System.out.printf("%d ", n1);
//		}
	}
}
