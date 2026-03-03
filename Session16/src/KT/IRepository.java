package KT;

import java.util.List;

public interface IRepository <T>{
    boolean add(T item);
    boolean removeByid(String id);
    T findById(String id);
    List<T> findAll();
}
