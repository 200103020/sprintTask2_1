package Servlet;

import Classes.DBManager;
import Classes.Tasks;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/home")
public class HomePage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Tasks> task = DBManager.getAllTasks();
        req.setAttribute("taskAttr",task);
        req.getRequestDispatcher("/WebContent/index.jsp").forward(req, resp);
    }

}
