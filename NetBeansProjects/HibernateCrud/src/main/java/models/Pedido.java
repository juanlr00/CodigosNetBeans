/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;


import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author juanl
 */
public class Pedido implements Serializable {
    private Integer idProdructo;
    private String nombreProd;
    private String estadoProd;
    private Integer fechaProd;

    @OneToMany(mappedBy = "Pedido", fetch = FetchType.EAGER) 
    private Pedido pedido;  
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProd;
    
    @Column (name="nombreProd")
    private String nombreProducto;
    
    @Column (name="estadoProd")
    private String estadoProducto;
    
    @Column (name="precioProd")
    private Date fechaProducto;
    
    public Pedido() {
    }

    public Pedido(Integer idProd, String nombreProd, String estadoProd, Integer precioProd) {
        this.idProd = idProd;
        this.nombreProd = nombreProd;
        this.estadoProd = estadoProd;
        this.fechaProd = precioProd;
    }

    public Pedido(Integer product_id, String estado, Date fecha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Pedido(long l, String ensalada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public Integer getIdProd() {
        return idProd;
    }

    public void setIdProd(Integer idProd) {
        this.idProd = idProd;
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

    public void setFechaProd(Integer precioProd) {
        this.fechaProd = precioProd;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idProd=" + idProd + ", nombreProd=" + nombreProd + ", estadoProd=" + estadoProd + ", fechaProd=" + fechaProd + '}';
    }
    
}
