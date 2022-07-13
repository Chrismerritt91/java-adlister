import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/cookies")
public class CookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.sendRedirect("/cookies.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String favorite = request.getParameter("favorite");

        boolean answeredQuestion = (name != null && !name.equals("")) && (favorite != null && !favorite.equals(""));

        if(answeredQuestion){
            HttpSession session = request.getSession();

            session.setAttribute("name", name);
            session.setAttribute("favorite", favorite);

            response.sendRedirect("/deals");
        } else{
            response.sendRedirect("/cookies");
        }



//        response.sendRedirect("/deals.jsp");
        // because it is now secure redirect wont work, only back end can access this page,
        // so use a request dispatcher(this is one way but the url will remain /cookies not /deals.jsp
//        request.getRequestDispatcher("/WEB-INF/deals.jsp").forward(request,response);

    }
}
