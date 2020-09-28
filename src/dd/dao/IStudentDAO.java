package dd.dao;

import java.util.List;

import dd.domain.Student;

/***
 * 
 * @ClassName:  IStudentDAO   
 * @Description:This interface is used to operate Student   
 * @author: 张戴鹏(zdpBuilder)
 * @date:   2020年9月28日 下午2:28:26      
 * @Copyright:  张戴鹏(zdpBuilder)
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
