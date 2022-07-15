
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AlbumsServlet", value = "/albums")
public class AlbumsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Albums albumsDao = new AlbumsDao();// database connection
        List<Album> albums = albumsDao.all();// retrieving list
        request.setAttribute("albums", albums);
        request.getRequestDispatcher("/WEB-INF/Albums.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
