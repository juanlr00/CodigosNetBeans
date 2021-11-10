/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;

/**
 *
 * @author JuanLamasRubio
 */
public class Pedido implements Serializable {
    private Integer idProdructo;
    private String nombreProd;
    private String estadoProd;
    private Integer fechaProd;
    private String alumno;
    private String ciclo;
    
    public Pedido() {
        
    }

    public Pedido(Integer idProdructo, String nombreProd, String estadoProd, Integer fechaProd) {
        this.idProdructo = idProdructo;
        this.nombreProd = nombreProd;
        this.estadoProd = estadoProd;
        this.fechaProd = fechaProd;
        
    }

    public Pedido(String alumno, String ciclo) {
        this.alumno = alumno;
        this.ciclo = ciclo;
    }

    public Integer getIdProdructo() {
        return idProdructo;
    }

    public void setIdProdructo(Integer idProdructo) {
        this.idProdructo = idProdructo;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public String getEstadoProd() {
        return estadoProd;
    }

    public void setEstadoProd(String estadoProd) {
        this.estadoProd = estadoProd;
    }

    public Integer getFechaProd() {
        return fechaProd;
    }

    public void setFechaProd(Integer fechaProd) {
        this.fechaProd = fechaProd;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idProdructo=" + idProdructo + ", nombreProd=" + nombreProd + ", estadoProd=" + estadoProd + ", fechaProd=" + fechaProd + ", alumno=" + alumno + ", ciclo=" + ciclo + '}';
    }

    
}
