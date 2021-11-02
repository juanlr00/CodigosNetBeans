/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplofilereader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JuanLamasRubio
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
 

    public static void main(String[] args){
    
        File f = new File("pom.xml");
    
        try(FileReader fr = new FileReader(f);
        
                FileWriter fw = new FileWriter("pom.xml.bak")){

                int i;
    
                while( (i=fr.read() ) >-1){
                    System.out.println(i);
        
                    fw.write(i);
            }
        }
        
        catch (FileNotFoundException ex) {
        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        
        } 
        
        catch (IOException ex) {
        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        
        }
        
       /** System.out.println("\n\nLeyendo con bufferedReader\n\n");
        
        try( BufferedReader br = new BufferedReader( new FileReader(f)) ) {
            
            String s;
            Integer linea = 0;
            
            
             while((s=br.readLine())!=null) {
                 System.out.println("["+(linea++)+":"+s.length()+"] ");
                 
                 Integer aes=0;
                 
                 for (int i=0;i<s.length();i++) {
                     if( ( s.charAt(i) == 'a') || (s.charAt(i) == 'A')) {
                         aes++;
                     }
                 }
                 System.out.println(aes+" ");
                 
                 System.out.println(s);
             }
            
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
      System.out.println("\n\nLEYENDO CON Lines\n\n");

        try(BufferedReader br = new BufferedReader(new FileReader(f));
        BufferedWriter bw = new BufferedWriter(new FileWriter("pom.xml.bak2"))){

        Iterator<String> it = br.lines().iterator();

        while(it.hasNext()){
        String s = it.next();
            s.replace('e', 'a');
            s.replace('/', '\\');
                
                System.out.println(s);
                
                String[] palabras = s.split(" ");
                
                for(String ss: palabras) {
                    System.out.println(" -->"+ss);
                }
                System.out.println(" ");
                
        bw.write(s);
        bw.newLine();
        
        
}

/* List<String> cadenas = br.lines().toList();
for(String s: cadenas){
System.out.println(s); // LE GUSTA MAS ARRIBA(Iterador)
}
System.out.println(br.lines().count());*/
} catch (IOException ex) {
Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
}
    }
}