/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import Model.Product;
import Model.Stockist;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author light
 */
public class loader {

    Connection con;

    public loader() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/i_database", "root", "");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }

    public void insertStockist(Stockist s){
        try {
            PreparedStatement stmt = con.prepareStatement("INSERT INTO stockist(pan_number, full_name, organizations_name, address, phone_number, discount_rate, credit_rate) VALUES(?,?,?,?,?,?,?)");
            stmt.setString(1, s.getPan_number());
            stmt.setString(2, s.getName());
            stmt.setString(3, s.getOrganizations_name());
            stmt.setString(4, s.getAddress());
            stmt.setString(5, s.getPhone_number());
            stmt.setFloat(6, s.getDiscount_rate());
            stmt.setInt(7,s.getCredit_limit());
            stmt.execute();
            
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(loader.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void insertProduct(Product p) throws SQLException{
        PreparedStatement stmt = con.prepareStatement("INSERT INTO product( product_name, batch_number, price_rate) VALUES(?,?,?)");
        
        stmt.setString(1, p.getProduct_name());
        stmt.setString(2, p.getBatch_number());
      
        stmt.setFloat(3, p.getPrice_rate());
        stmt.execute();
        con.close();
    }
    
    public ArrayList<Stockist> getStockist(){
        
            ArrayList<Stockist> al = new ArrayList<>();
            try {
            Statement st =  con.createStatement();
            ResultSet rs = st.executeQuery("Select * from stockist");
            while(rs.next()){
                Stockist s = new Stockist();
                s.setName(rs.getString("full_name"));
                s.setPan_number(rs.getString("pan_number"));
                s.setAddress(rs.getString("address"));
                s.setOrganizations_name(rs.getString("organizations_name"));
                s.setPhone_number(rs.getString("phone_number"));
                s.setCredit_limit(rs.getInt("credit_rate"));
                s.setDiscount_rate(rs.getFloat("discount_rate"));
                al.add(s);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(loader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }
    
    public ArrayList<Product> getProduct(){
        
            ArrayList<Product> al = new ArrayList<>();
            try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM product");
            while(rs.next()){
                Product p = new Product();
                p.setProduct_id(rs.getInt("product_id"));
                p.setBatch_number(rs.getString("batch_number"));
                p.setPrice_rate(rs.getFloat("price_rate"));
                p.setProduct_name(rs.getString("product_name"));
                p.setExpiry_date(rs.getString("expiry_date"));
                al.add(p);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(loader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }
    
}
