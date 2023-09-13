import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
   /* protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("username");
        String pwd = req.getParameter("pass");
        if (user.equals("Admin") && pwd.equals("Password")) {
            RequestDispatcher rd = req.getRequestDispatcher("LoginSuccessfully.html");
            rd.forward(req, resp);
        } else {
            resp.setContentType("text/html");
            PrintWriter out = resp.getWriter();
            out.println("<font color=red>Either user name or password is wrong.</font>");
            out.close();
        }
    }*/

  /*  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("username");
        String pwd = req.getParameter("pass");
       // boolean b = user.matches("[A-Z][a-zA-Z]*{3,}");
        if (user.matches("[A-Z][a-zA-Z]*.{2,}") && pwd.equals("Password")) {
            RequestDispatcher rd = req.getRequestDispatcher("LoginSuccessfully.html");
            rd.forward(req, resp);
        } else {
            resp.setContentType("text/html");
            PrintWriter out = resp.getWriter();
            out.println("<font color=red>Either user name or password is wrong.</font>");
            out.close();
        }
    }*/
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("username");
        String pwd = req.getParameter("pass");
        // boolean b = user.matches("[A-Z][a-zA-Z]*{3,}");
        if (user.matches("Admin") && pwd.equals("^[a-z](?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$")) {
            RequestDispatcher rd = req.getRequestDispatcher("LoginSuccessfully.html");
            rd.forward(req, resp);
        } else {
            resp.setContentType("text/html");
            PrintWriter out = resp.getWriter();
            out.println("<font color=red>Either user name or password is wrong.</font>");
            out.close();
        }
    }
}

