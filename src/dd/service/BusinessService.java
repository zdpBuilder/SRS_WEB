package dd.service;

import dd.domain.EnrollmentStatus;

/***
 * 
 * @ClassName:  BusinessService   
 * @Description:BusinessService   
 * @author: zdpBuilder
 * @date:   2020年9月27日 下午3:09:44      
 * @Copyright:
 */
public interface BusinessService {

	public EnrollmentStatus enroll(String id,String calssId);
}
