package c9.prototype.simpleclone;

import java.util.ArrayList;

public class Resume implements Cloneable {

	public String name;
	public int age;
	public ArrayList<String> phoneList;
	public WorkExperience experience;
	
	public Resume(String name) {
		this.name = name;
	}
	
	public void setPersonal(int age, ArrayList<String> phoneList, WorkExperience experience) {
		this.age = age;
		this.phoneList = phoneList;
		this.experience = experience;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setWork(String company, String timeArea) {
		this.experience.company = company;
		this.experience.timeArea = timeArea;
	}
	
	public void display() {
		System.out.println(String.format("name: %s, age: %s", name, age));
		for (String s: phoneList) {
			System.out.println("phone:" + s);
		}
		System.out.println("company:" + experience.company);
		System.out.println("timeArea:" + experience.timeArea);
		
	}
	
	@Override
	public Resume clone() throws CloneNotSupportedException {
		return (Resume)super.clone();
	}
	
}
