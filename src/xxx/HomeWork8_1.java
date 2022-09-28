package xxx;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class HomeWork8_1 {
//	• 請建立一個Collection物件並將以下資料加入：
//	Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//	Object物件、“Snoopy”、BigInteger(“1000”)
	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer("100"));
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));
//	• 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
		// Iterator
		Iterator objs = list.iterator();
		while (objs.hasNext())
			System.out.print(objs.next() + " ");
		System.out.println();
		// for
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		// foreach
		for (Object e : list) {
			System.out.print(e + " ");
		}
		System.out.println();
//	• 移除不是java.lang.Number相關的物件
		for (int i = 0; i < list.size(); i++) {
			if (!(list.get(i) instanceof Number)) {
				list.remove(i);
				i--;
			}
		}
//	• 再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功
		for (Object e : list) {
			System.out.print(e + " ");
		}
	}
}
