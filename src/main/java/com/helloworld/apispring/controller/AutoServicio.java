/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helloworld.apispring.controller;


import com.helloworld.apispring.model.dao.AutoRepositorio;
import com.helloworld.apispring.model.entity.Auto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutoServicio {
    
    @Autowired
    private AutoRepositorio autoRepositorio;

    public AutoServicio() {
    }
    
    public List<Auto> getAllAutos(){
        return autoRepositorio.getAllAutos();
    }

//   public String crearRanking(RankingFifa rankingFifa) {
//    long equipoId= rankingRepositorio.crearRanking(rankingFifa);
//    return "Equipo creado con ID:"+equipoId;
//    }
//    
}
