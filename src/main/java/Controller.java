import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Controller<modelList> {

    private List<Model> modelList;
    private List<Model> sortList;
    private View view = new View();
    private DBConnector connector = new DBConnector();

    public void run() throws SQLException {
        modelList = connector.getData();
        view.printMet(modelList);
    }
    public void sort() throws SQLException {
       sortList= modelList.stream().filter(n -> n.getColor().equals("red")&& n.getTypes().equals("universal")).collect(Collectors.toList());
        view.viewMessage("");
       view.viewMessage("Red universal car");
        view.printMet(sortList);

    }
    public void average() {
        double sum = 0;
        for (Model model: modelList) {
       sum += model.getCapacity();
        }
        view.viewMessage("");

        view.viewMessage("Average engine capacity: "+(sum/modelList.size()));
    }
}
