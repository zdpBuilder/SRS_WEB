package dd.utils;

import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;

public class JDBCUtils {

	private static String driver = null;
	private static String url = null;
	private static String username = null;
	private static String password = null;
	
	static {
		try {
			//读取db.properties
			Properties properties = new Properties();
			properties.load(new FileReader("config/db.properties"));
			//获取数据库类型
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			username = properties.getProperty("username");
			password = properties.getProperty("password");
			Class.forName(driver);
			
		} catch (Exception e) {
			System.out.println("SQL Exception->"+e.getMessage());
			System.exit(0);
		}
	}
	public static Connection getConnection() throws SQLException {
		return (Connection) DriverManager.getConnection(url,username,password);
	}
	public static List<Map<String,Object>> QueryBySQL(String sql,Object[] params) throws Exception {
		//获取数据链接
		Connection connection = getConnection();
		//得到预编译SQL 的 statement
		PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
		if (!EmptyUtils.arrayIsEmpty(params)){
            for(int i=0;i<params.length;i++){
            	preparedStatement.setObject(i+1, params[i]);
            }
        }
		//获得结果集
		ResultSet qResultSet = preparedStatement.executeQuery();
		//遍历结果集
		List<Map<String,Object>> list = convertList(qResultSet);
		//关闭数据库链接
		release(connection, preparedStatement, qResultSet);
		return list;
	}
	public static void release(Connection connection,Statement statement,ResultSet resultSet) {
		if(statement != null) {
			try {
				// 关闭ResultSet
				resultSet.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			resultSet = null;
		}
		if(resultSet != null) {
			try {
				resultSet.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(connection  != null) {
			try {
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * 
	 * @Title: convertList   
	 * @Description: ResultSet 结果集遍历  
	 * @param: @param rs
	 * @param: @return
	 * @param: @throws SQLException      
	 * @return: List<Map<String,Object>>      
	 * @throws
	 */
	private static List<Map<String,Object>> convertList(ResultSet rs) throws SQLException{
		List<Map<String,Object>> list = new ArrayList<>();
		ResultSetMetaData md = (ResultSetMetaData) rs.getMetaData();//获取键名
		int columnCount = md.getColumnCount();//获取行的数量
		while (rs.next()) {
		Map<String,Object> rowData = new HashMap<>();//声明Map
		for (int i = 1; i <= columnCount; i++) {
		rowData.put(md.getColumnName(i), rs.getObject(i));//获取键名及值
		}
		list.add(rowData);
		}
		return list;
		}
}
