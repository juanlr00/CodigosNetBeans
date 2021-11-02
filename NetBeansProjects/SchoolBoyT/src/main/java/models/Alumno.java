package models;

import java.io.Serializable;
import java.sql.Date;
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
@Table(name="alumno")
public class Alumno implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    
    @Column (name="usuario")
    private String usuario;
    
    @Column (name="nombre")
    private String nombre; //columna
    
    @Column (name="apellido1")
    private String apellido1;
    
    @Column (name="apellido2")
    private String apellido2;
    
    @Column (name="dni")
    private String dni;
    
    @Column (name="f_nacimiento")
    private Date f_Nacimiento;
    
    @Column (name="email")
    private String email;
    
    @Column (name="telefono")
    private Integer telefono;
    
    @Column (name="n_empresa")
    private String n_Empresa;
    
    @Column (name="n_profesor")
    private String n_Profesor;
    
    @Column (name="h_dual")
    private Integer h_Dual;
    
    @Column (name="h_fct")
    private Integer h_FCT;
    
    @Column (name="observaciones")
    private String obser;
    
    @Column (name="contraseña")
    private String password;

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", usuario=" + usuario + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", dni=" + dni + ", f_Nacimiento=" + f_Nacimiento + ", email=" + email + ", telefono=" + telefono + ", n_Empresa=" + n_Empresa + ", n_Profesor=" + n_Profesor + ", h_Dual=" + h_Dual + ", h_FCT=" + h_FCT + ", obser=" + obser + ", password=" + password + '}';
    }

    
    
}
