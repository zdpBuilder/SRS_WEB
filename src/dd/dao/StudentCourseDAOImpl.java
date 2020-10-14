package dd.dao;

import java.util.List;

import dd.base.dao.BaseDAOImpl;
import dd.domain.StudentCourse;

/**
 * 
 * @ClassName:  StudentCourseDAOImpl   
 * @Description:This service is for implements StudentCourseDAOImpl    
 * @author: 张戴鹏(zdpBuilder)
 * @date:   2020年9月28日 下午2:28:37      
 * @Copyright:  张戴鹏(zdpBuilder)
 */
@SuppressWarnings("unchecked")
public class StudentCourseDAOImpl extends BaseDAOImpl<StudentCourse> implements IStudentCourseDAO {



 
	@Override
	public List<StudentCourse> list() {
		return (List<StudentCourse>)this.getListExample(new StudentCourse(),"select * from student_course",null);	
	}

	@Override
	public List<StudentCourse> getCourseListByStudentId(String studentId) {
		return(List<StudentCourse>)this.getListExample(new StudentCourse(),"select * from student_course where student_id=?",new Object[]{studentId});	
	}

	@Override
	public int insert(StudentCourse studentCourse) {
		 String sql = "insert into student_course values('"+studentCourse.getStudentId()+"','"+studentCourse.getCourseId()+"')";
		return this.save(sql);
	}

}
