<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    // Get the job title and description from the form
    String jobTitle = request.getParameter("jobTitle");
    String jobDescription = request.getParameter("jobDescription");

    // Optional: Add code here to save the job information to a database

    // Set attributes to forward to the success page
    request.setAttribute("jobTitle", jobTitle);
    request.setAttribute("jobDescription", jobDescription);
%>

<jsp:forward page="success.jsp" />
