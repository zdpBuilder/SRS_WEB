package dd.junit4;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import dd.utils.JDBCUtils;

public class JDBCTest {

	@Test
	public void test() throws Exception {
		String sql = "select *from student";
		
		List<Map<String, Object>> resultSet = JDBCUtils.QueryBySQL(sql,null);
		System.out.println("数据库中学生姓名依次为:");
		for (Map<String, Object> map : resultSet) {
			System.out.println(map.get("name"));
		}
	}

}
