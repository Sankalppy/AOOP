<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Submit Job</title>
</head>
<body>
    <h1>Post a Job</h1>
    <form action="processJobPosting.jsp" method="post">
        <label for="jobTitle">Job Title:</label><br>
        <input type="text" id="jobTitle" name="jobTitle" required><br><br>

        <label for="jobDescription">Job Description:</label><br>
        <textarea id="jobDescription" name="jobDescription" required></textarea><br><br>

        <input type="submit" value="Post Job">
    </form>
</body>
</html>
