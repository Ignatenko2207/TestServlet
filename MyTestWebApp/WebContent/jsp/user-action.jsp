<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><%=session.getValue("title") %></title>
</head>
<body>
	<style>
	   <%@include file='/css/createstyle.css' %>
	</style>
	<div id="header">
		<div class="content">
			<h2><a href="#" target="_blank" id="logo">Welcome to TEST WEB APP</a></h2>
		</div>
	</div>
	<br>
	<br>
	<div class="content">
		<div class="table">
			<ul class="nav-tabs">
				<li><a class="active"  href=""><%=session.getValue("title") %></a></li>
			</ul>
			<br>
			<div class="tab-content" class="table-tab">
				<div class="table-content">
					<table>
						<div class="content" id="main-box">
							<div id="authorisation">
								<div id="form">
								<form action="user-servlet">
								<div id="input-name">					
									<label for="userLogin" id="label-name">Name:</label><input id="input-name" size="24" type="text" name="userLogin" required value="<%=session.getValue("userLogin") %>" placeholder="Input login">
								</div>
								<div id="input-pass">	
									<label for="password" id="label-pass">Password:</label><input  id="input-pass" size="24" type="password" name="userPassword" required value="<%=session.getValue("userPassword") %>" placeholder="Input password">
								</div>
								<input type="hidden" name="action" value="edit">
								<input type="hidden" name="actionBtn" value="<%=session.getValue("btn") %>">
								<input type="hidden" name="oldLogin" value="<%=session.getValue("userLogin") %>">
								<input type="hidden" name="oldPass" value="<%=session.getValue("userPassword") %>">								
								<div id="button" >
									<input type="submit" class="btn-class" value="<%=session.getValue("btn") %>">
								</div>
								</form>
							</div>
						</div>
					</table>
				</div>
			</div>
			
		</div>
	</div>
</body>
</html>