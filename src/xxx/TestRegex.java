package xxx;

import java.util.Scanner;

public class TestRegex {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String i = sc.next();
	String regex = "^[A-Za-z][12]\\d{8}$";
	if(i.toUpperCase().matches(regex)) {
		System.out.println("OK");
	}else {
		System.out.println("NO");
	}
}
}
