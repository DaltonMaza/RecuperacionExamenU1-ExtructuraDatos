/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenu1.vista.utilidades;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import controlador.listas.ListaEnlazada;
import examenu1.modelo.Expresion;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

/**
 *
 * @author leomah
 */
public class Utilidades {
    public static void guardarJSON(ListaEnlazada<Expresion> expList){
        MapeoExpresiones mpex = new MapeoExpresiones();
        mpex.setExList(expList);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(mpex);
        try {
            FileWriter file = new FileWriter(new File("expresiones.json"));
            file.write(json);
            file.flush();
            file.close();
            JOptionPane.showMessageDialog(null, "Guardado exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar");
            System.out.println(e);
        }
    }
    
    public static MapeoExpresiones cargarJSON() throws IOException{
        MapeoExpresiones mpex = new MapeoExpresiones();
        Gson gson = new Gson();
        Reader lector = Files.newBufferedReader(Paths.get("expresiones.json"));
        mpex = gson.fromJson(lector, MapeoExpresiones.class);
        return mpex;
    }
}
