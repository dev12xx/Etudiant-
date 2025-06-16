import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/etude_serve")
public class EtudeServe extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        
        String n = request.getParameter("nom");
        int n1 = Integer.parseInt(request.getParameter("n1"));
        int n2 = Integer.parseInt(request.getParameter("n2"));
        double moy = (n1 + n2) / 2.0;
        
        request.setAttribute("nom", n);
        request.setAttribute("n1", n1);
        request.setAttribute("n2", n2);
        request.setAttribute("moy", moy);
        
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}