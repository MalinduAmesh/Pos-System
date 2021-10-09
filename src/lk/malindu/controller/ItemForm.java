package lk.malindu.controller;


import lk.malindu.model.Customer;
import lk.malindu.model.DBConnection;
import lk.malindu.model.Item;


import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ItemForm {

    public static boolean addItem(Item item) throws SQLException, ClassNotFoundException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("Insert into item Values(?,?,?,?)");
        stm.setObject(1,item.getItemID());
        stm.setObject(2,item.getPackSize());
        stm.setObject(3,item.getQtyOnHand());
        stm.setObject(4,item.getUnitPrice());
        return stm.executeUpdate() > 0;
    }

}
