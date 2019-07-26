package moh.dao;

import java.util.List;

import moh.model.Customer;

public interface GenericDao<T,K> {
List<T> findAll();
T findByKey(K id);
void insert(T obj);
void update(T obj);
void deleteByKey(K key);
}