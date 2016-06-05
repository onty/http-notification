<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Notification Sender</title>
</head>
<body>

<h2>Submitted Notifiation Information</h2>
<table>
    <tr>
        <td>MSISDN</td>
        <td>${msisdn}</td>
    </tr>
    <tr>
        <td>Email</td>
        <td>${email}</td>
    </tr>
    <tr>
        <td>Message</td>
        <td>${message}</td>
    </tr>
</table>
</body>
</html>