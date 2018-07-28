<%@page import="thefood.lib.Mailer"%>
<%

String msg = Mailer.send("thefoodindore@gmail.com","Abc@12345", "jain.ritesh@rediffmail.com", "Test Mail", "Welcome to The Food");
out.println(msg);

%>