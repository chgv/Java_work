package xxx;

public class HomeWork5_5 {
//	• 身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
//	genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
//	與數字的亂數組合，如圖
	public void genAuthCode() {
		int[] var = new int[8];
        int n;
		System.out.println("本次隨機碼為:");             
		for (int i = 0; i < var.length; i++) {        // 大寫字母A~Z(65~90)
			while (true) {                            // 小寫字母a~z(97~122)
				n = (int) (Math.random() * 75) + 48;  // 數字0~9(48~57)
				if ((47 < n && n < 58) || (64 < n && n < 91) || (96 < n && n < 123)) { 
					var[i] = n;
					System.out.print((char) var[i]);
					break;
				}
			}
		}
	}
}