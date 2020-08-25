/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.purchaseandsalesrecordgui.utils;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import ec.edu.espe.purchaseandsalesrecordgui.controller.FrmInvoiceManagement;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jhonatan Lituma
 */
public class DataBase {
    DB dbasedata;
    DBCollection dBCollection;
    BasicDBObject basicDBObject = new BasicDBObject();
    
    public DataBase(){
        try{
            Mongo mongo = new Mongo("localhost", 27017);
            dbasedata = mongo.getDB("DataBaseStore");
            dBCollection = dbasedata.getCollection("DataBaseStore");
            System.out.println("Connect");
        }catch (UnknownHostException ex){
            Logger.getLogger(FrmInvoiceManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insert(String object){
        basicDBObject.put(object, this);
    }
    
}
