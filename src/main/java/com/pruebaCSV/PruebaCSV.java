package com.pruebaCSV;


/* EJEMPLO DE ACCESO A UN ARCHIVO .CSV DESDE JAVA
   NO UTILIZA NINGÚN GESTOR DE DEPENDENCIAS
*/

public class PruebaCSV {
    /**
     * @author Celia Chao
     */
    public static void main(String[] args) {
        LectorCSV miLector = new LectorCSV();
        miLector.leerCSV("./src/main/resources/datos/pokemon.csv");

    }
}
