
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%="hello"%>
<%
    WebApplicationContextUtils.getWebApplicationContext(application).getBean("stu");
    System.out.println("=========");
    System.out.println(request.getAttribute("stu"));
%>

