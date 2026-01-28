//  © 2K26 ❱──💀──❰ pat_mic ? code is life : life is code
package esBusinessComponent;

import java.util.List;

import esDataAccessComponent.esInterfaces.esIDAO;
import esInfrastructureComponent.esAppException;

public class esFactoryBL<T>  {
    private final esIDAO<T> oDAO;

    public esFactoryBL(Class<? extends esIDAO<T>> classDAO) {
        try {
            this.oDAO = classDAO.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            esAppException er = new esAppException("Error al instanciar classDAO<T>", e, getClass(), "FactoryBL(<T>)");
            throw new RuntimeException(er);
        }
    }

    // Constructor que usa un Supplier para crear la instancia de T
    // public FactoryBL(Supplier<IDAO<T>> supplier) {
    //     this.oDAO = supplier.get(); 
    // }
 
    public List<T> getAll() throws esAppException {
         return oDAO.readAll();
    }

    public T getBy(Integer id) throws esAppException {
        return oDAO.readBy(id);
    }

    public boolean add(T oT) throws esAppException {
        return oDAO.create(oT);
    }

    public boolean upd(T oT) throws esAppException {
        return oDAO.update(oT);
    }

    public boolean del(Integer id) throws esAppException {
        return oDAO.delete(id);
    }

    public Integer getMaxReg(String cellName) throws esAppException{
        return oDAO.getMaxReg(cellName);
    }

    public Integer getMinReg(String cellName) throws esAppException{
        return oDAO.getMinReg(cellName);
    }

    public Integer getCountReg() throws Exception{
        return oDAO.getCountReg();
    }
}
