package xxx;

import java.util.*;

/**
 * 輸入整數n，輸出其質因數分解結果。 質因數:一個大於1的整數本質數，它本身是質數，而且又某數的因數，則 稱它為某數的質因數。
 * 例(1):5的因數有1、5，而且5是質數，所以5就是5的質因數· 例(2):9的因數有1、3、9，其中3是質數，所以3就是9質因數·
 * 例(3):21的因數有1、3、7、21，其中3和7都是質數，所以3和7 都是21的質因數. 提示:
 * 質因數分解:把一個整數寫成它的質因數的連乘積，稱為質因數分解。 例(1):把15質因數分解，可以寫成15=3x5。而且15的質因數只有 3和5，共2個。
 * 例(2):把60質因數分解，可以寫成60=2x2x3x5。而且60的質因數 只有2、3、5，共3個。 限制:
 * 1.輸入值範圍2<=n<=2147483647 2.執行時間需小於100毫秒 輸入/輸出範例: 1.輸入:600 輸出:2^3*3*5^2
 * 2.輸入:924 輸出:2^2*3*7*11 3.輸入:123456789 輸出:3^2*3607*3803
 */
public class 質數 {
	public String num(String num) {
		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		int n = Integer.parseInt(num);
		int flag = 1;
		while (n > 1) {
			for (int i = 2; i <= n; i++) {
				if (n % i == 0) {
					flag = i;
					if (!list.contains(i)) {
						list.add(i);
					}
					if (!map.containsKey(i)) {
						map.put(i, 1);
					} else {
						map.put(i, map.get(i) + 1);
					}
					break;
				}
			}
			n = n / flag;
		}

		String str = new String("");
		for (Integer e : list) {
			if (map.get(e) != 1) {
				str += "*" + e + "^" + map.get(e);
			} else {
				str += "*" + e;
			}
		}
		return str.substring(1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		質數 n = new 質數();
		System.out.println(n.num(num));
	}
}
