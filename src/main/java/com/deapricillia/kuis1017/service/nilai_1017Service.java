/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deapricillia.kuis1017.service;

import com.deapricillia.kuis1017.entity.nilai_1017;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.deapricillia.kuis1017.repo.nilai_1017Repo;

/**
 *
 * @author Hendro Steven
 */
@Service("nilai_1017Service")
@Transactional
public class nilai_1017Service {

    @Autowired
    private nilai_1017Repo repo;

    public nilai_1017 insertOrUpdate(nilai_1017 nilai_1017) {
        return repo.save(nilai_1017);
    }

    public boolean delete(Long id) {
        repo.delete(id);
        return true;
    }

    public List<nilai_1017> findAll() {
        return repo.findAllnilai_1017();
    }

    public List<nilai_1017> findBycv_1017(Long cv_1017Id) {
        return repo.findBycv_1017 (cv_1017Id);
    }

    public List<nilai_1017> findBynilai_1017(String nama_nilai) {
        return repo.findBynilai_1017("%" + nama_nilai + "%");
    }
}
