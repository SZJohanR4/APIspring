/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helloworld.apispring.model.entity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 *
 * @author eser
 */
@Entity
@Table(name = "viajes")
public class Viajes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column
    private Integer idViajes;
    
     @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario Usuario_idUsuario;
     
     @ManyToOne
    @JoinColumn(name="idAuto")
    private Auto Auto_idAuto;
    
    @Column
    private Integer NroAsientosViaje;

    @Column
    private Date Fecha;

    @Column
    private String Hora;

    @Column
    private Integer Tiempo;

    @Column
    private String Origen;

    @Column
    private String Destino;
    
    @Column
    private String Precio;

    
    public Viajes() {
    }

    public Integer getIdViajes() {
        return idViajes;
    }

    public void setIdViajes(Integer idViajes) {
        this.idViajes = idViajes;
    }

    public Usuario getUsuario_idUsuario() {
        return Usuario_idUsuario;
    }

    public void setUsuario_idUsuario(Usuario Usuario_idUsuario) {
        this.Usuario_idUsuario = Usuario_idUsuario;
    }

    public Auto getAuto_idAuto() {
        return Auto_idAuto;
    }

    public void setAuto_idAuto(Auto Auto_idAuto) {
        this.Auto_idAuto = Auto_idAuto;
    }

    public Integer getNroAsientosViaje() {
        return NroAsientosViaje;
    }

    public void setNroAsientosViaje(Integer NroAsientosViaje) {
        this.NroAsientosViaje = NroAsientosViaje;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public Integer getTiempo() {
        return Tiempo;
    }

    public void setTiempo(Integer Tiempo) {
        this.Tiempo = Tiempo;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

   


}
