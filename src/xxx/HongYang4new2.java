package xxx;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
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
public class HongYang4new2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		HongYang4new2 hy = new HongYang4new2();
		System.out.println(hy.isBackets(str));
	}
public boolean isBackets(String str) {
	// 括號數量為偶數
	int s = str.length();
	if(s%2!=0) {
		return false;
	}
	
	// 左括號&右括數量相符 括號配對
	HashMap<Character,Character> map = new HashMap<>();
	map.put(')', '(');
	map.put(']', '[');
	map.put('}', '{');
	
	// stack 後進先出
	Stack<Character> stack = new Stack<>();
	for(int i = 0; i< s; i++) {
		char c = str.charAt(i);
		if(map.containsKey(c)) {  // 如果是右括號
			if(stack.isEmpty()||stack.peek()!=map.get(c)) {
				return false;
			}
			stack.pop();
		}else {
			stack.push(c);
		}
	}
	
	return stack.isEmpty();
}
}
