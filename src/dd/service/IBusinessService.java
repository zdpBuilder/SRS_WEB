package dd.service;

import dd.domain.EnrollmentStatus;
import dd.domain.StudentCourse;

/***
 * 
 * @ClassName:  BusinessService   
 * @Description:BusinessService   
 * @author: zdpBuilder
 * @date:   2020年9月27日 下午3:09:44      
 * @Copyright:
 */
public interface IBusinessService {

	public int enroll(StudentCourse studentCourse);
}
