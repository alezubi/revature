import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


    public class Servlet1 extends HttpServlet {

        public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter(); // object printer from getwriter method from response

            request.getRequestDispatcher("navbar.html").include(request, response);
            String name = request.getParameter("name");

            out.println("Welcome to servlet 1: " + name);


            // append the username in the query string
            out.println("<h1><a href='Servlet2?a=" + name + "'>Click Here</a></h1>");

            out.println("<h1 border: 2px solid red;>YOUR ARE IN HTML GENERATE FOR THE SERVLET 1 , \n" +
                    "        YOU ARE USING A  \"PRINTERWRITER\" OBJECT TO GET ACCESS TO THE METHOD \"println\" \n" +
                    "        TO PRINT THIS INFORMATION IN THE SCREEN \n" +
                    "     </h1>");
            App uno = new App();
           uno.listEm();


        }


}
