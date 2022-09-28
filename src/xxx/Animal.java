package xxx;

public class Animal {
	private int age;
	private float weight;

	public Animal() {
		
	}
	public Animal(int age, float weight) {
		this.age = age;
		this.weight = weight;
	}

	public void speak() {
		System.out.println("年紀=" + age);
		System.out.println("體重=" + weight);

	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getweight() {
		return weight;
	}
	public void getweight(float weight) {
		this.weight = weight;
	}
}
