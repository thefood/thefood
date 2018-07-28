
<%@page import="thefood.dao.ItemDAO"%>
<%@page import="thefood.dto.ItemDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.io.*"%>

<%
    String btn = request.getParameter("btn");

    if (btn != null && btn.equals("Export")) {
        String filename = "abc.csv";
        ArrayList<ItemDTO> list = ItemDAO.getAllItem();

        response.setHeader("content-type", "text/csv");
        response.setHeader("content-disposition", "attachment;filename=\"" + filename + "\"");
        writeCsv(list, ',', response.getOutputStream());

    }
%>

<%!
    public static <T> void writeCsv(ArrayList<ItemDTO> list, char separator, OutputStream output) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output, "UTF-8"));
        for (ItemDTO item : list) {
            String str = "\""+item.getItemnm() +"\" \"" + item.getCat().getCatnm() + "\" \"" + item.getItemprice()+"\"";
            writer.append(str);
            writer.newLine();
        }
        writer.flush();
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="exportdata.jsp">
            Export Data <input type="submit" value="Export" name="btn"/>
        </form>
    </body>
</html>
