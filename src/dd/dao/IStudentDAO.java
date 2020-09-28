package dd.dao;

import dd.base.dao.IBaseDAO;
import dd.domain.Student;

/***
 * 
 * @ClassName:  IStudentDAO   
 * @Description:This interface is used to operate Student   
 * @author: 张戴鹏(zdpBuilder)
 * @date:   2020年9月28日 下午2:28:26      
 * @Copyright:  张戴鹏(zdpBuilder)
 */
public interface IStudentDAO extends IBaseDAO<Student> {
	
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
