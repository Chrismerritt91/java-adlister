import com.mysql.cj.jdbc.Driver;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

public class JDBCTest {

    private static List<String> getAlbumNames(){
        List<String> albumNames = new ArrayList<>();
        try{
            //establish connection
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection( "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "codeup");
            //create statement object
            Statement statement = connection.createStatement();

            //execute statement
            ResultSet rs = statement.executeQuery("Select name FROM albums");
            while(rs.next()){
                albumNames.add(rs.getString("name"));
            }

        }catch(SQLException sqle){
            sqle.printStackTrace();
        }
        return albumNames;
    }

    public static void main(String[] args) {
        List<String> albumNames = getAlbumNames();
        for(String albumName: albumNames){
            System.out.println(albumName);
        }
    }
}
