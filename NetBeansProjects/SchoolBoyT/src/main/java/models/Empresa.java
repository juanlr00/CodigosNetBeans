package models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author DanielMenaRodríguez
 */

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="empresas")
public class Empresa implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    
    @Column (name="nombreE")
    private String nombre; //columna
    
    @Column (name="telefonoE")
    private Integer telefonoE;
    
    @Column (name="emailE")
    private String emailE;
    
    @Column (name="n_responsable")
    private String n_Responsable;
    
    @Column (name="obsersacionesE")
    private String obsersacionesE;

    @Override
    public String toString() {
        return "Empresa{" + "id=" + id + ", nombre=" + nombre + ", telefonoE=" + telefonoE + ", emailE=" + emailE + ", n_Responsable=" + n_Responsable + ", obsersacionesE=" + obsersacionesE + '}';
    }
    
    
}
