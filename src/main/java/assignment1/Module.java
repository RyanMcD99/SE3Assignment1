package assignment1;
import java.util.ArrayList;
import java.util.List;
public class Module {
	
	private String name;
	private String id;
	//Object list of registered students and String list of courses containing module
	private List<Student> regStudents = new ArrayList<Student>();
	private List<String> courses = new ArrayList<String>();
	
	public Module(String name, String id, List<Student> students) {
		this.name = name;
		this.id = id;
		regStudents = students;
		//Students registered in module have module added to their list
		for( Student s : students) {
			s.addModule(id);
		}
	}
	
	public void addCourse(String course) {
		courses.add(course);
	}
	
	public String getName() {
		return name;
	}
	
	public String getID() {
		return id;
	}
	
	public List<Student> getStudentList(){
		return regStudents;
	}
}
