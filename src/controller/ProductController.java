/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Product;
import database.loader;
import java.sql.SQLException;

/**
 *
 * @author light
 */
public class ProductController {
  public void saveProduct(Product p) throws SQLException{
        loader l = new loader();
        l.insertProduct(p);
    }
}
