
package com.mycompany.ejemploclasefile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JuanLamasRubio
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
   /** public static void main(String[] args) throws FileNotFoundException, IOException {
        
     
            Logger.getLogger(NewMain.class.getName()).info("Iniciando programa");
             * 
             * File carpetaactual = new File(".");
             * 
             * File contenido[] = carpetaactual.listFiles();
             * 
             * for( File f : contenido) {
             * if( f.isDirectory()) {
             * System.out.println("[D] ");
             * }
             * System.out.println(f.getName());
             * System.out.println( " ("+f.length() + "bytes)");
             * }
             * 
             * File nuevacarpeta = new File("pepe");
             * nuevacarpeta.mkdir();
             * 
             * //Crear fichero
             * File f = new File("readme.txt");
             * 
             * if( f.exists()) {
             * System.out.println("El fichero existe");
             * System.out.println(f.length() );
             * System.out.println(f.getAbsolutePath());
             * } else {
             * System.out.println("El fichero no existe");
             * System.out.println(f.length() );
             * System.out.println(f.getAbsolutePath());
             * try {
             * f.createNewFile();
             * } catch (IOException ex) {
             * Logger.getLogger(NewMain.class.getName()).severe("Hubo un error"); //Para que el programa te loguee correctamente
             * }
             *
     * @param args}*/
          
 
            
        public static void main(String[] args) {
            
        Logger.getLogger(NewMain.class.getName()).info("Iniciando programa");
        
        try( FileInputStream fis = new FileInputStream("pon.xml")){
           
           FileOutputStream fos = new FileOutputStream("pomm.xml") {
                
           }
            int b;
            while( (b = fis.read()) != -1) {
                System.out.print( (char)b );
                fos.write(b+1);
            }
                        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
        
}

        
   
    

