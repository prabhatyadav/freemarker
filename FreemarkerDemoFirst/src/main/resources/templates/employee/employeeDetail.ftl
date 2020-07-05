<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Detail page</title>
</head>
<body>
<h1>Hi, <#if registeredEmp??> <u><i>${registeredEmp.firstName}</i></u> <#else> <u>${user}</u> </#if> Welcome to Employee detail page of Freemarker Demo Application.</h1>
<br>
 <#if registeredEmp??> ${registeredEmp.email}</#if>

</body>
</html>