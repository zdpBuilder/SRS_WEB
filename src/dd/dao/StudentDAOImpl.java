package dd.dao;

import java.util.List;

import dd.base.dao.BaseDAOImpl;
import dd.domain.Student;
import dd.utils.EmptyUtils;

/**
 * 
 * @ClassName:  StudentDAOImpl   
 * @Description:This service is for implements StudentDAO    
 * @author: 张戴鹏(zdpBuilder)
 * @date:   2020年9月28日 下午2:28:37      
 * @Copyright:  张戴鹏(zdpBuilder)
 */
@SuppressWarnings("unchecked")
public class StudentDAOImpl extends BaseDAOImpl<Student> implements IStudentDAO {



	@Override
	public Student getByName(String name) {
		List<Student> students = (List<Student>)this.getListExample(new Student(),"select * from student where name = ?",new Object[] {name});	
		return EmptyUtils.listIsEmpty(students)?null:students.get(0);
	}

	@Override
	public List<Student> list() {
		return (List<Student>)this.getListExample(new Student(),"select * from student",null);	
	
	}

}
