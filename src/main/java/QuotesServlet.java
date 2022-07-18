import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "QuotesServlet", value = "/quotes")
public class QuotesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Quotes quotesDao = DaoFactory.getQuotesDao();
        List<Quote> quotes = quotesDao.all();
        request.setAttribute("quotes", quotes);
        request.getRequestDispatcher("/WEB-INF/Quotes.jsp").forward(request, response);

    }
}
