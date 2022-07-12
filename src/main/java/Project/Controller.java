package Project;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    List<String> sortedList;
    @FXML
    GridPane gridPane;

    @FXML
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            sortedList = SortInput.sortInput().stream().toList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        gridPane.add(new Text(sortedList.get(0)), 0, 0);
        for (int i = 0; i < sortedList.size(); i++) {
            gridPane.add(new Text(sortedList.get(i)), 0, i);
            if (i >= 10) {
                gridPane.add(new Text(sortedList.get(i)), 1, (i - 10));
            }
        }
        gridPane.setGridLinesVisible(true);
    }
}
