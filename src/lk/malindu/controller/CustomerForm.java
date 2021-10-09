package lk.malindu.controller;


import lk.malindu.model.Customer;
import lk.malindu.model.DBConnection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerForm {

    public static boolean addCustomer(Customer customer) throws SQLException, ClassNotFoundException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("Insert into customer Values(?,?,?,?)");
        stm.setObject(1,customer.getId());
        stm.setObject(2,customer.getName());
        stm.setObject(3,customer.getAddress());
        stm.setObject(4,customer.getContact());
        return stm.executeUpdate() > 0;
    }
}
