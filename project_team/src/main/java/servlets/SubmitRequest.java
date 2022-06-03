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
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();


        int id = Integer.parseInt(request.getParameter("id"));
       int amount = Integer.parseInt(request.getParameter("amount"));
        String receipt_type= request.getParameter("receipt_type");



        Employee employee = new Employee();
        employee.setId(id);
        employee.setAmount(amount);
        employee.setReceipt_type(receipt_type);


        System.out.println(employee.getReceipt_type());

        EmployeeDao dao = EmployeeDaoFactory.getEmployeeDao();
        boolean result = false;
        try {
            result = dao.addRequest(employee);// porque retorna un objecto tipo boolean
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (result) {
            System.out.println("employee saved");
            out.println("Request Submitted");
            request.getRequestDispatcher("employee_i.html").include(request,response);
        } else {
            System.out.println("something went wrong");
        }
    }

}
