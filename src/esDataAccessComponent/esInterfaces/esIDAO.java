//  © 2K26 ❱──💀──❰ pat_mic ? code is life : life is code
package esDataAccessComponent.esInterfaces;

import java.util.List;

import esInfrastructureComponent.esAppException;

public interface esIDAO<T> {
    List<T> readAll()            throws esAppException;
    T       readBy (Integer id)  throws esAppException;
    boolean create (T entity)    throws esAppException;
    boolean update (T entity)    throws esAppException;
    boolean delete (Integer id)  throws esAppException;
    Integer getCountReg()        throws esAppException;
    Integer getMinReg(String tableCelName) throws esAppException;
    Integer getMaxReg(String tableCelName) throws esAppException;
}
    