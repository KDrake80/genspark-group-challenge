package Project;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    List<String> sortedList;
    ArrayList<Text> nodes;
    @FXML
    GridPane gridPane;



    @FXML
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nodes = new ArrayList<>();
        try {
            sortedList = SortInput.sortInput().stream().toList();
            for (String s:sortedList) {
                nodes.add(new Text("\t" + s));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        gridPane.setGridLinesVisible(true);
        gridPane.setPadding(new Insets(2, 5, 2,5));

        int x=0, y=0;

        for (int i = 0; i < nodes.size(); i++) {
            gridPane.add(nodes.get(i), x, y);
            y++;
            if(y % 10 == 0){
               x++;
               y=0;
            }
        }
    }
}
