package cn.zdp.utils;

import java.util.List;
import java.util.Map;
/***
 * 
 * @ClassName:  EmptyUtils   
 * @Description:判空工具包   
 * @author: zdpBuilder
 * @date:   2020年9月21日 下午8:14:04      
 * @Copyright:
 */
public class EmptyUtils {
	
	/***
	 * 
	 * @Title: stringIsEmpty   
	 * @Description: 判断 String 类型是否为空  
	 * @param: @param str
	 * @param: @return      
	 * @return: boolean      
	 * @throws
	 */
	public static boolean stringIsEmpty(String str) {
		return str == null || str.trim().isEmpty();
	}
	
	/***
	 * 
	 * @Title: intIsEmpty   
	 * @Description: 判断 int 类型是否为空   
	 * @param: @param number
	 * @param: @return      
	 * @return: boolean      
	 * @throws
	 */
	@SuppressWarnings("unlikely-arg-type")
	public static boolean intIsEmpty(Integer number) {
		return  null == number || "".equals(number);
	}
	

	/**
	 * 
	 * @Title: longIsEmpty   
	 * @Description: 判断 long 类型是否为空  
	 * @param: @param number
	 * @param: @return      
	 * @return: boolean      
	 * @throws
	 */
	@SuppressWarnings("unlikely-arg-type")
	public static boolean longIsEmpty(Long number) {
		return  null == number || "".equals(number);
	}

	
	/**
	 * 
	 * @Title: listIsEmpty   
	 * @Description: 判断 List 类型是否为空   
	 * @param: @param list
	 * @param: @return      
	 * @return: boolean      
	 * @throws
	 */
	public static <T> boolean listIsEmpty(List<T> list) {
		return list == null || list.isEmpty();
	}
	
	/***
	 * 
	 * @Title: mapIsEmpty   
	 * @Description:判断 Map 类型是否为空
	 * @param: @param map
	 * @param: @return      
	 * @return: boolean      
	 * @throws
	 */
	public static <K, V> boolean mapIsEmpty(Map<K, V> map) {
		return map == null || map.isEmpty();
	}
	
	/**
	 * 
	 * @Title: arrayIsEmpty   
	 * @Description: 判断 Array 类型是否为空  
	 * @param: @param array
	 * @param: @return      
	 * @return: boolean      
	 * @throws
	 */
	public static boolean arrayIsEmpty(Object[] array){
		return array == null || array.length == 0;
	}

	/***
	 * 
	 * @Title: objectIsEmpty   
	 * @Description: 判断 object 类型是否为空 
	 * @param: @param object
	 * @param: @return      
	 * @return: boolean      
	 * @throws
	 */
	public  static  boolean objectIsEmpty(Object object){return object==null;}
}
