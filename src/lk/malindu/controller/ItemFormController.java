package lk.malindu.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import lk.malindu.model.Item;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import lk.malindu.model.Item;

import java.sql.SQLException;

public class ItemFormController {

    public TextField txtID;
    public TextField txtSize;
    public TextField txtPrice;
    public TextField txtQty;
    public Button btnSave;

    public void btnSaveOnAction(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        String id = txtID.getText();
        String size = txtSize.getText();
        String price = txtPrice.getText();
        String qty = txtQty.getText();

        Item t1 = new Item( id,size,price,qty);
         ItemForm.addItem(t1);
    }
}
