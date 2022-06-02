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

public class SubmitRequest extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();


        String email = request.getParameter("email");

        String receipt_type = request.getParameter("receipt_type");

        int amount = Integer.parseInt(request.getParameter("amount"));

        Employee employee = new Employee();

        employee.setEmail(email);
        employee.setReceipt_type(receipt_type);
        employee.setAmount(amount);

        EmployeeDao dao = EmployeeDaoFactory.getEmployeeDao();

        boolean result = false;
        try {
            result = dao.SubmitRequest(employee);// porque retorna un objecto tipo boolean
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (result) {
            System.out.println("Request Submitted");
            request.getRequestDispatcher("index.html").include(request,response);
            out.println("Employee Updated");
        } else {
            System.out.println("something went wrong");
        }
    }
}
