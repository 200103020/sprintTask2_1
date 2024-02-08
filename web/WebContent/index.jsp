<%@ page import="Classes.Tasks" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@include file="/WebContent/stable/head.jsp"%>
<body>
    <%@include file="/WebContent/stable/navBar.jsp"%>
    <div class="container mt-3">
        <%@include file="/WebContent/stable/modal.jsp"%>
        <table class="table mt-3">
            <thead>
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Name</th>
                <th scope="col">Deadline</th>
                <th scope="col">Done</th>
                <th scope="col">Details</th>
            </tr>
            </thead>
            <tbody>
            <% ArrayList<Tasks> taskTable = (ArrayList<Tasks>) request.getAttribute("taskAttr");
                if (taskTable != null){
                    for (Tasks task : taskTable){
            %>
            <tr>
                <th><%=task.getId()%></th>
                <td><%=task.getName()%></td>
                <td><%=task.getDeadlineDate()%></td>
                <td><%=task.isStatus()%></td>
                <td><a class="btn btn-small bg-dark text-light" href="/viewDetail?idDetail=<%=task.getId()%>">Details</a></td>
            </tr>
            <% }
            }%>
            </tbody>
        </table>
    </div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</html>
