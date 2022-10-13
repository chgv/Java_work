package xxx;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

/**
 * 一字串由()[]{}三種括號組成,請試寫一程式,請驗證該字串中的括號 是否合法配對。 限制: 1.該字串最大長度為128字元 2.執行時間需小於100毫秒
 * 輸入/輸出範例: 1.輸入:(([()]))) 輸出:false 2.輸入:(){[[]]} 輸出:true 3.輸入:(([([{]})]))
 * 輸出:false
 */
public class 括號 {
	public boolean isBackets(String str) {
		// 檢查括號是否為偶數
		if (str.length() % 2 != 0) {
			return false;
		}
		HashMap<Character, Character> map = new HashMap<>();
		Stack<Character> stack = new Stack<Character>();
		map.put(')', '(');
		map.put(']', '[');
		map.put('}', '{');

		char[] cs = str.toCharArray();
		for (char c : cs) {
			if (map.containsKey(c)) { // 確認是否為右括號
				// 取出stack內括號配對 stack為空或配對不成功
				if (stack.isEmpty() || stack.peek() != map.get(c)) {
					return false;
				}
				stack.pop(); // 配對成功
			} else {
				stack.push(c); // 左括號加入stack
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		括號 hy = new 括號();
		System.out.println(hy.isBackets(str));
	}
}
