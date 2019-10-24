
package pruebatecnica;

import java.util.ArrayList;
import java.util.List;


public class MostrarSalida {
    Digitos d;
    
    //Método principal de la clase
    public void MostrarDigitos(List<String> data) {
        d = new Digitos(0);
        List<String[][]> matriz = new ArrayList<>();
        String[][] mostrarFinal;
        for (int i = 0; i < data.size(); i++) {
            String[] argumentos = data.get(i).split(",");
            d.setTam(Integer.parseInt(argumentos[0]));
            matriz = d.obtenerDigitos(argumentos[1]);
            mostrarFinal = formatoMatriz(matriz);
            mostrar(mostrarFinal);
        }

        
    }
    
    //Método que constuye una matriz en la cual es cada fila estrán los caracteres a mostrar posteriormente
    private String[][] formatoMatriz(List<String[][]> matriz){
        String[][] mostrarFinal = new String[matriz.size()][];
        for(int i = 0; i < matriz.size(); i++){
           mostrarFinal[i] = concatenar(matriz.get(i));
        }   
        return mostrarFinal;
    }
    
    //Método que concatena cada los caraceres de un segmento de dígito
    private String[] concatenar(String[][] data){
        String[] cadena = new String[data.length];
        String concatenado;
        for (int i = 0; i < data.length; i++) {
            concatenado = "";
            for (int j = 0; j < data[i].length; j++) {
                concatenado = concatenado + data[i][j];
            }
            cadena[i] = concatenado;
        }

        return cadena;
    }
    
    //Método que muestra la matriz
    private void mostrar(String[][] data) {

        for (int j = 0; j < data[0].length; j++) {
            
            for (int i = 0; i < data.length; i++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
