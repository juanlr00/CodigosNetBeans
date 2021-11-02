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
@Table(name="profesor")
public class Profesor implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    
    @Column (name="usuarioP")
    private String usuarioP;
    
    @Column (name="nombreP")
    private String nombre; //columna
    
    @Column (name="apellidoP1")
    private String apellido1;
    
    @Column (name="apellidoP2")
    private String apellido2;
    
    @Column (name="contraseñaP")
    private String passwordP;
    
    @Column (name="emailP")
    private String emailP;

    @Override
    public String toString() {
        return "Profesor{" + "id=" + id + ", usuarioP=" + usuarioP + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", passwordP=" + passwordP + ", emailP=" + emailP + '}';
    }

    
    
   
}
