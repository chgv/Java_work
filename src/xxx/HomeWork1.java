package xxx;

public class HomeWork1 {
	public static void main(String[] args) {
//	第一題
		
		int i = 6, j = 12;
		
		System.out.println("6+12="+(i+j));
		System.out.println("6*12="+(i*j));
		
		System.out.println("---------------------------------------------------");

//	第二題	
		int total = 200, dozen = total/12, egg = total%12;
		
		System.out.println(dozen+"打"+egg+"顆");
		
		System.out.println("---------------------------------------------------");

//	第三題
		int s = 256559;
		int d = s/(60*60*24);
		s %= 60*60*24;
		int h = s/(60*60);
		s %= 60*60;
		int m = s/60;
		s %= 60;
		
		System.out.println(d+"天"+h+"時"+m+"分"+s+"秒");
		
		System.out.println("---------------------------------------------------");

//	第四題		
		final double PI = 3.1415;
		int r = 5;
		double c = PI*r*2, ca = PI*(r*r);
		System.out.printf("圓面積 = %.4f, 圓周長 = %.4f", ca, c);
		System.out.println();
		System.out.println("---------------------------------------------------");

//	第五題
		double p = 1500000;  //本金
		int n = 10;           //期數
		double u = 0.02;     //利率
		
		double sum = p*Math.pow(1+u, n); //複利公式 期末本利和＝期初本金×（1＋利率）期數次方
			
			System.out.println("本金加利息="+sum);
			
			System.out.println("---------------------------------------------------");

//	第六題
	    //數字5+數字5 = 5+5 = 10
		System.out.println(5+5);
		
		//數字5+字元5(unicode表查得35(十六進位),轉換成十進位為53) = 5+53 =58
		System.out.println(5+'5');
		
		//數字5+字串5(代表文字資料) = 5+5(字串文字串接) = 55
		System.out.println(5+"5");
		
	}
}
