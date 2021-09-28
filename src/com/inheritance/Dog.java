package com.inheritance;

public class Dog {
	String name;
	String breed;
	int age;
	String color;
	public Dog(String name, String breed, int age, String color) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}
	public Dog(String breed)
	{
		this.breed=breed;
	}
	public Dog()
	{
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + ", color=" + color + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog("Scott","pappilon",11,"black");
		System.out.println(d.toString());
	}

}
