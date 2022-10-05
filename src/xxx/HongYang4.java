package xxx;

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
public class HongYang4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("請輸入驗證符號:");
	String s = sc.next();
	HongYang4 b = new HongYang4();
	System.out.println(b.isValid(s));
	
}
	
	public boolean isValid(String s) {
	    Stack<Character> stack = new Stack<Character>();
	    
	    for(int i=0; i<s.length(); i++ ) {        
	        if (isLeftParentheses( s.charAt(i) ) ) {
	            stack.push(s.charAt(i) );
	        } else if (isRightParentheses(s.charAt(i)) ) {            
	            if (stack.size() <=0 ) 
	                return false;
	            Character pair = stack.pop();
	            Character ch = getParenthesesPair(s.charAt(i));
	            if ( pair != ch )
	                return false;
	        }
	    }
	    
	    if (stack.size() > 0) //檢查有沒有落單的左括號
	        return false;
	    return true;
	}

	private boolean isLeftParentheses(Character c) {
	    if ( c == '[' || c == '{' || c == '(')
	        return true;
	    return false;
	}

	private boolean isRightParentheses(Character c) {
	    if ( c==']' || c=='}' || c==')' )
	        return true;
	    return false;
	}

	private Character getParenthesesPair(Character c) {
	    if ( c == ']' )
	        return '[';
	    else if ( c == '}' )
	        return '{';
	    else if ( c == ')' )
	        return '(';
	    else
	        return ' ';
	}
}
