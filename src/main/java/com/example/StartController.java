package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class StartController {

    @FXML
    private ComboBox<String> winCombo;

    @FXML
    private TableView<Bet> betTable;

    @FXML
    private TableColumn<Bet, String> winCol;

    @FXML
    private TableColumn<Bet, String> nameCol;

    @FXML
    private TextField nameField;

    @FXML
    void initialize() {
        // System.out.println("start");
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        winCol.setCellValueFactory(new PropertyValueFactory<>("win"));

        winCombo.getItems().addAll(
            "kék", 
            "piros", 
            "zöld", 
            "sárga");
        
        winCombo.setPromptText("Válassz");
    }

    @FXML
    void onClickAddButton(ActionEvent event) {
        // System.out.println("hozzáadás...");
        String name = nameField.getText();
        // String win = winCombo.getSelectionModel().getSelectedItem();
        String win = winCombo.getValue();
        Bet bet = new Bet();
        bet.name = name;
        bet.win = win;
        betTable.getItems().add(bet);
        nameField.setText("");
        // winCombo.getSelectionModel().clearSelection();
        winCombo.commitValue();
        // winCombo.setValue("");
        winCombo.setPromptText("Válassz");
        System.out.println(name + " " + win);
    }

    @FXML
    void onClickRaceButton(ActionEvent event) {
        // System.out.println("műkszik");
        App.setRoot("mainScene");
    }

}
