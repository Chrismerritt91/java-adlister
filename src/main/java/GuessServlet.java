import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Random;

@WebServlet("/guess")
public class GuessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/Guess.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       int guess = Integer.parseInt(request.getParameter("guess"));
        boolean result;
        int randomNum = (int)(Math.random() * 3) + 1;
        if(guess == randomNum){
            response.sendRedirect("/correct");
        } else{
            response.sendRedirect("/incorrect");
        }
    }
}
