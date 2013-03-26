package dbcon;

import com.mongodb.DBObject;

import java.util.List;

/**
 * интерфейс, описывающий взаимодействие с базой
 */
public interface IBase {
    public boolean insert(DBObject... query);
    public List<DBObject> find(DBObject query);
}
