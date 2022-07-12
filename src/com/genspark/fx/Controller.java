package com.genspark.fx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML private TableView<NumberModel> tableView;
    @FXML private TableColumn<NumberModel, String> numbersId;
    private ObservableList<NumberModel> numbersModel;

    @FXML
    public void initialize(URL location, ResourceBundle resources)
    {
        numbersId.setCellValueFactory(new PropertyValueFactory<>("numWord"));
        addToList();
        tableView.setItems(numbersModel);
    }

    @FXML
    private void addToList()
    {
        SortInput myInputClass = new SortInput;
        ArrayList<String> myInput = myInputClass.sortInput();
        numbersModel = FXCollections.observableArrayList();
        for (int i = 0; i < myInput.size(); i++)
        {
            numbersModel.add(new NumberModel(myInput.get(i)));
        }
    }


//    private ObservableList<NumberModel> numbersModel = FXCollections.observableArrayList(
//            new NumberModel("One"),
//            new NumberModel("Two")
//    );
}