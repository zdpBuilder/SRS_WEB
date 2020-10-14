package dd.domain;

/***
 * 
 * @ClassName:  StudentCourse   
 * @Description:Student association with Course
 * @author: 张戴鹏(zdpBuilder)
 * @date:   2020年10月14日 下午7:26:51      
 * @Copyright:  张戴鹏(zdpBuilder)
 */
public class StudentCourse {

	private String studentId;
	private String courseId;
	
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	
}
