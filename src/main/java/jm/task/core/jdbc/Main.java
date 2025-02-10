package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {


        UserService userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Иван", "Иванов", (byte) 30);
        userService.saveUser("Петр", "Петров", (byte) 25);
        userService.saveUser("Олег", "Олегов", (byte) 35);
        userService.saveUser("Ильяс", "Ильясов", (byte) 40);

        List<User> allUsers = userService.getAllUsers();
        for (User user : allUsers) {
            logger.info("user: {}", user);
        }
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}


