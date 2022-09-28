package xxx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class HomeWork7_4 {
//	• 請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。注
//	意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
	public static void main(String[] args) throws Exception {
		Object arr[] = new Object[4];
		arr[0] = new Dog("dodo");
		arr[1] = new Dog("dada");
		arr[2] = new Cat("mimi");
		arr[3] = new Cat("nini");
		File f1 = new File("C:\\data");
		
		if (!f1.exists()) {
			f1.mkdir();
		}
		
		try (FileOutputStream fos = new FileOutputStream("C:\\data\\Object.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			for(Object e : arr) {
				oos.writeObject(e);
				oos.flush();
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
	}
}
