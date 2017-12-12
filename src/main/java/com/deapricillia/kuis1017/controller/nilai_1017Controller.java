/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deapricillia.kuis1017.controller;

import com.deapricillia.kuis1017.entity.nilai_1017;
import com.deapricillia.kuis1017.service.nilai_1017Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.deapricillia.kuis1017.repo.nilai_1017Repo;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/nilai_1017")
public class nilai_1017Controller {
    
    @Autowired
    private nilai_1017Service nilai_1017Service;
    
    @RequestMapping(method = RequestMethod.POST)
    public nilai_1017 insertOrUpdate(@RequestBody nilai_1017 nilai_1017){
        return nilai_1017Service.insertOrUpdate(nilai_1017);
    }
  
}
