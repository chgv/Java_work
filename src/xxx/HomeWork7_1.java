package xxx;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class HomeWork7_1 {
//	• 請自行建立一個文字檔Sample.txt，內容如下：
//	請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
//	Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料

	public static void main(String[] args) {
		int i;
		int j = 1;
		int count = 0;
		int count1 = 0;
		int count2 = 0;
		try {
			FileInputStream fis = new FileInputStream("Sample.txt");
			FileReader fis1 = new FileReader("Sample.txt");
			FileReader fis2 = new FileReader("Sample.txt");
			BufferedReader br = new BufferedReader(fis2);
			while ((i = fis.read()) != -1) {
				count += j;
			}
			System.out.printf("檔案共有%d個位元組\n", count);

			while ((i = fis1.read()) != -1) {
				count1 += j;
				
			}
			System.out.printf("檔案共有%d個字元\n", count1);
			
			String str;
			while ((str = br.readLine()) != null) {
				count2 += j;
			}
			System.out.printf("檔案共有%d列資料", count2);

			br.close();
			fis.close();
		} catch (IOException e) {

		}
	}
}