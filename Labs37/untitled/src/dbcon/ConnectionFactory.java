package dbcon;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

import java.net.UnknownHostException;

/**
 * класс генерации конектов к базе
 */
public class ConnectionFactory {
    /**
     *  генерация подключения к базе на :2018
     * @return  MongoClient
     */
    public static MongoClient getMongoClient() {
        try {
            return new MongoClient();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * подключение к базе
     * @param dbName имя базы данных
     * @return  подключение к базе
     */
    public static DB getDB(String dbName) {
        MongoClient client = getMongoClient();
        if (client == null)
            return null;
        return getMongoClient().getDB(dbName);
    }

    /**
     * подключение к коллекции Places в базе Kiev на порту 2018
     * @return   подключение к коллекции Places
     */
    public static DBCollection getPlacesCollection() {
        DB base = getDB("kiev");
        if (base == null)
            return null;
        return base.getCollection("places");
    }

    //@Test
}
