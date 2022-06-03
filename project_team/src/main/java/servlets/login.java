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

public class login extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();


        request.getRequestDispatcher("navbar.html").include(request, response);//

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        System.out.println( email + password);


        Employee employee2 = new Employee();
        employee2.setEmail(email);
        employee2.setPassword(password);


        EmployeeDao dao = EmployeeDaoFactory.getEmployeeDao();

        try {

            employee2 = dao.login(employee2);
            //uno   employee2 = dao.login(employee);// porque retorna un objecto tipo boolean

            System.out.println(employee2.getName()+employee2.getEmail()+ employee2.getPassword() + employee2.getName());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        int a = Integer.parseInt(password);
        int b = Integer.parseInt(employee2.getPassword());

        System.out.println( a + "   "+ b);


      if (email.equals("admin@gmail.com") && password.equals("123")) {

            out.println("<h1>Welcome  "+ employee2.getName()+"</h1>");
            out.println("<h2>Email:  "+ employee2.getEmail()+"</h2>");
            out.println("<h2>Id:  "+ employee2.getId()+"</h2>");
            out.println("<h2>Name:  "+ employee2.getName()+"</h2>");
            out.println("<h2>Password:  "+ employee2.getPassword()+"</h2>");

            out.println("<h3><a href="+"update-info.html"+"#"+">CHANGE USER INFORMATION </a></h3>");
            out.println("<h3><a href="+"manager_i.html"+">GO TO MANAGER HOME PAGE </a></h3>");

        }  else if (employee2.getName()==null) {

          out.println("<br>");
          out.println("something went wrong");
          out.println("<br>");
          out.println("<h3><a href="+"login_user.html"+">Try again </a></h3>");

        } else {



            out.println("<h1>Welcome  "+ employee2.getName()+"</h1>");
            out.println("<h2>Email:  "+ employee2.getEmail()+"</h2>");
            out.println("<h2>Id:  "+ employee2.getId()+"</h2>");
            out.println("<h2>Name:  "+ employee2.getName()+"</h2>");
            out.println("<h2>Password:  "+ employee2.getPassword()+"</h2>");


            out.println("<h3><a href="+"update-info.html"+"#"+">CHANGE USER INFORMATION </a></h3>");
            out.println("<h3><a href="+"addrequest.html"+">ADD A REQUEST </a></h3>");
          out.println("<h3><a href="+"employee_i.html"+">GO TO HOME PAGE </a></h3>");


        }



    }
}