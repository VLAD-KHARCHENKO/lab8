import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
//import com.mysql.fabric.jdbc.FabricMySQLDriver;
public class Main {
    private static String USERNAME = "root";
    private static final String PASSWORD = "H@r4e#k0";
    private static final String URL ="jdbc:mysql://localhost:3306/lab8?serverTimezone=UTC&amp;useUnicode=true&amp;characterEncoding=UTF-8";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
         //String name = "root";
   // String password = "H@r4e#k0";
  // String url ="jdbc:mysql://localhost:3306/lab8";
Class.forName("com.mysql.jdbc.Driver");
try (Connection connection= DriverManager.getConnection(URL, PASSWORD, USERNAME)){
    System.out.println("Успіх");

}

    }
}
