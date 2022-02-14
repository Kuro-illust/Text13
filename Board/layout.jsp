<%@ page contentType="text/html; charset=UTF-8"
	import="java.net.URLDecoder"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%



%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ようこそ掲示板へ。</title>
</head>
<body>
  <header>
    <h1>掲示板</h1>    
  </header>
    <%
    Object list = request.getAttribute("list");
    %>
  	  

   <c:forEach var="message" items="${list}" varStatus="status">
        <tr>
        <form method="POST" action="BoardServlet">
              
          <td>投稿者：<c:out value="${message.author}" /></br></td>
          <td>タイトル：<c:out value="${message.title}" /></br></td>
          <td>内容：<c:out value="${message.body}" /></br></td>
          <td>投稿時間：<c:out value="${message.createdDate}" /></br></td>

        </tr>
      </c:forEach>
  
   		</form>
   
  	<form method="POST" action="BoardServlet">
		<df>
		<dt>投稿者名</dt>
		<dd>
			<input name="author" type="text" size="10" />
		</dd>
		<dt>タイトル</dt>
		<dd>
			<input name="title" type="text" size="50" />
		</dd>
		<dt>内容</dt>
		<dd>
			<textarea name="body"></textarea>
		</dd>
		</df>
		<input type="submit" value="投稿">
		
	</form>
  <footer>
    <small class="copyright">© 2022 Board</small>
  </footer>
</body>
</html>
