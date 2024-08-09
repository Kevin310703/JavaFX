package com.c2306l.myproject.IGeneric;

import javafx.collections.ObservableList;

import java.util.List;

public interface IService<T>{
    public void insert(T t);
    public void remove(T t);
    public void edit(T t);
    public T findById(T t);
    public ObservableList<T> findAll();
}
