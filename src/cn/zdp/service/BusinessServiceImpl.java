package cn.zdp.service;

import cn.zdp.dao.IStudentCourseDAO;
import cn.zdp.dao.StudentCourseDAOImpl;
import cn.zdp.domain.EnrollmentStatus;
import cn.zdp.domain.StudentCourse;

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
