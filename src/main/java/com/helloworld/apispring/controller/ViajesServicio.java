/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helloworld.apispring.controller;


import com.helloworld.apispring.model.dao.ViajesRepositorio;
import com.helloworld.apispring.model.entity.Viajes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author eser
 */
@Service
public class ViajesServicio {
    @Autowired
    private ViajesRepositorio viajesRepositorio;

    public ViajesServicio() {
    }
    
    public List<Viajes> getAllViajes(){
        return viajesRepositorio.getAllViajes();
    }


    
}
