package xxx;

public class Student {
	
	int score = 90;
	
	public void play(int hours) {
		score -= hours; 
	}
    public void stuby(int hours) {
    	score += hours; 
	}

    public static void main(String[] args) {
		Student no1 = new Student();
		no1.play(2);
		no1.stuby(4);
		System.out.println(no1.score);
		
		Student no2 = new Student();
		no2.play(6);
		no2.stuby(2);
		System.out.println(no2.score);
	}
}
