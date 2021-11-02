/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fxmlLogin;

import models.Usuario;
import com.mycompany.fxmlLogin.SessionData;
import models.Tarea;
/**
 *
 * @author JuanLamasRubio
 */
public class SessionData {
     private static Usuario usuarioActual;
     private static Tarea tareaActual;

    public static Tarea getTareaActual() {
        return tareaActual;
    }

    public static void setTareaActual(Tarea tareaActual) {
        SessionData.tareaActual = tareaActual;
    }
    public static Usuario getUsuarioActual() {
        return usuarioActual;
    }

    public static void setUsuarioActual(Usuario usuario_actual) {
        SessionData.usuarioActual = usuario_actual;
    }    
}
