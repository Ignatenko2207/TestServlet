<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="info.sjd.service.UserService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<%@ page import="info.sjd.entity.User" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User infolist</title>
</head>
<body>
	<style>
	   <%@ include file='/css/liststyle.css' %>
	</style>
	<div id="header">
		<div class="content">
			<h2><a href="#" target="_blank" id="logo">Welcome to TEST WEB APP</a></h2>
		</div>
	</div>
	<div class="clear"></div>
	<br>
	<br>
	<div class="content">
		<div class="table">
			<ul class="nav-tabs">
				<li><a href="#">Items</a></li>
				<li><a href="#">Accounts</a></li>
				<li><a  class="active" href="user-list.jsp">Users</a></li>
			</ul>
			<br>
			<div class="tab-content" class="table-tab">
				<div class="table-header">
					<a href="/MyTestWebApp/user-controller?action=create" class="tab-btn">Add user</a>
				</div>
				<br>
				<div class="table-content">
					<table>
						<tr class="tr-header">
							<th class="col-login">Name</th>
							<th>Password</th>
							<th>Edit/Delete</th>
						</tr>
						<jsp:useBean id="userService" scope="request" class="info.sjd.service.UserService" />
						<% 
						List<User> userList = userService.getAll();
							for(User user: userList)	{
						%>
						<tr class="tr-content">
							<td><%=user.getLogin() %></td>
							<td><%=user.getPassword() %></td>
							<td class="row-btn">
								<div class="link-edit">
									<text>___________</text><a href="/MyTestWebApp/user-controller?userLogin=<%=user.getLogin() %>&userPassword=<%=user.getPassword() %>&action=edit" class="btn-link"><img src="\MyTestWebApp\images\edit.png" alt="edit"></a>
    							</div>
     							<div class="link-delete">
									<a href="/MyTestWebApp/user-controller?userLogin=<%=user.getLogin() %>&userPassword=<%=user.getPassword() %>&action=delete" class="btn-link"><img src="\MyTestWebApp\images\delete.png" alt="delete"></a><text>___________</text>
								</div>					
							</td>
						</tr>	
						<%}	%>													
					</table>
				</div>
			</div>
			
		</div>
	</div>
</body>
</html>