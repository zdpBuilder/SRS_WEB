<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="jsp/common/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>学生选课系统</title>

</head>
<body style="display:flex;align-items:center;justify-content:center;" >
	 <div>
      	<a  href="${pageContext.request.contextPath }/SrsServlet" class="layui-btn layui-btn-normal layui-btn-lg layui-btn-radius">
       		<i class="layui-icon layui-icon-release"></i>&nbsp;&nbsp;进行初始化
       	</a>
       	<a  href="${pageContext.request.contextPath }/ListServlet" class="layui-btn  layui-btn-danger layui-btn-lg layui-btn-radius">
       		<i class="layui-icon layui-icon-read"></i>&nbsp;&nbsp;查看当前状态
       	</a>
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