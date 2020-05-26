<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
//allow access only if session exists
String user = (String) session.getAttribute("user");
String userName = null;
String sessionID = null;
Cookie[] cookies = request.getCookies();
if(cookies !=null){
for(Cookie cookie : cookies){
	if(cookie.getName().equals("user")) userName = cookie.getValue();
	if(cookie.getName().equals("JSESSIONID")) sessionID = cookie.getValue();
}
}
%>
<h3>Hi <%=userName %>, Login successful. Your Session ID=<%=sessionID %></h3>
<br>
User=<%=user %>
 <form action="SapServlet" method="post"> 
       
       
       <p>ID:</p>  
        <input type="text" name="id"/> 
        <br/> 
        <p>Name:</p>  
        <input type="text" name="name"/> 
        <br/> 
        <p>Address:</p>  
        <input type="text" name="address"/> 
        <br/>
        <p>Age:</p>  
        <input type="text" name="age"/> 
        <br/> 
        <p>Income:</p>  
        <input type="text" name="income"/> 
        <br/> 
        <p>Occupation:</p>  
        <input type="text" name="occupation"/> 
        <br/> 
        <p>OtherNote:</p>  
        <input type="text" name="note"/> 
        <br/> 
        <p>Status:</p>  
        <input type="text" name="status"/> 
        <br/> 
        
        
        
        
        <br/><br/> 
        <input type="submit"/> 
    </form> 
    <form action="LogoutServlet" method="post">
<input type="submit" value="Logout" >
</form>
</body>
</html>