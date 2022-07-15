package Project;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    List<String> sortedList;
    ArrayList<Text> nodes;
    @FXML
    GridPane gridPane;

    @FXML
    public void displayList(String path) {
        nodes = new ArrayList<>();
        try {
            sortedList = SortInput.sortInput(path).stream().toList();
            for (String s : sortedList) {
                nodes.add(new Text("  " + s + "  "));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        gridPane.setGridLinesVisible(true);
        gridPane.setPadding(new Insets(2, 5, 2, 5));

        int x = 0, y = 0;

        for (int i = 0; i < nodes.size(); i++) {
            gridPane.add(nodes.get(i), x, y);
            y++;
            if (y % 10 == 0) {
                x++;
                y = 0;
            }
        }
    }

    public String openFileExplorer() {
        FileChooser fc = new FileChooser();
        File selectedFile = fc.showOpenDialog(null);
        System.out.println(selectedFile.getAbsoluteFile());
        displayList(String.valueOf(selectedFile.getAbsoluteFile()));
        return "";
    }
}
