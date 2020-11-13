package dd.junit4;

import java.util.List;

import org.junit.Test;

import cn.zdp.dao.IStudentDAO;
import cn.zdp.dao.StudentDAOImpl;
import cn.zdp.domain.Student;
import cn.zdp.utils.EmptyUtils;

public class DaoImplTest {

	IStudentDAO studentDAO = new StudentDAOImpl();
	@Test
	public void testStudentGetAll() {
		 
		 @SuppressWarnings("unchecked")
		List<Student>students = (List<Student>)studentDAO.getListExample(new Student(),"select * from student", null);
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
