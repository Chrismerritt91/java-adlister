import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/deals")
public class DealsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = (String) request.getSession().getAttribute("name");
        String favorite = (String) request.getSession().getAttribute("favorite");

        if(name != null && favorite != null){
            request.getRequestDispatcher("WEB-INF/deals.jsp").forward(request, response);
        } else{
            response.sendRedirect("/cookies");
        }



    }


}
