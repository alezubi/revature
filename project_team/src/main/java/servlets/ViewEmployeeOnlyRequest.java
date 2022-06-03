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

public class ViewEmployeeOnlyRequest extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        request.getRequestDispatcher("navbar.html").include(request, response);//


        int id = Integer.parseInt(request.getParameter("id"));

        Employee employee2 = new Employee();
        employee2.setId(id);
        EmployeeDao dao = EmployeeDaoFactory.getEmployeeDao();
        try {
            employee2 = dao.getEmployee(employee2);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (employee2.getName() == null) {

            out.println("something went wrong");

            request.getRequestDispatcher("index.html").include(request, response);

        } else {

            out.println("<h1>The reimbursement requests of a specific employee:" + employee2.getName() + "</h1>");
            out.println("<h2>Email:" + employee2.getEmail() + "</h2>");
            out.println("<h2>Name:" + employee2.getName() + "</h2>");
            out.println("<h2>Status:" + employee2.getStatus() + "</h2>");
            out.println("<h2>Receipt_type:" + employee2.getReceipt_type() + "</h2>");
            out.println("<h2>Amount:" + employee2.getAmount() + "$" + "</h2>");

            out.println("<h3><a href=" + "update-info.html" + "#" + ">CHANGE SOME INFORMATION</a></h3>");
            out.println("<h3><a href=" + "approve-disapprove.html" + ">APPROVE IT</a></h3>");

        }

    }

}
