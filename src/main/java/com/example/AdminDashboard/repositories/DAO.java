package com.example.AdminDashboard.repositories;

import java.util.List;

public interface DAO<T>{
    public int create(T record);
    public List<T> read();
    public List<T> readRecord(Integer Id);
//    public int update(Integer Id,T record);
    public  int deleteRecord(Integer Id);
    public int deleteAll();
}