<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Test</title>
</head>
<body>
	<h1>Test</h1>
	<s:property value="text"/>
	
<table style="text-align: center;">
	  <tr>
	  	<th>TITLE</th>
	  	<th>CONTENT</th>
	  	<th>CNT</th>
	  </tr>
	<s:iterator value="list">
	  <tr>
		<td><s:property value="TITLE"/></td>
		<td><s:property value="CONTENT"/></td>
		<td><s:property value="CNT"/></td>
	  </tr>
	</s:iterator>	
</table>

</body>
</html>