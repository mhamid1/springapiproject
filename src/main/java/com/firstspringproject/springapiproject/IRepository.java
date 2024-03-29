package com.firstspringproject.springapiproject;

import java.util.Collection;

public interface IRepository<T> {

    public void save(T p);
    
    public Collection<T> getAll();
    
} 
