<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

      <center>
         <h2>Java Bean In Servlet 3.0</h2>
         <c:choose>
            <c:when test="${empty person}">
               <h3>Currently, there are no person.</h3>
            </c:when>
            <c:otherwise>
               <table id="beanTable">
               <tr>
                     <td> "SuccessFully Inserted"</td>
                  </tr>
                  <tr>
                     <td> Id:</td><td>${person.id}</td>
                  </tr>
                  <tr>
                     <td>Name:</td><td>${person.fullname}</td>
                  </tr>
                  <tr>
                     <td> Address:</td><td>${person.address}</td>
                  </tr>
                  <tr>
                     <td>Country:</td><td>${person.country}</td>
                  </tr>
                  <tr>
                     <td>Age:</td><td>${person.age}</td>
                  </tr>
                  <tr>
                     <td>Salary:</td><td>${person.income}</td>
                  </tr>
                  <tr>
                     <td>Work:</td><td>${person.work}</td>
                  </tr>
                  <tr>
                     <td>Other NOTE:</td><td>${person.note}</td>
                  </tr>
                  <tr>
                     <td>Status:</td><td>${person.status}</td>
                  </tr>
               </table>
            </c:otherwise>
         </c:choose>
      </center>

</body>
</html>