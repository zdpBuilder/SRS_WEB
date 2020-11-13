package cn.zdp.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @ClassName:  ScheduledCourse   
 * @Description:ScheduledCourse 类  
 * @author: zdpBuilder
 * @date:   2020年9月21日 下午8:38:48      
 * @Copyright:
 */
public class ScheduledCourse {

	private int classNo; //课程号
	private String dayOfWeek; //周几
	private String timeOfDay;//时间
	private String room; //教室
	private int seatingCapacity;//课容量
	private Course representedCourse;//课程
	private Professor instructor;//任课教师
	private Map<String,Student> enrolledStudent;//选课名单
	
	
	public ScheduledCourse(int classNo, String dayOfWeek, String timeOfDay,Course representedCourse, String room, int seatingCapacity) {
		super();
		this.classNo = classNo;
		this.dayOfWeek = dayOfWeek;
		this.timeOfDay = timeOfDay;
		this.room = room;
		this.seatingCapacity = seatingCapacity;
		this.representedCourse = representedCourse;
		this.instructor = null;
		enrolledStudent =new HashMap<String,Student>();
	}
	public int getClassNo() {
		return classNo;
	}
	public void setClassNo(int classNo) {
		this.classNo = classNo;
	}
	public String getDayOfWeek() {
		return dayOfWeek;
	}
	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	public String getTimeOfDay() {
		return timeOfDay;
	}
	public void setTimeOfDay(String timeOfDay) {
		this.timeOfDay = timeOfDay;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public int getSeatingCapacity() {
		return seatingCapacity;
	}
	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	public Course getRepresentedCourse() {
		return representedCourse;
	}
	public void setRepresentedCourse(Course representedCourse) {
		this.representedCourse = representedCourse;
	}
	public Professor getInstructor() {
		return instructor;
	}
	public void setInstructor(Professor instructor) {
		this.instructor = instructor;
	}
	public Map<String, Student> getEnrolledStudent() {
		return enrolledStudent;
	}
	public void setEnrolledStudent(Map<String, Student> enrolledStudent) {
		this.enrolledStudent = enrolledStudent;
	}
	/**
	 * 返回如下格式： CS101-1，周一，上午 8：00-10：00，赵教授，2
	 */
	public String toString() {
		return getRepresentedCourse().getCourseNo()+"-"+getClassNo()+","+getDayOfWeek()+","+getTimeOfDay()+","+getInstructor()+","+getSeatingCapacity();
	}
	/***
	 * 课程号(course no.)和班号(course no.) 使用联合称为"完全号"。例如"CS101-1"
	 */
	public String getFullScheduleCourseNo() {
		return getRepresentedCourse().getCourseNo()+"-"+getClassNo();
	} 
	/**
	 * 如果容量满了，则返回枚举对象"secFull"
	 * 如果当前课里没有这个学生，则把该学生加入到选课名单中
	 */
	public EnrollmentStatus enroll(Student student) {
		EnrollmentStatus status = EnrollmentStatus.SUCCESS;
		if(enrolledStudent.size()>=getSeatingCapacity())
			status = EnrollmentStatus.SECTIONFULL;
		if(!enrolledStudent.containsValue(student))
			enrolledStudent.put(student.getID(),student);
		return status;
	}
	/**
	 * 退课
	 */
	public boolean drop(Student student) {
		if(!isEnrolledIn(student))
			return false;
		else {
			enrolledStudent.remove(student.getID());
			return true;
		}
	}
	/**
	 * 判断是否已经选过课程
	 */
	public boolean isEnrolledIn(Student student) {
		return enrolledStudent.values().contains(student);
	}
	public int getTotalEnrollment() {
		return enrolledStudent.size();
	}
	public Map<String, Student> getEnrolledStudents() {
		return enrolledStudent;
	}
	public boolean isScheduleCourseOf(Course course) {
		return course==representedCourse;
	}
}
