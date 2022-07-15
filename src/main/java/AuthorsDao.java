import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AuthorsDao implements Authors{
    private Connection connection;

    public AuthorsDao() {
        try{
            DriverManager.registerDriver(new Driver());
            Config config = new Config();
            connection = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword());
        }catch(SQLException sqle){
            throw new RuntimeException("Error connecting to db", sqle);
        }
    }

    @Override
    public List<Author> all() {
        List<Author> authors = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT  * FROM authors");
            while(rs.next()){
                Author author = new Author(rs.getLong("id"), rs.getString("authors"));
            }
        }catch(SQLException sqle){
            throw new RuntimeException("Error connecting to db", sqle);
        }

        return authors;
    }

    @Override
    public void insert(Author author) {

    }
}
