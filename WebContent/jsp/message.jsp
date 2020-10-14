<%@ page language="java" contentType="text/html; charset=UTF-8"
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
 	 <c:if test="${status == 1}">
 	    
      <div class="layui-card">
        <div class="layui-card-header">选课结果</div>
        <div class="layui-card-body" style="display:flex;align-items:center;justify-content:center;">
<a href="${pageContext.request.contextPath }/SrsServlet" class="layui-btn layui-btn-normal"><i class="layui-icon layui-icon-vercode"></i>  选课成功，点击回到首页</a></div>
      </div> 
 	 </c:if>
 	 <c:if test="${status != 1}">
 	   <div class="layui-card">
        <div class="layui-card-header">选课结果</div>
        <div class="layui-card-body" style="display:flex;align-items:center;justify-content:center;">
                    <a href="${pageContext.request.contextPath }/SrsServlet" class="layui-btn layui-btn-normal"><i class="layui-icon layui-icon-close-fill"></i>  选课失败，点击回到首页</a>
         </div>
       </div>
 	 </c:if>
</body>
<script type="text/javascript">
layui.use('layer', function() {
	var $ = layui.jquery,
		layer = layui.layer;
	//layer.msg('修改失败！', {title:'提示消息',icon: 1, time: 1500});
	
});
</script>
</html>
