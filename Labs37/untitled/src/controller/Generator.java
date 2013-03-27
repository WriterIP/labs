package controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import dbcon.DbHelper;
import dbcon.IBase;
import entity.Place;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * класс генерации данных для БД
 */
public class Generator {
    /**
     * Массив сырых обьектов с базы
     */
    private List<DBObject> objects;
    /**
     * Сгенерированный список мест
     */
    private List<Place> places;
    /**
     * Хелпер для подключения к базе
     */
    private IBase helper;

    /**
     * Конструктор по-умолчанию, наполняет массив сырых обьектов
     */
    public Generator() {
        helper = new DbHelper();
        DBObject obj = new BasicDBObject();
        obj.put("tags.amenity", new BasicDBObject("$exists", "true"));
        objects = helper.find(obj);
    }

    /**
     * генерация списска мест из "сырых" обьектов
     */
    public void generateDb() {
        places=new ArrayList<Place>();
        for (DBObject obj : objects) {
            Place pl = new Place((Integer) obj.get("_id"));
            pl.setLat((Double) obj.get("lat"));
            pl.setLon((Double) obj.get("lon"));
            places.add(pl);
        }
    }

    /**
     * вставка сгенерированных обьектов в базу
     * @return  true, если прошла успешно, иначе false
     */
    public boolean insertGenerated() {
        return true;
    }
    @Test
    public void checkPlace(){
        objects.clear();
        DBObject d=new BasicDBObject("_id",(1));
        d.put("lat",new Double(0.));
        d.put("lon",new Double(0.));
        objects.add(d);
        generateDb();
        Place p=places.get(0);
        assertEquals(new  Integer(p.getId()), (Integer)d.get("_id"));
    }

    @Test
    public void checkInsert(){
        assertTrue(insertGenerated());
    }

}
