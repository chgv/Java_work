package xxx;

import java.util.Scanner;

public class HomeWork3_2 {
	public static void main(String[] args) {

//    	• 請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//    	對則顯示正確訊息，如圖示結果
//		(提示:Scanner,亂數方法,無窮迴圈)
//		(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)

		int n, i;

		i = (int) (Math.random() * 100); // 產生100個亂數 從0開始
		System.out.println("開始猜數字吧!");
		while (true) { // 無限迴圈
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt(); // 取得輸入的數字指定給n
			if (i == n) { // 答案正確(i=n)跳出迴圈
				System.out.println("答對了!答案就是" + i);
				break;
			} else if (i > n) {
				System.out.println("小於正確數字");
			} else if (i < n) {
				System.out.println("大於正確數字");
			} else {
				System.out.println("猜錯囉");
			}
		}
	}
}