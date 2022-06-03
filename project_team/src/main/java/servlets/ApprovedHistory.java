package servlets;

import dao.EmployeeDao;
import model.Employee;
import utils.EmployeeDaoFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class ApprovedHistory extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        request.getRequestDispatcher("navbar.html").include(request,response);

        int id = Integer.parseInt(request.getParameter("id"));
        Employee employee = new Employee();
        employee.setId(id);
        Employee employee2 = new Employee();
        // get pending request

        EmployeeDao dao = EmployeeDaoFactory.getEmployeeDao();
        try {

            employee2 = dao.getApprovedHistory(employee);
        } catch (
                SQLException e) {
            e.printStackTrace();
        }


        if (employee2.getName() == null) {
            out.println("<h1>YOU DONT HAVE  ANY APPROVED REQUEST</1h>");
            out.println("<h3><a href="+"approved-employee.html"+"#"+">TRY AGAIN </a></h3>");
        } else {
            out.println("<h1>APPROVED</1h>");
            out.println("<br>");
            out.println("<tr>");
            out.println("<br>");
            out.println("<td>NAME: " + employee2.getName() + "  </td>");
            out.println("<br>");
            out.println("<td>RECEIPT TYPE: " + employee2.getReceipt_type() + "  </td>");
            out.println("<br>");
            out.println("<td>STATUS: " + employee2.getStatus() + "  </td>");
            out.println("<br>");
            out.println("<td>AMOUNT: " + employee2.getAmount() + "  </td>");
            out.println("</tr>");

        }
        request.getRequestDispatcher("footer.html").include(request,response);
    }
}
