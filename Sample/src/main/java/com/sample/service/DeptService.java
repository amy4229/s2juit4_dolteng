package com.sample.service;

import com.sample.entity.Dept;

public class DeptService extends AbstractService<Dept> {

    public Dept findById(Integer id) {
        return select().id(id).getSingleResult();
    }
}