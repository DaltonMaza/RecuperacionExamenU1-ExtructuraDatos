package controlador.listas.pilas;

import controlador.listas.Exepciones.ListaVaciaException;
import controlador.listas.Exepciones.PosicionNoEncontradaException;
import controlador.listas.ListaEnlazada;
import controlador.listas.pilas.Exceptions.PilaLlenaException;
import controlador.listas.pilas.Exceptions.PilaVaciaException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pila<E> extends ListaEnlazada<E>{
    private Integer tope;

    public Pila(Integer tope) {
        this.tope = tope;
    }
    
    public Boolean estaLlena(){
        return tope == getTamanio(); 
    }
        
    public void push(E dato) throws PilaLlenaException{
        if(!estaLlena()){
            insertar(dato);
        }else{
            throw new PilaLlenaException();
        }
    }
    
    public E pop () throws PilaVaciaException, ListaVaciaException, PosicionNoEncontradaException{
        if(!estaVacia()){
            E dato = eliminarPosicion(obtenerUltimaPos());
            return dato;
        }else{
            throw new PilaVaciaException();
        }
    }
    
    public Integer obtenerUltimaPos() throws ListaVaciaException, PosicionNoEncontradaException{
        int ultimaPos = 0;
        for (int i = 0; i < getTamanio(); i++) {
            if (obtener(i) == null) {
                break;
            }else{
                ultimaPos = i;
            }
        }
        return ultimaPos;
    }
    
    
    
    //todo eliminar por poscición

    public Integer getTope() {
        return tope;
    }

    public void setTope(Integer tope) {
        this.tope = tope;
    }
}
