package Servlet;

import Classes.DBManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/deleteTask")
public class DeleteTaskServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idStorage = req.getParameter("idDelete");
        if(idStorage!=null && !idStorage.isEmpty()){
            DBManager.deleteTask(Long.valueOf(idStorage));
            resp.sendRedirect("/home");
        }
    }
}
