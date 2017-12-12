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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Hendro Steven
 */
@Entity
@Table(name = "nilai_1017")
public class nilai_1017 implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 150, nullable = false)
    private String nama_nilai;
    private String alamat_nilai;
    @ManyToOne
    private cv_1017 cv_1017;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getNama() {
        return nama_nilai;
    }

    public void setName(String nama) {
        this.nama_nilai = nama;
    }

    public String getAlamat() {
        return alamat_nilai;
    }

    public void setAlamat(String alamat) {
        this.alamat_nilai = alamat;
    }

    public cv_1017 getcv_1017() {
        return cv_1017;
    }

    public void setcv_1017(cv_1017 cv_1017) {
        this.cv_1017 = cv_1017;
    }
}
