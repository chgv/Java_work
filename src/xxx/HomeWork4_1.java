package xxx;

public class HomeWork4_1 {
	public static void main(String[] args) {
//		• 有個一維陣列如下：
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//		(提示：陣列，length屬性)
		int[] array = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;
//		for (int i = 0; i < array.length; i++) {
//			sum += array[i];
//		}
		for (int i : array) {
			sum+=i;
		}
		System.out.println("平均值=" + sum / array.length);
		System.out.print("大於平均值=");
		for (int i : array) {

			if (i>sum/array.length) { //大於平均值陣列
				System.out.printf("%d ", i);
			}
		}
//		for (int n = 0; n < array.length; n++) {
//			if (sum / array.length < array[n]) { //大於平均值陣列
//				System.out.printf("%d ", array[n]);
//			}
//			
//		}
		System.out.println();
		System.out.println("======================================================");

//		• 請建立一個字串，經過程式執行後，輸入結果是反過來的
//		例如String s = “Hello World”，執行結果即為dlroW olleH
//		(提示：String方法，陣列)
		StringBuffer hw = new StringBuffer("Hello World"); //建立StringBuffer類別物件
		System.out.println(hw.reverse());   //使用StringBuffer類別方法reverse()反轉字元
		System.out.println("======================================================");

//		• 有個字串陣列如下 (八大行星)：
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) 
//		(提示：字元比對，String方法)
		String[] planet = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		char[] vowel = { 'a', 'e', 'i', 'o', 'u' };
		int totle = 0, i = 0, j = 0, n = 0;
		char[] char_planet = planet[i].toCharArray();
		for (i = 0; i < planet.length; i++) { // 行星字串陣列
			for (j = 0; j < char_planet.length; j++) { // 行星字元陣列
				for (n = 0; n < vowel.length; n++) { // 母音陣列
					if (char_planet[j] == vowel[n]) {
						totle++;
					}
				}
			}
		}
		System.out.println(totle);
	}
}
