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
    private Integer IdViajes;
    
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

    @ManyToOne
    @JoinColumn(name="Usuario")
    private Usuario usuario;
    
    public Viajes() {
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

    public Integer getIdViajes() {
        return IdViajes;
    }

    public void setIdViajes(Integer IdViajes) {
        this.IdViajes = IdViajes;
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
