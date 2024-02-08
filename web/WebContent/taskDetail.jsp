<%@ page import="java.util.ArrayList" %>
<%@ page import="Classes.Tasks" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@include file="/WebContent/stable/head.jsp"%>
<body>
    <%@include file="/WebContent/stable/navBar.jsp"%>
    <div class="container mt-3">
            <div class="col">
                <%
                    Tasks taskDetailJSP = (Tasks) request.getAttribute("taskDetailAttr");
                    if(taskDetailJSP != null){
                        %>
                <div class="mb-3">
                    <label class="form-label">Name</label>
                    <input type="text" class="form-control" name="name" placeholder="Name" readonly value="<%=taskDetailJSP.getName()%>">
                </div>
                <div class="mb-3">
                    <label class="form-label">Description</label>
                    <textarea class="form-control" name="description" readonly rows="3"><%=taskDetailJSP.getDescription()%></textarea>
                </div>
                <div class="mb-3">
                    <label class="form-label">Date</label>
                    <input type="date" class="form-control" name="date" placeholder="mm/dd/yyyy" readonly value="<%=taskDetailJSP.getDeadlineDate()%>">
                </div>
                <%
                    }
                %>
            </div>
        <form action="/deleteTask" method="get">
            <div class="col">
                <a href="/deleteTask?idDelete=<%=taskDetailJSP.getId()%>" class="btn btn-secondary bg-danger">Delete</a>
                <button type="button" class="btn btn-primary bg-success">Save</button>
            </div>
        </form>
    </div>
</body>
</html>
