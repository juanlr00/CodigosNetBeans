/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hibernatecrud;

import models.Carta;
import models.Pedido;
/**
 *
 * @author JuanLamasRubio
 */
public class SessionData {
     private static Carta cartaActual;
     private static Pedido pedidoActual;

    public static Pedido getPedidoActual() {
        return pedidoActual;
    }

    public static void setPedidoActual(Pedido pedidoActual) {
        SessionData.pedidoActual = pedidoActual;
    }
    public static Carta getCartaActual() {
        return cartaActual;
    }

    public static void setCartaActual(Carta carta_actual) {
        SessionData.cartaActual = carta_actual;
    }    
}