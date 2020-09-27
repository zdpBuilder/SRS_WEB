package dd.domain;

/***
 * 
 * @ClassName:  Course   
 * @Description:Course 类
 * @author: zdpBuilder
 * @date:   2020年9月21日 下午8:39:35      
 * @Copyright:
 */
public class Course {

	private String courseNo;
	private String courseName;
	private double credits;
	
	public Course(String courseNo, String courseName, double credits) {
		super();
		this.courseNo = courseNo;
		this.courseName = courseName;
		this.credits = credits;
	}
	
	public String getCourseNo() {
		return courseNo;
	}
	public void setCourseNo(String courseNo) {
		this.courseNo = courseNo;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getCredits() {
		return credits;
	}
	public void setCredits(double credits) {
		this.credits = credits;
	}
	
	public String toString() {
		return getCourseNo() +":"+getCourseName()+","+getCredits()+"学分";
	}
	
	public ScheduledCourse getScheduleCourse(String day,String time,String room,int capacity,int classNo) {
		ScheduledCourse scheduledCourse= new ScheduledCourse(classNo,day,time,this,room,capacity);
		return scheduledCourse;
	}
}
