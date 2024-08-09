package com.aptech.javafxe2.IGeneric;

import javafx.collections.ObservableList;

public interface IService<T> {
    public void insert(T t);
    public void remove(T t);
    public void edit(T t);
    public T findById(T t);
    public ObservableList<T> findAll();
}
