<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

 
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Scripture List</title>
</head>
<body>

       <div>
              The Posts will be listed below. Return to add more:<br /><br />

              <c:forEach var="scripture" items="${scriptures}">
                      ${scripture}<br />
              </c:forEach>

              <!--
              http://stackoverflow.com/questions/17522850/i-am-trying-to-iterate-for-each-loop-in-reverse-order-but-not-able-to-succeed
              -->
                
       </div>

</body>
</html>