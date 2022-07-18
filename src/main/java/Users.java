import java.util.List;

public interface Users {
    List<User> all();
    User getUserById(long id);
    void insert(User user);
}
