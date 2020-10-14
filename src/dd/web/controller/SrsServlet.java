package dd.web.controller;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import dd.dao.IStudentCourseDAO;
import dd.dao.IStudentDAO;
import dd.dao.StudentCourseDAOImpl;
import dd.dao.StudentDAOImpl;
import dd.domain.Student;
import dd.domain.StudentCourse;
import dd.utils.EmptyUtils;
import dd.vo.StudentVo;


/**
 * Servlet implementation class SrsServlet
 */
@WebServlet("/SrsServlet")
public class SrsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SrsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			 
		IStudentDAO service = new StudentDAOImpl();
		List<Student> students = service.list();
		IStudentCourseDAO studentCourseDAO = new StudentCourseDAOImpl();
		List<StudentVo> studentVos = new ArrayList<StudentVo>();
		for (Student student : students) {
			List<StudentCourse> studentCourses = studentCourseDAO.getCourseListByStudentId(student.getID());
            StudentVo studentVo = new StudentVo();
            try {
				BeanUtils.copyProperties(studentVo, student);
			} catch (IllegalAccessException e) {
				 
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				 
				e.printStackTrace();
			}
			if(!EmptyUtils.listIsEmpty(studentCourses))
				studentVo.setStatus(1);
			else
				studentVo.setStatus(0);
			studentVos.add(studentVo);
		}
		request.setAttribute("students", studentVos);
			request.getRequestDispatcher("/jsp/srs.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
