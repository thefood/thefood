<%@page import="java.net.*"%>
<%
    //String res = SendSMS.send("9893303390", "Test");

    //String url = "http://api.mVaayoo.com/mvaayooapi/MessageCompose?user=thefoodindore@gmail.com:9893303390&senderID=TEST SMS&receipientno=9893303390&dcs=0&msgtxt=Test&state=4";
    String url = "http://api.msg91.com/api/sendhttp.php?sender=MSGIND&route=4&mobiles=8765352916&authkey=227251ARFBaOnNgGRl5b52bd35&country=91&message=Hello! This is a test message";
    URL urlObj = new URL(url);
    HttpURLConnection con = (HttpURLConnection) urlObj.openConnection();
    String res = con.getResponseMessage();
    con.disconnect();

    out.println(res);
%>