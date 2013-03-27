package dbcon;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * класс, инкапсулирующий работу с базой
 */
public class DbHelper implements IBase {
    private DBCollection places;

    /**
     * конструктор по умолчанию, инициализируется стандартное подключение к базе
     */
    public DbHelper() {
        places = ConnectionFactory.getPlacesCollection();
    }

    /**
     * вставка обьекта в базу
     * @param query массив обьектов для вставки
     * @return true, если опперация прошла успешно, иначе - false
     */
    @Override
    public boolean insert(DBObject... query) {
        if (places == null)
            return false;
        places.insert(query);
        return true;

    }

    /**
     * запрос к базе
     * @param query обьект запроса
     * @return  результрующий список обьектов
     */
    @Override
    public List<DBObject> find(DBObject query) {
        List<DBObject> place = new ArrayList<DBObject>();
        Set<String> uniques = new HashSet<String>();
        DBCursor cursor = places.find(query);
        try {
            while (cursor.hasNext()) {
                place.add(cursor.next());
                DBObject obj = cursor.next();
                if(obj.keySet().contains("tags"))
                   System.out.println(obj.get("_id").getClass());
               // for (String s : ((BasicDBObject)obj.get("tags")).keySet())
                 //   if (!uniques.contains(s)) uniques.add(s);

            }
        } finally {
            cursor.close();
        }
        for(String s:uniques)
        System.out.println(s);
        return place;
    }

    @Test
    public void testBase(){
        DBObject obj = new BasicDBObject();
        obj.put("tags.amenity", new BasicDBObject("$exists", "true"));
        assertTrue(find(obj)!=null);
    }

    public static void main(String[] args) {
        DbHelper helper = new DbHelper();
        DBObject obj = new BasicDBObject();
        obj.put("tags.amenity", new BasicDBObject("$exists", "true"));
        helper.find(obj);

    }
}
