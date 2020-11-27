import java.sql.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Controller {

    private List<Model> modelList;
    private List<Model> sortList;
    private View view = new View();
    private DBConnector connector = new DBConnector();
    private Map<String, String> stringMap=new HashMap<>();


    public void parameterScanner() {

        view.viewMessage("Name: ");
        String name = view.getParameters();
        view.viewMessage("Password: ");
        String pas = view.getParameters();
        stringMap.put(name, pas);
    }

    public void run() throws SQLException {
        modelList = connector.getData(stringMap);
        view.printMet(modelList);
    }

    public void sort() throws SQLException {
        sortList = modelList.stream().filter(n -> n.getBrand().equals("Apple") && n.getDiagonal() >5 ).collect(Collectors.toList());
        view.viewMessage("");
        view.viewMessage("Red universal car");
        view.printMet(sortList);

    }

    public void average() {
        double sum = 0;
        for (Model model : modelList) {
            sum += model.getDiagonal();
        }
        view.viewMessage("");

        view.viewMessage("Average Diagonal od Smartphones : " + (sum / modelList.size()));
    }
}