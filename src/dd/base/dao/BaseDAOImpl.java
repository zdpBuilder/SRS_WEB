package dd.base.dao;

import java.util.List;
import java.util.Map;
import dd.domain.Student;
import dd.domain.StudentCourse;
import dd.utils.JDBCUtils;

/***
 * 
 * @ClassName:  BaseDAOImpl   
 * @Description:common BaseDAO   
 * @author: 张戴鹏(zdpBuilder)
 * @date:   2020年9月28日 上午11:17:52    
 * @param <T>  
 * @Copyright:  张戴鹏(zdpBuilder)
 */
public class BaseDAOImpl<T> implements IBaseDAO<T>{
	 
	
	@Override
	public List<?> getListExample(T entity,String sql, Object[] params){
		// TODO Auto-generated method stub
		List<Map<String, Object>> resultSet;
		try {
			resultSet = JDBCUtils.QueryBySQL(sql,params);
			if(entity instanceof Student)
				return  EntityMapping.studentMapping(resultSet);
			if(entity instanceof StudentCourse)
				return  EntityMapping.StudentCourseMapping(resultSet);
			else
				return null;
		} catch (Exception e) {
			 System.out.println("数据库查询数据 异常-->"+e.getMessage());
			 return null;
		}	
	}

	@Override
	public int save(String sql) {
		
		try {
			return JDBCUtils.saveBySQL(sql);
		} catch (Exception e) {
			System.out.println("数据库更新数据异常-->"+e.getMessage());
			e.printStackTrace();
			return 0;
		}
	}
	 
}
