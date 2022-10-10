package xxx;

import java.util.Scanner;

public class test_1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int weight = 0;
	weight=sc.nextInt();
	
	if(weight >= 1 && weight <= 5)
        System.out.println(("display="+(299 + 30 * weight)));
    else if(weight > 5) {
    	
    	System.out.println("display="+(299 + 30 * 5 + 20 * (weight - 5)));
    }
}
}
