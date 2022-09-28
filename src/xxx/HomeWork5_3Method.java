package xxx;

import java.util.Arrays;

public class HomeWork5_3Method {
	public int maxElement(int x[][]) {
		Arrays.sort(x[0]);
		Arrays.sort(x[1]);
		if(x[0][2]>x[1][2]) {
			return x[0][2];
		}
		return x[1][2];
	}
	
	
	
	public double maxElement(double x[][]) {
		Arrays.sort(x[0]);
		Arrays.sort(x[1]);
		if(x[0][2]>x[1][2]) {
			return x[0][2];
		}
		return x[1][2];
	}

}
