package by.tms.web.servlet;

import by.tms.entity.User;
import by.tms.service.RegistrationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/registration", loadOnStartup = 1, name = "RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pages/reg.jsp").forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        if (!(name.equals("") && email.equals("") && password.equals(""))) {
            req.getRequestDispatcher("/pages/login.jsp").forward(req, resp);
        } else {
            getServletContext().getRequestDispatcher("/pages/req.jsp").forward(req, resp);
        }
    }
}
