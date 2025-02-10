package jm.task.core.jdbc.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private Util () {

    }

    private static final Logger logger = LoggerFactory.getLogger(Util.class);

    private static final String URL = "jdbc:mysql://localhost:3306/mybdtest";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static Connection connect() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            logger.info("Соединение с БД успешно установлено!");
        } catch (SQLException e) {
            logger.info("Ошибка при подключении к БД: ");
        }
        return connection;
    }
}
