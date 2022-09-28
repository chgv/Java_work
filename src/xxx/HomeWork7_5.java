package xxx;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import xxx.Animal_I;
public class HomeWork7_5 {
//	承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何 (請利用多
//	型簡化本題的程式設計)
	public static void main(String[] args) throws Exception {
		try (FileInputStream fis = new FileInputStream("C:\\data\\Object.ser");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			while (true) {
			((Animal_I) ois.readObject()).speak();  // 用介面(InterfaceAnimal)實現多型簡化
			}
					
			
		} catch (EOFException e) {
			System.out.println("---------資料讀取完畢----------");
		}

	}
}