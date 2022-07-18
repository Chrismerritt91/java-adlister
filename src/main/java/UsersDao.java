import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsersDao implements Users{
    private Connection connection;

    public UsersDao(Config config){
        try{
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(config.getUrl(),
                    config.getUser(),
                    config.getPassword());
        }catch(SQLException sqle){
            throw new RuntimeException("Error connecting to db", sqle);
        }
    }



    @Override
    public List<User> all() {
        List<User> users = new ArrayList<>();
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT  * FROM user");
            while(rs.next()){
                User user = new User(rs.getLong("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("password"),
                        rs.getString("email"));
                users.add(user);
            }

        }catch(SQLException sqle){
            throw new RuntimeException("Error connecting to db", sqle);
        }

        return users;
    }

    @Override
    public User getUserById(long id){
        User user = null;
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM authors WHERE id = '" + id + "'");
            rs.next();
            user = new User(rs.getLong("id"), rs.getString("user_id"));
        }catch(SQLException sqle){
            throw new RuntimeException("Error connecting to db", sqle);
        }
        return user;
    }

    @Override
    public Long insert(User user) {
        return null;
    }
}
