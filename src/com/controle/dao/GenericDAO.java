
package com.controle.dao;
import java.io.Serializable;
import java.util.List;

public interface GenericDAO <T, ID extends Serializable>{

    public T save(T t);
    public T update(T t);
    public List<T> FindAll();
    public T remove(T t, Long id);

}
