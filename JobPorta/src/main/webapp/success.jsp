<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Job Posted Successfully</title>
</head>
<body>
    <h1>Job Posted Successfully!</h1>
    <p><strong>Job Title:</strong> <%= request.getAttribute("jobTitle") %></p>
    <p><strong>Job Description:</strong> <%= request.getAttribute("jobDescription") %></p>
    <a href="index.jsp">Back to Home</a>
</body>
</html>
