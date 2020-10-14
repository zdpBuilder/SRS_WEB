package dd.base.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dd.domain.Student;
import dd.domain.StudentCourse;
import dd.utils.EmptyUtils;

/***
 * 
 * @ClassName:  EntitryMapping   
 * @Description:对象映射类  
 * @author: 张戴鹏(zdpBuilder)
 * @date:   2020年9月28日 下午2:49:01      
 * @Copyright:  张戴鹏(zdpBuilder)
 */
public class EntityMapping {
	
	public static List<Student> studentMapping(List<Map<String,Object>> resultSet){
		List<Student> students = new ArrayList<>();
		try {
			 if(EmptyUtils.listIsEmpty(resultSet))
				 return null;
			 for (Map<String, Object> map : resultSet) {
				String id = (String) map.get("id");
				String name = (String) map.get("name");
				String major = (String) map.get("major");
				String degree = (String) map.get("degree");
				Student student = new Student(name,id,major,degree);
				students.add(student);
			 }
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return students;
	}
	public static List<StudentCourse> StudentCourseMapping(List<Map<String,Object>> resultSet){
		List<StudentCourse> studentCourses = new ArrayList<>();
		try {
			 if(EmptyUtils.listIsEmpty(resultSet))
				 return null;
			 for (Map<String, Object> map : resultSet) {
				String studentId = (String) map.get("student_id");
				String courseId = (String) map.get("course_id");
				StudentCourse studentCourse = new StudentCourse();
				studentCourse.setStudentId(studentId);
				studentCourse.setCourseId(courseId);
				studentCourses.add(studentCourse);
			 }
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return studentCourses;
	}
}
