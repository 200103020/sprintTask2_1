package Servlet;

import Classes.DBManager;
import Classes.Tasks;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/viewDetail")
public class taskDetailServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.valueOf(req.getParameter("idDetail"));

        Tasks taskDetails = DBManager.getTask(id);
        req.setAttribute("taskDetailAttr",taskDetails);

        req.getRequestDispatcher("/WebContent/taskDetail.jsp").forward(req,resp);
    }

}
