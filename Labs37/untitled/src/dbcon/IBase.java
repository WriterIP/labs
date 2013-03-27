package dbcon;

import com.mongodb.DBObject;

import java.util.List;

/**
 * интерфейс, описывающий взаимодействие с базой
 */
public interface IBase {
    /**
     * вставка обьекта в базу
     * @param query массив обьектов для вставки
     * @return true, если опперация прошла успешно, иначе - false
     */
    public boolean insert(DBObject... query);

    /**
     * запрос к базе
     * @param query обьект запроса
     * @return  результрующий список обьектов
     */
    public List<DBObject> find(DBObject query);
}
