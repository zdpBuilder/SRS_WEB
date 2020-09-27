package dd.dao;

import java.util.List;

import dd.domain.Student;

/**
 * 
 * @ClassName:  StudentDAO   
 * @Description:This interface is used to operate Student   
 * @author: zdpBuilder
 * @date:   2020年9月27日 下午7:10:21      
 * @Copyright:
 */
public interface IStudentDAO {

	/**
	 * 
	 * @Title: getAll   
	 * @Description: Query All Student   
	 * @param: @return      
	 * @return: List<Student>      
	 * @throws
	 */
	List<Student> getAll();
	
	/**
	 * 
	 * @Title: getByName   
	 * @Description: Query Student By Name   
	 * @param: @param name
	 * @param: @return      
	 * @return: Student      
	 * @throws
	 */
	Student getByName(String name);
}
