//❰ 💀 ❱\\    ──❰ © 2K25 EPN-FIS  |   pat_mic   |  All rights reserved, baby ❱──  

package esDataAccess.esHelpers;

import java.util.List;

public interface IDAO<T> {  // obligatorio implementar los metodos CRUD en los DAO
    public boolean create(T entity)    throws Exception;
    public T       readBy(Integer id)  throws Exception;
    public List<T> readAll()           throws Exception;
    public boolean update(T entity)    throws Exception;
    public boolean delete(int id)      throws Exception;
    public Integer getRowCount()       throws Exception;   
}
