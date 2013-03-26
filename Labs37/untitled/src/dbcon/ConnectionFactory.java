package dbcon;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

import java.net.UnknownHostException;

/**
 * Created with IntelliJ IDEA.
 * User: ihor
 * Date: 3/23/13
 * Time: 10:20 PM
 */
public class ConnectionFactory {

    public static MongoClient getMongoClient() {
        try {
            return new MongoClient();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static DB getDB(String dbName) {
        MongoClient client = getMongoClient();
        if (client == null)
            return null;
        return getMongoClient().getDB(dbName);
    }

    public static DBCollection getPlacesCollection() {
        DB base = getDB("kiev");
        if (base == null)
            return null;
        return base.getCollection("places");
    }
}
