package xxx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HomeWork8_2 {
	public static void main(String[] args) {
//		• 設計對應的getter/setter方法，並在main方法裡透過建構子產生以下7個Train的物件，放到每小題
//		需使用的集合裡
//		- (202, “普悠瑪”, “樹林”, “花蓮”, 400)
//		- (1254, “區間”, “屏東”, “基隆”, 700)
//		- (118, “自強”, “高雄”, “台北”, 500)
//		- (1288, “區間”, “新竹”, “基隆”, 400)
//		- (122, “自強”, “台中”, “花蓮”, 600)
//		- (1222, “區間”, “樹林”, 七堵, 300)
//		- (1254, “區間”, “屏東”, “基隆”, 700)
		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);
//		• 請寫一隻程式，能印出不重複的Train物件
		System.out.println("--------不重複的Train物件--------");
		HashSet<Train> hashset = new HashSet<Train>();
		hashset.add(t1);
		hashset.add(t2);
		hashset.add(t3);
		hashset.add(t4);
		hashset.add(t5);
		hashset.add(t6);
		hashset.add(t7);
		for(Train e : hashset) {
			System.out.println(e.getNumber()+" "+e.getType()+" "+e.getStart()+" "+e.getDest()+" "+e.getPrice());
		}
//		• 請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出
		System.out.println("--------班次編號由大到小--------");
		List<Train> list = new ArrayList<Train>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		list.add(t6);
		list.add(t7);
		Collections.sort(list);
		for(Train e : list) {
			System.out.println(e.getNumber()+" "+e.getType()+" "+e.getStart()+" "+e.getDest()+" "+e.getPrice());
		}
//		• 承上，不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件
		System.out.println("--------班次編號由大到小,不重複--------");
		TreeSet<Train> tr = new TreeSet<Train>();
		tr.addAll(hashset);
		
		for(Train e:tr) {
			System.out.println(e.getNumber()+" "+e.getType()+" "+e.getStart()+" "+e.getDest()+" "+e.getPrice());
		}
//		• (以上三題請根據使用的集合，練習各種取值寫法，如迭代器、for迴圈或foreach等)
		Iterator objs = tr.iterator();
		while(objs.hasNext()) {
		System.out.println(((Train) objs.next()).getNumber());
		}
	}
}
