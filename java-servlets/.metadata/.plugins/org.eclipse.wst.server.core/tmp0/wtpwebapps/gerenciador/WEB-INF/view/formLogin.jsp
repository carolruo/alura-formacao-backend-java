<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="entrada" var="link"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Painel Login</title>
</head>
<body>
	<form action="${link}" method="post">
		Login: <input type="text" name="login"/>
		Senha: <input type="password" name="senha"/>
		<input type="hidden" name="acao" value="Login"/>
		<input type="submit"/>
	</form>
</body>
</html>