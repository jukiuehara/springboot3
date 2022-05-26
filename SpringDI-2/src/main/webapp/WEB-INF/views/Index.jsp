<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<div>
	<form:form action="result2" modelAttribute="task">
		<label>名前：</label>
		<form:input path="text" />
	</form:form>
	<form:form action="result" modelAttribute="task">
		<label>商品：</label>
		<form:select path="id">
			<form:options items="${list}" itemLabel="name" itemValue="id" />
		</form:select>
	</form:form>
	<form:button>送信</form:button>
</div>

</head>
<body>

</body>
</html>