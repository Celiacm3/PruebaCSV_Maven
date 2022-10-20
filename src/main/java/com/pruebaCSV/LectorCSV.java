package com.pruebaCSV;

import com.opencsv.CSVReader;
import java.io.FileReader;

/*
Esta clase se encarga de leer el archivo .csv que se le pase como parámetro.
No devuelve nada,si no que muestra el contenido del csv por terminal
 */
public class LectorCSV {
    /**
     * @author Celia Chao
     */
    public void leerCSV(String nombreArchivo){
        try{
            CSVReader csvReader = new CSVReader(new FileReader(nombreArchivo));
            String[] fila;
            while((fila = csvReader.readNext()) != null){
                System.out.printf(fila[0] + " | " +
                                  fila[1] + " | " +
                                  fila[2] + " | ");
            }
            csvReader.close();

        }catch(Exception e){
            System.out.printf(e.getMessage());
        }
    }
}
