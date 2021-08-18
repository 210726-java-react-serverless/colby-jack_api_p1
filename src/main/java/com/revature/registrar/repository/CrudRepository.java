package com.revature.registrar.repository;


import java.util.List;

/**
 *  Basic interface that exposes simple CRUD operations
 * @param <E>
 */
public interface CrudRepository<E> {

    List<E> findAll();
    E findById(String id);
    E save(E newResource);
    boolean update(E updatedResource);
    boolean deleteById(String id);
}
