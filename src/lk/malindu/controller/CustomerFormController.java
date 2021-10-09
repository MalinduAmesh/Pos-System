package lk.malindu.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import lk.malindu.model.Customer;

import javax.swing.*;
import java.sql.SQLException;

public class CustomerFormController {
    public Button btnSaveID;
    public Button btnCancelId;

    public TextField txtID;
    public TextField txtName;
    public TextField txtAddress;
    public TextField txtContact;


    public void btnSave(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        String name = txtID.getText();
        String id = txtName.getText();
        String address = txtAddress.getText();
        String contact = txtContact.getText();

        Customer customer = new Customer(id,name,address,contact);

        boolean isAdded = CustomerForm.addCustomer(customer);
        JOptionPane.showMessageDialog(null,"Customer Create","",JOptionPane.INFORMATION_MESSAGE);

    }

    public void btnCancel(ActionEvent actionEvent) {
    }
}
