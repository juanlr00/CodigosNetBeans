/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.comandasinterfaz;

import models.Carta;
import models.Pedido;

/**
 *
 * @author JuanLamasRubio
 */
public class SessionData {
    private static Pedido pedidoActual;
    private static Carta cartaActual;

    public static Pedido getPedidoActual() {
        return pedidoActual;
    }

    public static void setPedidoActual(Pedido pedidoActual) {
        SessionData.pedidoActual = pedidoActual;
    }

    public static Carta getCartaActual() {
        return cartaActual;
    }

    public static void setCartaActual(Carta cartaActual) {
        SessionData.cartaActual = cartaActual;
    }
    
    
}
