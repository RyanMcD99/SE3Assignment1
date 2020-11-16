  
package assignment1;
import org.joda.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
public class Test {
	
	public Test() {
		
	}
	@Test
	public void testUsername() {
		Student student = new Student("Ryan", 21, "11/04/1999");
		String username = student.getUsername();
		
		assertEquals("Ryan21", username);
	}
	
	@Test
	public void testDates() {
		List<Student> regStudents = new ArrayList<Student>();
		List<Module> modules = new ArrayList<Module>();
		Course course = new Course("ECE", "01/09/2017", "30/05/2021",modules, regStudents);
		LocalDate correctStartDate = new LocalDate(2017,9,01);
		assertEquals(correctStartDate, course.getStartDate());
	}
	
	@Test
	public void testModuleID() {
		List<Student> regStudents = new ArrayList<Student>();
		Module module = new Module("Software Engineering 3", "CT417", regStudents);
		String moduleID = module.getID();
		assertEquals("CT417", moduleID);
	}
}