package xxx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HomeWork4_3 {
	public static void main(String[] args) {
//	• 請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//	例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//	(提示1：Scanner，陣列)
//	(提示2：需將閏年條件加入)
//	(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)
		int year = 1, month = 1, day = 1;

		
			System.out.println("請輸入年月日:");
			Scanner sc = new Scanner(System.in);
		{
				year = sc.nextInt(); // 取得輸入的數字指定給n
			}
		
		
		if(year%4==0&&year%100!=0||year%400==0&&year%100==0) {
			
		}
		
		
		
		
	}
}
