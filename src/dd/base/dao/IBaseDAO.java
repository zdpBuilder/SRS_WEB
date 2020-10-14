package dd.base.dao;

import java.util.List;


/***
 * 
 * @ClassName:  IBaseDAO   
 * @Description:common DAO    
 * @author: 张戴鹏(zdpBuilder)
 * @date:   2020年9月28日 上午11:18:17    
 * @param <T>  
 * @Copyright:  张戴鹏(zdpBuilder)
 */
public interface IBaseDAO<T> {

	/**
	 * 
	 * @Title: getListExample   
	 * @Description: Query All Student   
	 * @param: @return      
	 * @return: List<Student>      
	 * @throws
	 */
	List<?> getListExample(T entity,String sql, Object[] params);
	
	/***
	 * 
	 * @Title: save   
	 * @Description: save T and update T By SQL
	 * @param: @param entity
	 * @param: @return      
	 * @return: List<T>      
	 * @throws
	 */
	int save(String sql);
}
