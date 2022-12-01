/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenu1.controlador;

import controlador.listas.Exepciones.ListaVaciaException;
import controlador.listas.Exepciones.PosicionNoEncontradaException;
import controlador.listas.pilas.Exceptions.PilaLlenaException;
import controlador.listas.pilas.Exceptions.PilaVaciaException;
import controlador.listas.pilas.Pila;
import examenu1.modelo.Expresion;

/**
 *
 * @author leomah
 */
public class ExpresionController {
    private Expresion expresion;

    public ExpresionController() {
        if (expresion == null) {
            this.expresion = new Expresion();
        }
    }

    public ExpresionController(Expresion expresion) {
        this.expresion = expresion;
    }
    
    
    
    public Boolean estaVacia(){
        Boolean estaVacia = true;
        if (!expresion.getExpresion().isEmpty()) {
            estaVacia = false;
        }
        return estaVacia;
    }
    
    public Boolean esCorrecta() throws PilaLlenaException, ListaVaciaException, PosicionNoEncontradaException, PilaVaciaException{
        Boolean esCorrecta = false;
        Pila pila = new Pila(obtenerTamanio());
        for (int i = 0; i < obtenerTamanio(); i++){
            if (expresion.getExpresion().charAt(i) == '(' || expresion.getExpresion().charAt(i) == ')'
                        || expresion.getExpresion().charAt(i) == '[' || expresion.getExpresion().charAt(i) == ']'
                        || expresion.getExpresion().charAt(i) == '{' || expresion.getExpresion().charAt(i) == '}'
                        || expresion.getExpresion().charAt(i) == '<' || expresion.getExpresion().charAt(i) == '>') {
                if (pila.estaVacia()) {
                    pila.push(expresion.getExpresion().charAt(i));    
                }else{
                    char dato = (char) pila.pop();
                    switch (dato) {
                        case '(':
                            if (expresion.getExpresion().charAt(i) != ')') {
                                pila.push(dato);
                                pila.push(expresion.getExpresion().charAt(i));
                            }
                            break;
                        case '{':
                            if (expresion.getExpresion().charAt(i) != '}') {
                                pila.push(dato);
                                pila.push(expresion.getExpresion().charAt(i));
                            }
                            break;
                        case '[':
                            if (expresion.getExpresion().charAt(i) != ']') {
                                pila.push(dato);
                                pila.push(expresion.getExpresion().charAt(i));
                            }
                            break;
                        case '<':
                            if (expresion.getExpresion().charAt(i) != '>') {
                                pila.push(dato);
                                pila.push(expresion.getExpresion().charAt(i));
                            }
                            break;
                        default:
                    }
                }
            }
        }
        
        if (pila.estaVacia()) {
            esCorrecta = true;
        }
        expresion.setEsCorrecta(esCorrecta);
        return esCorrecta;
    }
        
    public Integer obtenerTamanio(){
        Integer tamanio = 0;
        String nuevaExpresion = this.expresion.getExpresion();
        nuevaExpresion += " ";
        for (int i = 0; nuevaExpresion.charAt(i) != ' '; i++) {
            tamanio++;
        }
        return tamanio;
    }

    public Expresion getExpresion() {
        if (expresion == null) {
            this.expresion = new Expresion();
        }
        return expresion;
    }

    public void setExpresion(Expresion expresion) {
        this.expresion = expresion;
    }

    @Override
    public String toString() {
        return "ExpresionController{" + "expresion=" + expresion + '}';
    }
    
    
}
