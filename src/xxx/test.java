package xxx;

public class test {
	public static int rabbit(int month)
	{
		//第一個月和第二個月兔子的數量都是一，因為第一隻兔子還沒有長成大兔子，沒有繁殖能力。
		if(month==1||month==2)
			return 1;
		//根據裴波那契數列: month月的兔子對數 = (month-1)月的兔子對數 + (month-2)月的兔子對數  
		return rabbit(month-1)+rabbit(month-2);      
	}
	
	public static void main(String[] args) {
		int month = 36;
		System.out.println("第"+month+"個月，有"+rabbit(month)*2+"隻兔子");
		
		int i = 1;
		int j = i++;
		if((i==(++j))&&((i++)==j)) {
			i+=j;
		}
		System.out.println(i);
		
		boolean flag = 10%2==1 && 10/3==0 && 1/0==0;
		System.out.println(flag?"true":"false");
	}
}