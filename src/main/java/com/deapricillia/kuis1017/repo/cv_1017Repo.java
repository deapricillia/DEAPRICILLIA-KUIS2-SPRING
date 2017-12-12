/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deapricillia.kuis1017.repo;

import com.deapricillia.kuis1017.entity.cv_1017;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hendro Steven
 */
public interface cv_1017Repo extends CrudRepository<cv_1017, Long> {

    @Query("select c from cv_1017 c")
    public List<cv_1017> findAllcv_1017();
}
