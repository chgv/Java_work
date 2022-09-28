package xxx;

import java.util.Arrays;

public class HomeWork5_3 {
//	• 利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，
//	可以找出二維陣列的最大值並回傳，如圖
	public static void main(String[] args) {
		HomeWork5_3Method hw = new HomeWork5_3Method();
		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		System.out.println(hw.maxElement(intArray));
		System.out.println(hw.maxElement(doubleArray));
	}
}