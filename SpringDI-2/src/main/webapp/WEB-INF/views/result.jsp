<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



<p>${fn:escapeXml(msg)}</p>
<p>商品：${fn:escapeXml(puroduct.getproductName())}</p>
<p>金額：${fn:escapeXml(puroduct.getproductPrice())}</p>

<a href="Index">戻る</a>
</body>
</html>