package xxx;

import java.util.HashMap;
import java.util.Stack;

/*
一字串由()[]{}三種括號組成,請試寫一程式,請驗證該字串中的括號
是否合法配對。
限制:
1.該字串最大長度為128字元
2.執行時間需小於100毫秒
輸入/輸出範例:
1.輸入:(([()])))
輸出:false
2.輸入:(){[[]]}
輸出:true
3.輸入:(([([{]})]))
輸出:false
*/

public class HongYang4 {
	
	public boolean isBrackets(String str) {
		// str為偶數
		char[] cs = str.toCharArray();
		if (cs.length % 2 != 0) {
			return false;
		}
		Stack<Character> stack = new Stack<>();
		HashMap<Character,Character> map = new HashMap<>();
		map.put(')', '(');
		map.put(']', '[');
		map.put('}', '{');
		for (int i = 0; i < cs.length; i++) {
			char c = cs[i];
			if (map.containsKey(c)) { // 右括號進入
				if (stack.isEmpty() || stack.peek() != map.get(c)) {    // stack取不到值，代表右括號是第一個字元
					return false;                                       // stack取出的值不等於該字元的value，配對失敗
				}
				stack.pop();
			} else {
				stack.push(c);
			}
		}
		return stack.isEmpty();
	}
}
