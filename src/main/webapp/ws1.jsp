<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
ws1
<div id="msg"></div>
<input type="text" id="txt"/>
<button id="send">send</button>

	<script type="text/javascript">
		if (!window.WebSocket) {
			alert();
		}
		var ws = new WebSocket("ws://localhost:8080/BitMore/ws");
		
		ws.onmessage = function(e){
			document.getElementById("msg").innerHTML = e.data;
		}
		
		document.getElementById("send").onclick = function(){
			ws.send(document.getElementById("txt").value);
		}
		
	</script>

</body>
</html>