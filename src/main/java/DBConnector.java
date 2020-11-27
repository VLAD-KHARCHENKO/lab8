import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DBConnector {


   static final String DATABASE_URL = "jdbc:mysql://localhost:3306/labmel?serverTimezone=UTC&amp";
    // static final String DATABASE_URL = "jdbc:sqlserver://dbHost\\sqlexpress;user=sa;password=secret";
    static String USER;
    static String PASSWORD;
    String sql = "SELECT * FROM smartphones";
    List<Model> modelList = new ArrayList<>();

    public List<Model> getData(Map stringMap) {
        stringMap.forEach((k,v)->{
            USER=k.toString();
            PASSWORD=v.toString();

        });
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);


            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String brand = resultSet.getString("Name_Generator");
                String types = resultSet.getString("Name_Model");
                float diagonal = resultSet.getFloat("Diagonal");
                int price = resultSet.getInt("Price");
               Model model = new Model(id, brand, types, diagonal, price);
                modelList.add(model);
            }


            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException throwables) {


            System.err.println("\n\nSomething goes wrong\n\n");
        }



        return modelList;
    }

}