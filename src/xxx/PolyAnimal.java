package xxx;

public class PolyAnimal {
public static void main(String[] args) {
	Animal[] e = new Animal[2];
    e[0] = new Animal(2, 5.0f);
    e[1] = new Elephant(8, 1200, "大象");
   
    for (int i = 0; i < e.length; i++)
         e[i].speak();
}
}
