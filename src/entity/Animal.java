package entity;

public class Animal {

	private int age;
	private int weight;

	public void running() {
		System.out.println("running");
	}

	public void eating() {
		System.out.println("eating");
	}


	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
