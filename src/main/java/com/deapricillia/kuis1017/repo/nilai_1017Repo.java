/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deapricillia.kuis1017.repo;

import com.deapricillia.kuis1017.entity.nilai_1017;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


/**
 *
 * @author Hendro Steven
 */
public interface nilai_1017Repo extends CrudRepository<nilai_1017, Long>{
    
    @Query("select l from nilai_1017 l")
    public List<nilai_1017> findAllnilai_1017();
    
    @Query("select l from nilai_1017 l where l.cv_1017.id= :id")
    public List<nilai_1017> findBycv_1017(@Param("id") Long id);
    
    @Query("select l from nilai_1017 l where LOWER(l.nama_nilai) LIKE LOWER(:nama_nilai)")
    public List<nilai_1017> findBynilai_1017(@Param("nama_nilai") String nama_nilai);
}
