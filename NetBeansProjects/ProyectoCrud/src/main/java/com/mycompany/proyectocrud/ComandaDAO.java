/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectocrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.sql.Statement.RETURN_GENERATED_KEYS;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Comandas;

/**
 *
 * @author JuanLamasRubio
 */
public class ComandaDAO {
    private static Connection con;
    
    static{
        String url = "jdbc:mysql://localhost:3306/acceso?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String user = "root";
        String password = "";
        try {
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión establecida con la base de datos");
        } catch (SQLException ex) {
            Logger.getLogger(ComandaDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se pudo establecer la conexión con la base de datos");
        }
    }
    
    static final String LIST_QUERY ="SELECT * FROM carta";
    static final String INSERT_QUERY = "INSERT INTO carta(nombre,disponibilidad,prioridad) VALUES (?,?,?)";
    static final String GET_QUERY= "SELECT * FROM carta WHERE id=?";
    static final String REMOVE_QUERY="DELETE FROM carta WHERE id=?";
    static final String COUNT_QUERY="SELECT count(id) as total from carta";
     public ArrayList<Comandas> list(){
        
        var salida = new ArrayList<Comandas>();
        
        try( Statement st = con.createStatement() ){
            
            ResultSet resultado = st.executeQuery(LIST_QUERY);
            
            while(resultado.next()){
                Comandas c = new Comandas();
                c.setId( resultado.getInt("id") );
                c.setNombre( resultado.getString("nombre") );
                c.setDisponibilidad( resultado.getString("disponibilidad") );
                c.setPrioridad( resultado.getString("prioridad") );
                
                salida.add(c);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ComandaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return salida;
        
    }
     
      public Integer save( Comandas c){
        
        try( PreparedStatement ps = con.prepareStatement(INSERT_QUERY,RETURN_GENERATED_KEYS)){
            ps.setString(1, c.getNombre() );
            ps.setString(2, c.getDisponibilidad() );
            ps.setString(3, c.getPrioridad() );
            ps.executeUpdate();
            
            ResultSet keys = ps.getGeneratedKeys();
            if(keys.next()){
                return keys.getInt(1);
            }else{
                return null;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ComandaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    
    } 
      
     public Comandas get( Integer id ) {
        try( PreparedStatement ps = con.prepareStatement(GET_QUERY)){
            
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                Comandas c = new Comandas();
                c.setId( rs.getInt("id") );
                c.setNombre( rs.getString("nombre") );
                c.setDisponibilidad( rs.getString("responsable") );
                c.setPrioridad( rs.getString("prioridad") ); 
                
                return c;
            }else {
                return null;
            }
           
             
            
           
        } catch (SQLException ex) {
            Logger.getLogger(ComandaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
       
    }
}
