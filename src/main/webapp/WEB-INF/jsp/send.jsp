<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Notification Sender</title>
</head>
<body>

<h2>Notification Information</h2>
<form:form method="POST" action="EmailQueue">
    <table>
        <tr>
            <td><form:label path="msisdn">MSISDN</form:label></td>
            <td><form:input path="msisdn" /></td>
        </tr>
        <tr>
            <td><form:label path="message">Message</form:label></td>
            <td><form:input path="message" /></td>
        </tr>
        <tr>
            <td><form:label path="emailAddress">Email</form:label></td>
            <td><form:input path="emailAddress" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Submit"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>