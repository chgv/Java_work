package xxx;

import java.io.Serializable;

public class Dog implements Serializable, Animal_I{
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}
