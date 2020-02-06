
public class Cat  extends Animal{

	public void setSound() {
		sound = "meeeow!";
	}
	
	public void makeSound() {
		System.out.println(sound);
	}
	
	public static void main(String[] args) {
		Cat c = new Cat();
		c.setSound();
		c.makeSound();
	}

}
