package assignment1;
import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private int age;
	private String DOB;
	private String username;
	private List<String> modules = new ArrayList<String>();
	private List<String> courses = new ArrayList<String>();
	
	public Student(String name, int age, String DOB) {
		this.name = name;
		this.age = age;
		this.DOB = DOB;
	}
	
	public String getName() {
		return name;
	}
	
	public String getUsername() {
		username = name + Integer.toString(age);
		return username;
	}
	
	public List<String> getCourses() {
		return courses;
	}
	
	public List<String> getModules() {
		return modules;
	}
	
	
	public void addModule(String modCode) {
		modules.add(modCode);
	}
	
	public void addCourse(String courseCode) {
		courses.add(courseCode);
	}
	

}
