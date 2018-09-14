/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helloworld.apispring.controller;



import com.helloworld.apispring.model.entity.Auto;
import com.helloworld.apispring.model.entity.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Controller {
    
    @Autowired
    private AutoServicio autoServicio;
    @Autowired
    private UsuarioServicio usuarioServicio;
    
    @RequestMapping(value = "/autosList/", method = RequestMethod.GET)
    public ResponseEntity<List<Auto>> obtenerAutos() {
        List<Auto> carros = autoServicio.getAllAutos();
        return new ResponseEntity<List<Auto>>(carros, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/usuariosList/", method = RequestMethod.GET)
    public ResponseEntity<List<Usuario>> obtenerUsuarios() {
        List<Usuario> users = usuarioServicio.getAllUsuario();
        return new ResponseEntity<List<Usuario>>(users, HttpStatus.OK);
    }
    
     @RequestMapping(value = "/autoNew/", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> crearEquipo(@RequestBody Auto carroNew) {
        String resultado = autoServicio.crearAuto(carroNew);
        return new ResponseEntity<String>(resultado, HttpStatus.OK);
    }
   
    
    
}
