import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//import com.mysql.fabric.jdbc.FabricMySQLDriver;
public class Main {

    public static void main(String[] args) throws SQLException {
        Controller controller = new Controller();
        controller.run();
        controller.sort();
        controller.average();

    }
}
