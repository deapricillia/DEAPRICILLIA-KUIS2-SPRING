/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deapricillia.kuis1017.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Hendro Steven
 */
@Entity
@Table(name = "cv_1017")
public class cv_1017 implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false, unique = true)
    private String nama_cv;
    @Column(length = 255, nullable = true)
    private String alamat_cv;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id= id;
    }

    /**
     * @return the name
     */
    public String getNama() {
        return nama_cv;
    }

    public void setNama(String nama) {
        this.nama_cv = nama;
    }
    public String getPass() {
        return alamat_cv;
    }

    public void setPass(String pass) {
        this.alamat_cv = pass;
    }
   

}

