package controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import dbcon.DbHelper;
import dbcon.IBase;
import entity.Place;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ihor
 * Date: 3/24/13
 * Time: 11:19 PM
 */
public class Generator {

    private List<DBObject> objects;
    IBase helper;

    public Generator() {
        helper = new DbHelper();
        DBObject obj = new BasicDBObject();
        obj.put("tags.amenity", new BasicDBObject("$exists", "true"));
        objects = helper.find(obj);
    }

    public void generateDb(){
       for(DBObject obj:objects){
           Place pl=new Place((Integer)obj.get("_id"));
           pl.setLat((Double)obj.get("lat"));
           pl.setLon((Double)obj.get("lon"));
       }
    }

}
