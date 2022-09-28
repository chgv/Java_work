package xxx;

public class HomeWork4_4 {
	public static void main(String[] args) {
//	• 班上有8位同學，他們進行了6次考試結果如下：
//	請算出每位同學考最高分的次數
//	(提示：二維陣列)

		int[][] score_array = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };
		int max = 0; // 最高分數
		int idx = 0; // 計次
		int i = 0;
		int[] count = new int[8]; // 存放次數
		for (i = 0; i < score_array.length; i++) {
			for (int j = 0; j < score_array[i].length; j++) {
				if (score_array[i][j] > max) {
					max = score_array[i][j];
					idx = j;
				}
			}
			max = 0;
			count[idx]++;
		}
		System.out.printf("一號最高分%d次 ", count[0]);
		System.out.printf("二號最高分%d次 ", count[1]);
		System.out.printf("三號最高分%d次 ", count[2]);
		System.out.printf("四號最高分%d次 ", count[3]);
		System.out.printf("五號最高分%d次 ", count[4]);
		System.out.printf("六號最高分%d次 ", count[5]);
		System.out.printf("七號最高分%d次 ", count[6]);
		System.out.printf("八號最高分%d次 ", count[7]);
	}
}
