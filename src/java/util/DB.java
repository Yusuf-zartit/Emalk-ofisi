package util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author yusef
 */
public abstract class DB {

    private Connection connect;

    public Connection getConnect() {
        try {
            Class.forName("org.postgresql.Driver");
            this.connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/EmlakOfisi", "postgres", "123456");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return this.connect;

    }
}
