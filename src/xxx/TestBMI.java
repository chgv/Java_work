package xxx;

public class TestBMI {
	
	public static void main(String[] args) {
	
	double kg = 63, m = 1.72, BMI = kg/(m*m);
	
	    System.out.printf("BMI=%.2f%n",BMI);
	
	    if (BMI<18.5) {
	    	System.out.println("過瘦");    
	    }
	    else if (BMI>=24) { 
	    	System.out.println("過胖");
	    }    
	    else { 
		    System.out.println("正常");	    		
	    }
}
}
