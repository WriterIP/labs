package dbcon;

import com.mongodb.DBObject;

import java.util.List;

/**
 * ���������, ����������� �������������� � �����
 */
public interface IBase {
    /**
     * ������� ������� � ����
     * @param query ������ �������� ��� �������
     * @return true, ���� ��������� ������ �������, ����� - false
     */
    public boolean insert(DBObject... query);

    /**
     * ������ � ����
     * @param query ������ �������
     * @return  ������������� ������ ��������
     */
    public List<DBObject> find(DBObject query);
}
