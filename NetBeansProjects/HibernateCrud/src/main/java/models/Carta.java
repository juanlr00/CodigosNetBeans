/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author juanl
 */
@Entity
@Table(name="Carta")
public class Carta implements Serializable{
 
    private Integer id;
    private String idProducto;
    private String estadoPedido;
    private Integer precioProd;
    
    @OneToMany(mappedBy = "Carta", fetch = FetchType.EAGER) 
    private Carta carta;  
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProd;
    
    @Column (name="idProducto")
    private String idProductos;
    
    @Column (name="estadoPedido")
    private String estadoP;
    
    @Column (name="precioProd")
    private Integer precioProducto;
    
    public Carta() {
    }

    public Carta(Integer id, String idProducto, String estadoPedido, Date fecha) {
        this.id = id;
        this.idProducto = idProducto;
        this.estadoPedido = estadoPedido;
        this.precioProd = precioProd;
    }

    public Carta(String nombre, String descrip, Double precioU) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public Integer getPrecioProd() {
        return precioProd;
    }

    public void setPrecioProd(Integer precioProd) {
        this.precioProd = precioProd;
    }

    @Override
    public String toString() {
        return "Carta{" + "id=" + id + ", idProducto=" + idProducto + ", estadoPedido=" + estadoPedido + ", precioProd=" + precioProd + '}';
    }

    public void setPrecioProd(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
