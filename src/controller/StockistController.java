/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Stockist;
import database.loader;
import java.sql.SQLException;

/**
 *
 * @author light
 */
public class StockistController {
    public void saveStockist(Stockist s) throws SQLException{
        loader l = new loader();
        l.insertStockist(s);
    }
    
    
}
