/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deapricillia.kuis1017.controller;

import com.deapricillia.kuis1017.entity.cv_1017;
import com.deapricillia.kuis1017.service.cv_1017Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/cv_1017")
public class cv_1017Controller {

    @Autowired
    private cv_1017Service cv_1017Service;

    @RequestMapping(method = RequestMethod.POST)
    public cv_1017 insert(@RequestBody cv_1017 cv_1017) {
        return cv_1017Service.insert(cv_1017);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public cv_1017 update(@RequestBody cv_1017 cv_1017) {
        return cv_1017Service.update(cv_1017);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return cv_1017Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public cv_1017 getById(@PathVariable("id") Long id){
        return cv_1017Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<cv_1017> getAll(){
        return cv_1017Service.getAll();
    }
}
