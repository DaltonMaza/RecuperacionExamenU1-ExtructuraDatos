/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenu1.vista.utilidades;

import controlador.listas.ListaEnlazada;
import examenu1.modelo.Expresion;

/**
 *
 * @author leomah
 */
public class MapeoExpresiones {
    private ListaEnlazada<Expresion> exList = new ListaEnlazada<>();

    public ListaEnlazada<Expresion> getExList() {
        return exList;
    }

    public void setExList(ListaEnlazada<Expresion> exList) {
        this.exList = exList;
    }
    
    
}
