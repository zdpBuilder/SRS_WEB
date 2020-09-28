package dd.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dd.domain.Student;
import dd.utils.EmptyUtils;
import dd.utils.JDBCUtils;

/**
 * 
 * @ClassName:  StudentDAOImpl   
 * @Description:This service is for implements StudentDAO    
 * @author: 张戴鹏(zdpBuilder)
 * @date:   2020年9月28日 下午2:28:37      
 * @Copyright:  张戴鹏(zdpBuilder)
 */
public class StudentDAOImpl implements IStudentDAO {

	private List<Student> queryBySQL(String sql,Object[] params){
		List<Student> students = new ArrayList<>();
		List<Map<String,Object>> resultSet = null;
		try {
			 resultSet = JDBCUtils.QueryBySQL(sql,params);
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
	@Override
	public List<Student> getAll() {
		
		return queryBySQL("select * from student",null);
	}

	@Override
	public Student getByName(String name) {
		
		List<Student> students = queryBySQL("select * from student where name = ?",new Object[] {name});	
		return EmptyUtils.listIsEmpty(students)?null:students.get(0);
	}

}
