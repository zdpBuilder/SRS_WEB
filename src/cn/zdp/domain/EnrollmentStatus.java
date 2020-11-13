package cn.zdp.domain;

/**
 * 
 * @ClassName:  EnrollmentStatus   
 * @Description:EnrollmentStatus 类  
 * @author: zdpBuilder
 * @date:   2020年9月21日 下午8:39:01      
 * @Copyright:
 */
public enum EnrollmentStatus {

	//枚举量
	SUCCESS("注册成功"),SECTIONFULL("注册失败：已满员"),PREREQ("注册失败，前驱课程未修"),ENROLLED("注册失败，已经注册");
	
	//实例变量
	private final String value;
	
	private EnrollmentStatus(String value) {
		this.value = value;
	}
	
	public String value() {
		return value;
	}
}
