package info.sjd.service;

public class SomeService {

	public static String getSomeMopdifiedText(String name, String pass) {
		String outString = "<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"UTF-8\">\r\n" + 
				"<title>Some title</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"\r\n" + 
				"	<br>\r\n" + 
				"	<br>\r\n" + 
				"Your name is " + name + " and password is " + pass +
				"	<br>\r\n" + 
				"	<h2>Input your name and password AGAIN</h2>\r\n" + 
				"	<form method=\"post\" action=\"test-servlet-2\">\r\n" + 
				"		<input type=\"text\" name=\"userName\"> \r\n" + 
				"		<input type=\"password\" name=\"userPassword\">\r\n" + 
				"		<input hidden name=\"action\" value=\"someAction\">\r\n" + 
				"		<br>\r\n" + 
				"		<br>\r\n" + 
				"		<br>\r\n" + 
				"		<input type=\"submit\" value=\"SUBMIT\">\r\n" + 
				"	</form>\r\n" + 
				"</body>\r\n" + 
				"</html>" ;
		
		return outString;
	}

	public static String getSomeMopdifiedTextVol2(String name, String pass) {
		String outString = "<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"UTF-8\">\r\n" + 
				"<title>Some title vol.2</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"\r\n" + 
				"	<br>\r\n" + 
				"	<br>\r\n" + 
				"Your name REALY is " + name + " and password REALY is " + pass +
				"	<br>\r\n" + 
				"</body>\r\n" + 
				"</html>" ;
		
		return outString;
	}
}
