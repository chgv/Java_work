package xxx;

import java.util.*;

public class lintestlist {
public static void main(String[] args) {
	var names = new ArrayList();
	CollectNameTo(names);
	System.out.println("訪客名單:");
	printUpperCase(names);
}
static void collectNameTo(List names) {
	var console = new Scanner(System.in);
	while (true) {
		System.out.print("訪客名稱:");
		var name = console.nextLine();
		if(name.equals("quit")) {
			break;
		}
		names.add(name);
		
	}
}
static void printUpperCase(List names) {
	for(var i = 0; i < names.size(); i++) {
		var name = names.get(i);
		System.out.println(name.toString());
	}
}
}
