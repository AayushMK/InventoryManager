/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import Model.Salesman;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author light
 */
public class loader {

    Connection con;

    public loader() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorymanagerdatabase", "root", "");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }

    public void insertSalesmanData(Salesman s) throws SQLException {
        try (PreparedStatement stmt = con.prepareStatement("INSERT INTO salseman(sn, pan_number, organization_name, address, discount_rate, credit_limit, phone_number) VALUES(?,?,?,?,?,?,?)")) {
            stmt.setInt(1, s.getSn());
            stmt.setString(2, s.getPan_number());
            stmt.setString(3, s.getOrganization_name());
            stmt.setString(4, s.getAddress());
            stmt.setInt(5,Integer.getInteger(s.getCredit_limit()));
            stmt.setInt(6, Integer.getInteger(s.getDiscount_rate()));
            stmt.setString(7, s.getPhone_number());
            stmt.execute();
        }
        con.close();

    }
}
