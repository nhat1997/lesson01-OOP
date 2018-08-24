package nhat.dev.models;

public class Person {
	private String name;
	private int age;
	
	public Person (String name, int age) {
		this.name = name;
		this.age = age;			
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void show() {
		System.out.println(name + ":" + age);
	}
}