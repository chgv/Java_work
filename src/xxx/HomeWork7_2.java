package xxx;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class HomeWork7_2 {
//	• 請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡 (請使用
//			append功能讓每次執行結果都能被保存起來)
	public static void main(String[] args) {
		try {
		FileOutputStream fos = new FileOutputStream("c:\\javawork\\Data.txt", true);
//		BufferedOutputStream bos = new BufferedOutputStream(fos);
		PrintStream ps = new PrintStream(fos);
		Set s1 = new HashSet();
		Random rd = new Random();
		while(s1.size()!=10) {
			int n1 = rd.nextInt(1000)+1;
			s1.add(n1);
		}
 
		Iterator it = s1.iterator();
		while(it.hasNext()) {
			ps.printf("%d ", it.next());
		}
		ps.close();
//		bos.close();
		fos.close();
		}catch (IOException e) {}
	}
}
