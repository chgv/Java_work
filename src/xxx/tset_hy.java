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


public class tset_hy {
	public boolean isBrackets(String str) {
//		int s = str.length();
		// 字串括號字元數量為偶數
		char[] cs = str.toCharArray();
		if(cs.length%2!=0){
			return false;
		}	
		// 括號存進hashmap
		HashMap<Character, Character> map = new HashMap<>();
		map.put(')', '(');
		map.put(']', '[');
		map.put('}', '{');
		
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < cs.length; i++) {
			char c = cs[i];
			if(map.containsKey(c)) {
				// 右括號 stack 取出比對
				// 第一字元不為右括號
				if(stack.isEmpty()||stack.peek()!=map.get(c)) {
					return false;
				}else {
					stack.pop();
				}
				// 左括號存進stack
			}else {
				stack.push(c);
			}
		}	
		return stack.isEmpty();	
	}
	
}
