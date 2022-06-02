import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet2 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();// we use the printer object to display code
        request.getRequestDispatcher("navbar.html").include(request, response);

        // getting the value from the query string
        String name = request.getParameter("a");//accesing a which is in


        out.println("Welcome to Servlet 2: "+ name);

        out.println("<h1> Nothing interinsting happended we just use again GetParameter to obtein theinformation of  a link from the last page </h1>"

        );
        out.close();
    }


}
