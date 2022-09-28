package xxx;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3_1 {
	public static void main(String[] args) {

//		• 請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//		三角形、其它三角形或不是三角形，如圖示結果：
//		(提示：Scanner，三角形成立條件，判斷式if else)
//		(進階功能：加入直角三角形的判斷)

		int i = 0, d = 0, v = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入邊長:");
		if (sc.hasNextInt()) {
			i = sc.nextInt();
		}
		if (sc.hasNextInt()) {
			d = sc.nextInt();
		}
		if (sc.hasNextInt()) {
			v = sc.nextInt();
		}

		int[] t = new int[3];
		t[0] = i;
		t[1] = d;
		t[2] = v;
		Arrays.sort(t); // 陣列數字先照順序排列

		if (!(t[0] > 0 && t[0] + t[1] > t[2])) { // 三角形定義 邊長>0且最小兩邊長的和>第三邊
			System.out.println("不是三角形");
		} else if (t[0] == t[1] && t[1] == t[2]) { // 三邊等長
			System.out.println("正三角形");
		} else if (t[0] == t[1] || t[1] == t[2]) { // 任兩邊等長
			System.out.println("等腰三角形");
		} else if (t[0] * t[0] + t[1] * t[1] == t[2] * t[2]) { // 斜邊長次方=另兩邊長次方的和
			System.out.println("直角三角形");
		} else {
			System.out.println("其他三角形");
		}
	}
}