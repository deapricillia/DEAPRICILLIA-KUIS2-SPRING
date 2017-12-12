/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deapricillia.kuis1017.service;

import com.deapricillia.kuis1017.entity.cv_1017;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.deapricillia.kuis1017.repo.cv_1017Repo;

/**
 *
 * @author PC-16-320
 */
  @Service("cv_1017Service")
@Transactional

public class cv_1017Service {

    @Autowired
    private cv_1017Repo repo;

    public cv_1017 insert(cv_1017 cv_1017) {
        return repo.save(cv_1017);
    }
    
    public cv_1017 update(cv_1017 cv_1017) {
        return repo.save(cv_1017);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public cv_1017 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<cv_1017> getAll(){
        return repo.findAllcv_1017();
    }
}
 

