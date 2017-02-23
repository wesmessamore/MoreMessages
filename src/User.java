import java.util.ArrayList;

/**
 * Created by Wesley on 2/21/17.
 */
public class User {
    String name;
    String passWord;
    static ArrayList<String> messages = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }
}
