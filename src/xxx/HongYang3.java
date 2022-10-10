package xxx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
輸入整數n，輸出其質因數分解結果。
質因數:一個大於1的整數本質數，它本身是質數，而且又某數的因數，則
稱它為某數的質因數。
例(1):5的因數有1、5，而且5是質數，所以5就是5的質因數·
例(2):9的因數有1、3、9，其中3是質數，所以3就是9質因數·
例(3):21的因數有1、3、7、21，其中3和7都是質數，所以3和7
都是21的質因數.
提示:
質因數分解:把一個整數寫成它的質因數的連乘積，稱為質因數分解。
例(1):把15質因數分解，可以寫成15=3x5。而且15的質因數只有
3和5，共2個。
例(2):把60質因數分解，可以寫成60=2x2x3x5。而且60的質因數
只有2、3、5，共3個。
限制:
1.輸入值範圍2<=n<=2147483647
2.執行時間需小於100毫秒
輸入/輸出範例:
1.輸入:600
輸出:2^3*3*5^2
2.輸入:924
輸出:2^2*3*7*11
3.輸入:123456789
輸出:3^2*3607*3803
 */
public class HongYang3 {
	private static Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    private static List<Integer> yinshu = new ArrayList<Integer>();
    

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        int j = scan.nextInt();
      System.out.print(j+"=");
    
        fengjie(j);
        playResult(map,yinshu);
        
    }
    
     public static void fengjie(int n){
         int flag=1;
         while (n > 1) {
                for (int i = 2; i <= n; i++) { 
                    if (n % i == 0) { 
                        flag=i;

                        if(!yinshu.contains(i)){
                            yinshu.add(i);
                        }
                        
                        if(!map.containsKey(i)){
                            map.put(i, 1);
                            
                        }else{
                            map.put(i, map.get(i)+1);
                        }

                        break;
                    }
                }
                n = n / flag; 
            }
         

            }
     
    public static void playResult(Map<Integer,Integer> map,List<Integer> yinshu){
       String result ="";
        for(int i=0;i<yinshu.size();i++){
            if(map.get(yinshu.get(i))!=1){
                result+="*"+yinshu.get(i)+"^"+map.get(yinshu.get(i));
            }else{
                result+="*"+yinshu.get(i);
            }
            
        }  
        
        System.out.println(result.substring(1));
 }
}
