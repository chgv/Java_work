package xxx;
import java.util.*;
/*
假設有5種類型的硬幣：50、25、10、5 和1•而我們可以使用這些硬幣的不同組合得到相同的總和金額。
例如•我們所需金額為 11 元•那麼我們可以有以下四種組合方式得到此金額：
"一個10元硬幣和一個1元硬幣”，
"二個5元硬幣和一個1元硬幣”、
"一個5元硬幣和六個1元硬幣”、
"十一個1元硬幣”

試寫一程式•找出翰入金額總共有多少種的硬幣組合方式 •
限制：
1.輸入金額最大值為 7489
2.執行時間需小於 1000 毫秒

輸入/輸出範例：
1.輸入：11       輸出：4
2.輸入：26       輸出：13
3.輸入：1000     輸出：801451
*/

public class HongYang12 {
    public static void main(String[] args) {
    	System.out.println("請輸入總金額:");
    	while (true) {
    		Scanner sc = new Scanner(System.in);
    		SolutionTest solution = new SolutionTest();
    		int n = sc.nextInt();
    		long start=System.currentTimeMillis(); //获取开始时间
    		if(n>7489) {
    			System.out.println("輸入金額超出範圍,請重新輸入");
    		}else {
//            int res = solution.groupCoin(new int[]{1,5,10,25,50},n);   // 方法一
//    			int res = solution.change(n,new int[]{1,5,10,25,50});         // 方法二
    		int res = solution.dfs(n,new int[]{1,5,10,25,50},4);       // 方法三
    			System.out.printf("共有%d種組成方式",res);
    			System.out.println();
    			long end=System.currentTimeMillis(); //获取结束时间
    			System.out.println("程序运行时间： "+(end-start)+"ms");
    		}
		}
    	 
        //要测的程序或方法
     
     
    }
}

class SolutionTest {
//    public int groupCoin(int[]coins,int num){       // 方法一
//        int n = coins.length;
//        int m = num;
//        int[][] dp = new int[n+1][m+1];
//        for(int i =0;i<=n;i++){
//            dp[i][0] = 1;
//        }
//        for(int i = 1;i<=n;i++){
//            for(int j =1;j<=m;j++){
//                dp[i][j] = dp[i-1][j];
//                int coin = coins[i-1];
//                for(int k =1;k<=j/coin;k++){
//                    dp[i][j]+=dp[i-1][j-k*coin];
//                }
//            }
//        }
//        return dp[n][m];
//    }

	
//	public int change(int amount, int[] coins) {     // 方法二 (優化方法一) https://juejin.cn/post/7031423458990899208
//        int n = coins.length;
//        int[][] f = new int[n + 1][amount + 1];
//        f[0][0] = 1;   // 使用0種硬幣，凑0元,也是一種方案
//        for (int i = 1; i <= n; i++) {
//            int v = coins[i - 1];
//            for (int j = 0; j <= amount; j++) 
//                for (int k = 0; k * v <= j; k++) 
//                    f[i][j] += f[i - 1][j - k * v];  // 狀態計算
//        }
//        return f[n][amount];
//    }
	
		
		
	

    public int dfs(int n ,int[] coins,int cur){     // 方法三
        if(cur == 0)return n%coins[cur] == 0?1:0;
        int res = 0;
        for(int i =0;i*coins[cur]<=n;i++){
            int shenyu = n-i*coins[cur];
            res += dfs(shenyu,coins,cur-1);
        }
        return res;
    }

}