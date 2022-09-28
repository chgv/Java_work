package xxx;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class HomeWork7_3 {
//	• 請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所
//	代表的檔案會複製到第二個參數代表的檔案

	public static void copyFile(String s1, String s2) {
		try {
			File f1 = new File(s1);
			File f2 = new File(s2);
			FileInputStream fis = new FileInputStream(f1);
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream(f2);
			byte[] b = new byte[2048];
			int i;
			while ((i = bis.read(b)) != -1) {
				fos.write(b);
				fos.flush();
			}
			bis.close();
			fos.close();
			fis.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("資料傳輸錯誤");
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {      //測試方法
		String s1 = "C:\\javawork\\SS.png";
		String s2 = "C:\\javawork\\SS1.png";
		copyFile(s1, s2);
	}
}
