package servlets;

import dao.EmployeeDao;
import model.Employee;
import utils.EmployeeDaoFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PendingRequest extends HttpServlet{


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();


        request.getRequestDispatcher("managernavbar.html").include(request, response);

        String name = request.getParameter("name");
        int id = Integer.parseInt(request.getParameter("id"));

        // get employees
        List<Employee> employeeList = new ArrayList<>();
        EmployeeDao dao = EmployeeDaoFactory.getEmployeeDao();
        try {
            employeeList = dao.getPending();
        } catch (SQLException e) {
            e.printStackTrace();
        }      out.println("<h1>PENDING</h1>");
        for (Employee employee: employeeList){
            out.println("<br>");
            out.println("<tr>");
            out.println("<td>ID: "+ employee.getId()+ "  </td>");
            out.println("<td>EMAIL: "+ employee.getEmail()+ "  </td>");
            out.println("<td>NAME: "+ employee.getName()+ "  </td>");
            out.println("<td>RECEIPT TYPE: "+ employee.getReceipt_type()+ "  </td>");
            out.println("<td>STATUS: "+ employee.getStatus()+ "  </td>");
            out.println("<td>AMOUNT: "+ employee.getAmount()+ "  </td>");
            out.println("</tr>");

        }
// update status
        Employee employee2= new Employee();
        employee2.setId(id);
        employee2.setName(name);

        EmployeeDao dao2 = EmployeeDaoFactory.getEmployeeDao();
        try {
            dao.updateStatus(employee2);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        out.println("<br>");
        out.println("---------------------------------------------------------------------------------------------------------------------");
        out.println("---------------------------------------------------------------------------------------------------------------------");
        out.println("<br>");

        // get employees approved
        List<Employee> employeeList2 = new ArrayList<>();
        EmployeeDao dao3 = EmployeeDaoFactory.getEmployeeDao();
        try {
            employeeList2 = dao3.getApproved();
        } catch (SQLException e) {
            e.printStackTrace();
        }      out.println("<h1>APPROVED</h1>");
        for (Employee employee: employeeList2){
            out.println("<br>");
            out.println("<tr>");
            out.println("<td>ID: "+ employee.getId()+ "  </td>");
            out.println("<td>EMAIL: "+ employee.getEmail()+ "  </td>");
            out.println("<td>NAME: "+ employee.getName()+ "  </td>");
            out.println("<td>RECEIPT TYPE: "+ employee.getReceipt_type()+ "  </td>");
            out.println("<td>STATUS: "+ employee.getStatus()+ "  </td>");
            out.println("<td>AMOUNT: "+ employee.getAmount()+ "  </td>");
            out.println("</tr>");


        }

        out.println("<h3><a href="+"resolved-employees.html"+"#"+">View Approved Employees</a></h3>");
        out.println("<h3><a href="+"pending-employees.html"+"#"+">View Approved Employees</a></h3>");
        out.println("<h3><a href="+"employee-list.html"+">View All Employees </a></h3>");
        out.println("<h3><a href="+"manager_i.html"+">GO TO MANAGER HOME PAGE </a></h3>");


    }


}