package dd.junit4;

import java.util.List;

import org.junit.Test;

import dd.dao.IStudentDAO;
import dd.dao.StudentDAOImpl;
import dd.domain.Student;
import dd.utils.EmptyUtils;

public class DaoImplTest {

	IStudentDAO studentDAO = new StudentDAOImpl();
	@Test
	public void testStudentGetAll() {
		 
		 List<Student>students = studentDAO.getAll();
		 if(EmptyUtils.objectIsEmpty(students)) {
			 System.out.println("暂无学生信息");
			 return;
		 }
			 
		 System.out.println("学生姓名依次为");
		 for (Student student : students) {
			System.out.println(student.getName());
		}
	}

	@Test
	public void testStudentGetByName() {
		Student student = studentDAO.getByName("李四");	 
		System.out.println(EmptyUtils.objectIsEmpty(student)?"查无此人":student.getName());
	}

}
