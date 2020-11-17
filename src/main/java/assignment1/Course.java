package assignment1;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Course {
	private String name;
	private List<Module>modules = new ArrayList<Module>();
	private List<Student>students = new ArrayList<Student>();
	private LocalDate startDate;
	private LocalDate endDate;
	private DateTimeFormatter dtf = DateTimeFormat.forPattern("dd/MM/yyyy"); //Formatter used to convert string to Joda Time
	
	public Course(String name, String startDate, String endDate, List<Module> modules, List<Student> students) {
		this.name = name;
		this.startDate = LocalDate.parse(startDate, dtf); //Parsed using formatter to convert to joda time
		this.endDate = LocalDate.parse(endDate, dtf);
		this.modules = modules;
		this.students = students;
		
		//Modules and students registered in course have the course name added to their list of courses
		for(Module m : modules) {
			m.addCourse(name);
		}
		for(Student s : students) {
			s.addCourse(name);
		}
	}
	
	public String getCourseName() {
		return name;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	public List<Module> getModules(){
		return modules;
	}
	
	public List<Student> getStudents(){
		return students;
	}
}