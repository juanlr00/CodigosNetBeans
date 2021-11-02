package models;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import static javax.persistence.GenerationType.IDENTITY;
//import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 *
 * @author danie
 */

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="actividades")
public class Actividades implements Serializable {
    
    @Id
    @GeneratedValue(strategy=IDENTITY)
    private Long id;
    
    @Column (name="t_practica")
    private String t_practica; //columna
    
    @Column (name="total_horas")
    private String total_horas; //columna
    
    @Column (name="actividad")
    private String avtividad;
    
    @Column (name="observacionesA")
    private String observacionesA;
    
    @Column (name="fecha")
    private Date fecha;

    @Override
    public String toString() {
        return "Actividades{" + "id=" + id + ", t_practica=" + t_practica + ", total_horas=" + total_horas + ", avtividad=" + avtividad + ", observacionesA=" + observacionesA + ", fecha=" + fecha + '}';
    }
    
    
}
