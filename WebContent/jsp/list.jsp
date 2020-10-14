<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="common/common.jsp" %>
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
        <div class="layui-card-header">学生列表</div>
        <div class="layui-card-body">
  <table class="layui-table">
<colgroup>
    <col >
    <col >
    <col >
    <col>
    <col width="100">
  </colgroup>
  <thead>
    <tr>
      <th>学号</th>
      <th>姓名</th>
      <th>专业</th>
      <th>学位</th>
      <th >操作</th>
    </tr> 
  </thead>
  <tbody>
  <c:forEach var="student" items="${students}">
    <tr>
      <td>${student.ID}</td>
      <td>${student.name}</td>
      <td>${student.major}</td>
      <td>${student.degree}</td>
      <c:if test="${student.status==1}">
            <td> <button  type="button" class="layui-btn layui-btn-disabled">已选课</button></td>
      </c:if>
      <c:if test="${student.status==0}">
            <td> <a href="${pageContext.request.contextPath }/AddServlet?studentName=${student.name}" class="layui-btn layui-btn-normal">选课</a></td>
      </c:if>
    </tr>
     </c:forEach>
  </tbody>
</table>
        </div>
      </div>
    </div>
  </div>
</div> 
</body>
<script type="text/javascript">
layui.use('layer', function() {
	var $ = layui.jquery,
		layer = layui.layer;
	//layer.msg('修改失败！', {title:'提示消息',icon: 1, time: 1500});
	
});
</script>
</html>