package xxx;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class test0618 {
	public static void main(String[] args) {
//		設計對應的getter/setter方法，並在main方法裡透過建構子產生以下7個Train的物件，放到每小題需使用的集合裡
//		- (202, "普悠瑪", "樹林", "花蓮", 400)
//		- (1254, "區間", "屏東", "基隆", 700)
//		- (118, "自強", "高雄", "台北", 500)
//		- (1288, "區間", "新竹", "基隆", 400)
//		- (122, "自強", "台中", "花蓮", 600)
//		- (1222, "區間", "樹林", 七堵, 300)
//		- (1254, "區間", "屏東", "基隆", 700)

	//請寫一隻程式，能印出不重複的Train物件
			List<Train> list = new ArrayList<Train>();

			list.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
			list.add(new Train(1254, "區間", "屏東", "基隆", 700));
			list.add(new Train(118, "自強", "高雄", "台北", 500));
			list.add(new Train(1288, "區間", "新竹", "基隆", 400));
			list.add(new Train(122, "自強", "台中", "花蓮", 600));
			list.add(new Train(1222, "區間", "樹林", "七堵", 300));
			list.add(new Train(1254, "區間", "屏東", "基隆", 700));

			System.out.println("取出Train物件:");
			for (Train it : list) {
				System.out.println(it);
			}

			System.out.println("-------------------------------------");

	//請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出
//			System.out.println("班次編號由大到小:");
//			Collections.sort(list);
//			for (Train it : list) {
//				System.out.println(it);
//			}
//
//			System.out.println("-------------------------------------");
}
}