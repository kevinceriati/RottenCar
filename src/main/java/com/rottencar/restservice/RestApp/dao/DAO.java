package com.rottencar.restservice.RestApp.dao;

import com.rottencar.restservice.RestApp.model.Car;

import java.util.List;

public abstract class DAO<T> {

    public abstract T findById(int id);

    public abstract List<T> findAll();

    abstract void save(T t);

    abstract T update(T t);

    abstract T delete(int id);
}
