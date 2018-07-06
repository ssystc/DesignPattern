
package c9.prototype.deepclone;

import java.util.ArrayList;



public class MainTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		ArrayList<String> phoneList = new ArrayList<>();
		phoneList.add("18888888888");
		phoneList.add("18666666666");
		
		WorkExperience experience = new WorkExperience("baidu", "2years");
		
		Resume resume1 = new Resume("xiao ming");
		resume1.setPersonal(22, phoneList, experience);
		resume1.display();
		System.out.println("---------------------");
		
		Resume resume2 = resume1.clone();
		resume2.display();
		System.out.println("---------------------");
		
		resume2.setName("xiao zhang");
		resume2.setWork("huashuo", "22years");
		resume2.phoneList.add("1366666666");
		
		resume2.display();
		System.out.println("---------------------");
		
		resume1.display();
		System.out.println("---------------------");
	}

}
