package dd.dao;

import java.util.List;

import dd.base.dao.IBaseDAO;
import dd.domain.StudentCourse;

/***
 * 
 * @ClassName:  IStudentDAO   
 * @Description:This interface is used to operate Student   
 * @author: 张戴鹏(zdpBuilder)
 * @date:   2020年9月28日 下午2:28:26      
 * @Copyright:  张戴鹏(zdpBuilder)
 */
public interface IStudentCourseDAO extends IBaseDAO<StudentCourse> {
	
	/***
	 * 
	 * @Title: getCourseListByStudentId   
	 * @Description: According to studentId query selected Course; 
	 * @param: @param studentId
	 * @param: @return      
	 * @return: StudentCourse      
	 * @throws
	 */
	List<StudentCourse> getCourseListByStudentId(String studentId);
	/***
	 * 
	 * @Title: list   
	 * @Description: query Student and get Entity List  
	 * @param: @param student
	 * @param: @return      
	 * @return: List<Student>      
	 * @throws
	 */
	List<StudentCourse> list();
	
	/***
	 * 
	 * @Title: insert   
	 * @Description: insert StudentCourse Entity   
	 * @param: @param studentCourse
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int insert(StudentCourse studentCourse);
}
