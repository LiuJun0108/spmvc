<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ok.jsp</title>
</head>
<body>
	${user.username}
	<hr />
	${requestScope.user.username }
	<hr />
	${sessionScope.user.username }

		
	<c:forEach var="city" items="${bList }" varStatus="st">
		${st.index } -- ${city }
	</c:forEach>
</body>
</html>