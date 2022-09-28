package xxx;

public class Elephant extends Animal {

	public String name;

	public void speak() {
		super.speak();
		System.out.println("名字=" + name);
	}

	public Elephant(int age, float weight, String name) {
		super(age, weight);
		this.name = name;
	}

	public static void main(String[] args) {
		Elephant e1 = new Elephant(8, 1200, "大象");
		Animal a1 = new Animal(3, 8);
		a1.speak();
		e1.speak();
	}
}
