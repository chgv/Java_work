package xxx;

public class HomeWork5_2method {
public void randAvg() {
//	• 請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值，如圖：
	int sum = 0;
	System.out.println("本次亂數結果:");
		for(int i=0;i<10;i++) {
		int n = (int) (Math.random() * 100);
		System.out.printf("%d ",n);
		sum+=n;
	}
    System.out.println();
	System.out.println("平均值:");
	System.out.println(sum/10);
}
}
