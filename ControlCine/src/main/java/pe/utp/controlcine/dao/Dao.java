package pe.utp.controlcine.dao;

import java.util.List;

public interface Dao<T> {

    default T getEntity(Object pk) {
        throw new UnsupportedOperationException("No implementado");
    }

    default T getEntity(Object[] valores) {
        throw new UnsupportedOperationException("No implementado");
    }

    default T getEntity01(T entidad) {
        throw new UnsupportedOperationException("No implementado");
    }

    default List<T> getListOfEntities() {
        throw new UnsupportedOperationException("No implementado");
    }
    
    default List<T> getListOfEntities01(Object[] valores) {
        throw new UnsupportedOperationException("No implementado");
    }

    default boolean insert(T entidad) {
        throw new UnsupportedOperationException("No implementado");
    }

    default boolean insert01(T entidad) {
        throw new UnsupportedOperationException("No implementado");
    }   

    default boolean update(T entidad) {
        throw new UnsupportedOperationException("No implementado");
    }

    default boolean delete(Object pk) {
        throw new UnsupportedOperationException("No implementado");
    }

    default List<T> getListOfEntities02(Object[] valores) {
        throw new UnsupportedOperationException("No implementado");
    }

//    default List<T> getListOfEntities03(Object[] valores) {
//        throw new UnsupportedOperationException("No implementado");
//    }
//
//    default List<T> getListOfEntities04(Object[] valores) {
//        throw new UnsupportedOperationException("No implementado");
//    }
//
//    default List<T> getListOfEntities05(Object[] valores) {
//        throw new UnsupportedOperationException("No implementado");
//    }    
//    default boolean execTrasaction01(Object[] entIns, Object[] entUpd, Object[] entDel){
//        throw new UnsupportedOperationException("No implementado");
//    }
//    default boolean execTrasaction02(Object[] entIns, Object[] entUpd, Object[] entDel){
//        throw new UnsupportedOperationException("No implementado");
//    }
//    default boolean execTrasaction03(Object[] entIns, Object[] entUpd, Object[] entDel){
//        throw new UnsupportedOperationException("No implementado");
//    }
}
