<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="novoFuncionario">Cadastrar Funcionario</a>
	<br />
	<table>
		<tr>
			<th>Id</th>
			<th>Nome</th>
			<th>Especialidade</th>
			<th>Comissão</th>
			<th>Salário</th>
		</tr>
		<c:forEach items="${funcionarios}" var="funcionario">
			<tr>
				<td>${funcionario.numFuncionario}</td>
				<td>${funcionario.nome}</td>
				<td>${funcionario.especialidade}</td>
				<td>${funcionario.comissao}</td>
				<td>${funcionario.salario}</td>
				<td><a href="removeFuncionario?id=${tarefa.id}">Remover</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>