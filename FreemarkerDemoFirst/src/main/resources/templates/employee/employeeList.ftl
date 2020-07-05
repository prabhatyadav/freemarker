<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>Employee Details</p>
	<br>
	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th>Designation</th>
				<th>Age</th>
		</thead>
		<tbody>
			<#list employes as emp>
			<tr>
				<td>${emp.name}</td>
				<td><#if emp.designation??>${emp.designation} <#else> Engineer </#if></td>
				<td>${emp.age}</td>
			</tr>
			</#list>
		</tbody>
	</table>
</body>
</html>