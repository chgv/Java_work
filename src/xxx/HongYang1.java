package xxx;

import java.util.Scanner;

/*
輸入一正整數n.且n>=2.可用*出層的金字塔圖形,請依序輸
出金字塔圖形中各層的*座標.
例如n=5,金字塔圖形如下:
其各層的*座標為:
(1,5),(2,4),(2,6),(3,3),(3,7),(4,2),(4,8),(5,1),(5,2),(5,3),(5,4),(5,5),(5,6),(5,7)
(5,8),(5,9)
限制:
1.執行時間需小於100
輸入/輸出範例:
1.輸入:2
輸出:(1,2),(2,1),(2,2),(2,3)
2.輸入:3
輸出:(1,3),(2,2),(2,4),(3,1),(3,2),(3,3),(3,4).(3.5)
3.輸入:5輸出:
(1,5),(2,4),(2,6),(3,3),(3,7)(4,2),(4,8),(5,1),(5,2),(5,3),(5,4),(5,5),(5,6),(5,7)
(5,8),(5,9)
*/
public class HongYang1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int lineNum = sc.nextInt();
		for (int i = 1; i <= lineNum; i++) {

			// 列印空格
			for (int j = 1; j <= lineNum - i; j++) {
				System.out.print(" ");
			}

			// 列印*
			for (int k = 1; k <= 2 * i - 1; k++) {
				// 第一行與最後一行列印*的規則與等腰三角形保持一致
				if (i == 1 || i == lineNum) {
					System.out.print("*");
				} else {// 表示中間行

					if (k == 1 || k == 2 * i - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
			
		}
		
		
	}
}
