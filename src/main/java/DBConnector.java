import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBConnector {


    static final String DATABASE_URL = "jdbc:mysql://localhost:3306/lab8?serverTimezone=UTC&amp;useUnicode=true&amp;characterEncoding=UTF-8";
    static final String USER = "root";
    static final String PASSWORD = "H@r4e#k0";
    String sql = "SELECT * FROM car";
    List<Model> modelList = new ArrayList<>();

    public List<Model> getData() throws SQLException {
        Connection connection = null;
        Statement statement = null;

//        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String brand = resultSet.getString("brand");
            String types = resultSet.getString("types");
            String color = resultSet.getString("color");
         float capacity = resultSet.getFloat("capacity");
            int price = resultSet.getInt("price");
            Model model = new Model(id, brand, types, color, capacity, price);
            modelList.add(model);
        }
        resultSet.close();
        statement.close();
        connection.close();
        return modelList;
    }

}

