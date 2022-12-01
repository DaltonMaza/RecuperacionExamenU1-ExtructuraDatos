/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenu1.vista.ModeloTabla;

import controlador.listas.ListaEnlazada;
import examenu1.modelo.Expresion;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author leomah
 */
public class ModeloTablaExpresiones extends AbstractTableModel{
    private ListaEnlazada<Expresion> lista = new ListaEnlazada<>();

    public ListaEnlazada<Expresion> getLista() {
        return lista;
    }

    public void setLista(ListaEnlazada<Expresion> lista) {
        this.lista = lista;
    }
            
       

    @Override
    public int getRowCount() {
        return lista.getTamanio();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Expresion e = null;
        try {
            e = lista.obtener(rowIndex);
        } catch (Exception ex) {
        }
        switch (columnIndex) {
            case 0: return (rowIndex + 1);
            case 1: return (e != null) ? e.getExpresion() : "No definido";
            case 2: return (e != null) ? e.getEsCorrecta() : "No definido";
            default: return null;
        }
    }
    
    @Override
    public String getColumnName(int column){
        switch (column) {
            case 0: return "ID";
            case 1: return "Expresion";
            case 2: return "Es correcta";
            default: return null;
        }
    }
}
