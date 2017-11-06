package facebook.network.data;

import facebook.network.model.User;

import java.util.Arrays;
import java.util.List;

public class Database {

    public static List<User> getUsers () {

        User user1 = new User(28, "Julia", "Demska", "Kherson");
        User user2 = new User(25, "Katy", "Demska", "Kherson");
        User user3 = new User(33, "Alex", "Voskoboinikov", "Donetsk");

        User [] users = {user1, user2, user3};
        return Arrays.asList(users);
    }
}
