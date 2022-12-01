/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenu1.modelo;

/**
 *
 * @author leomah
 */
public class Expresion {
    private String expresion;
    private Boolean esCorrecta;

    public Expresion() {
    }

    public Expresion(String expresion, Boolean esCorrecta) {
        this.expresion = expresion;
        this.esCorrecta = esCorrecta;
    }
    
    

    public String getExpresion() {
        return expresion;
    }

    public void setExpresion(String expresion) {
        this.expresion = expresion;
    }

    public Boolean getEsCorrecta() {
        return esCorrecta;
    }

    public void setEsCorrecta(Boolean esCorrecta) {
        this.esCorrecta = esCorrecta;
    }

    @Override
    public String toString() {
        return "Expresion{" + "expresion=" + expresion + ", esCorrecta=" + esCorrecta + '}';
    }
    
    
}
