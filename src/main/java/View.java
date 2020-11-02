import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class View {

    public void printMet(List<Model> modelList) throws SQLException {

        System.out.printf("|%-5s|%-10s|%-10s|%-10s|%-10s|%-7s|\n", "id:", "Brand:", "Types:", "Color:", "Capacity:", "Price:");
        for (Model model : modelList) {
            System.out.printf("|%-5d|%-10s|%-10s|%-10s|%-10.1f|%-7d|\n",
                    model.getId(), model.getBrand(), model.getTypes(),
                    model.getColor(), model.getCapacity(), model.getPrice());
        }

    }
    public String getParameters(){
        Scanner sc = new Scanner(System.in);
      String param=sc.nextLine();
       return param;

    }


    public void viewMessage(String string) {
        System.out.println(string);
    }
}
