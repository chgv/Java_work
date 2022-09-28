package xxx;

import java.util.Scanner;

public class webcomm {
	public static void main(String[] args) {
		
		int count = 0;
		for(int i = 1; i <= 9999/3; i++) {
			count += i*3;
		}
		System.out.println(count);
	}
}