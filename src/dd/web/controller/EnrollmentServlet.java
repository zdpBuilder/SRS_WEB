package dd.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dd.domain.StudentCourse;
import dd.service.BusinessServiceImpl;
import dd.service.IBusinessService;

/**
 * Servlet implementation class EnrollmentServlet
 */
@WebServlet("/EnrollmentServlet")
public class EnrollmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnrollmentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		
		String studentId = request.getParameter("studentId");
		String classId = request.getParameter("classId");
		StudentCourse studentCourse = new StudentCourse();
		studentCourse.setCourseId(classId);
		studentCourse.setStudentId(studentId);
		IBusinessService businessService = new BusinessServiceImpl();
		int result = businessService.enroll(studentCourse);
		request.setAttribute("status", result);
		//处理选课
		//request.setAttribute("student", student);
		request.getRequestDispatcher("/jsp/message.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		 doGet(request, response);
	}

}
