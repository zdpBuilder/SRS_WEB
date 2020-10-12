<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String commonPath =request.getScheme()+"://"+request.getServerPort()+request.getContextPath()+"/";
%>
<!-- 引入CSS -->
<link rel="stylesheet" href="<%=commonPath%>assets/layui/css/layui.css" media="all" />
<!-- 引入JS -->
<script type="text/javascript" src="<%=commonPath%>assets/layui/layui.js"></script>
