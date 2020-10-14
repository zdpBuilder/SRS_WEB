<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生选课系统</title>
</head>
<body>
 	 <jsp:include page="common/header.jsp" flush="true" ></jsp:include>
 <div style="padding: 20px; background-color: #F2F2F2;">
  <div class="layui-row layui-col-space15">
    <div class="layui-col-md12">
      <div class="layui-card">
        <div class="layui-card-header">进行选课</div>
        <div class="layui-card-body">
        <form class="layui-form"  method="POST"  action="${pageContext.request.contextPath }/EnrollmentServlet" >
		  <div class="layui-row layui-col-space15"> 
			  <div class="layui-col-md6">
				  <div class="layui-form-item">
				    <label class="layui-form-label">学号ID</label>
				    <div class="layui-input-block">
				      <input  disabled name="studentId"  value="${student.ID}"  class="layui-input" style="border:none">
				   	  <input  style="display:none" name="studentId"  value="${student.ID}"  class="layui-input">
				    </div>
				  </div>
			  </div>
			  <div class="layui-col-md6">
				  <div class="layui-form-item">
				    <label class="layui-form-label">课程号</label>
				    <div class="layui-input-block">
				      <input type="text" name="classId" lay-verify="classId" autocomplete="off" placeholder="请输入标题" class="layui-input">
				    </div>
				  </div>
			  </div>	  
		</div>
		  <div class="layui-form-item">
		    <div class="layui-input-block" style="display:flex;align-items:center;justify-content:center;" >
		     
		      <button type="submit" class="layui-btn" >提交</button>   
		    </div>
		  </div>
</form>
        </div>
      </div>
    </div>
  </div>
</div> 
</body>
</html>