/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C05L0321
 */
import com.mongodb.*;
import com.mongodb.MongoClient;

public class Connection
{
    
    public DBCollection connection(String coll)
    {
        try
        {
            MongoClient mc = new MongoClient("localhost",27017);
            DB d = mc.getDB("cable");
            DBCollection dbc = d.getCollection(coll);
            return dbc;
        }
        
        catch(Exception e)
        {
            return null;
        }
    }
    
}
