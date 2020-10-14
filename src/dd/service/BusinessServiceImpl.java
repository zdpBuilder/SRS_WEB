package dd.service;

import dd.dao.IStudentCourseDAO;
import dd.dao.StudentCourseDAOImpl;
import dd.domain.EnrollmentStatus;
import dd.domain.StudentCourse;

/***
 * 
 * @ClassName:  BusinessImpl   
 * @Description:Service implements  
 * @author: zdpBuilder
 * @date:   2020年9月27日 下午3:07:16      
 * @Copyright:
 */
public class BusinessServiceImpl implements IBusinessService{

	@Override
	public int enroll(StudentCourse studentCourse) {
		
		IStudentCourseDAO studentCourseDAO = new StudentCourseDAOImpl();
		
		return studentCourseDAO.insert(studentCourse);
	}
}
