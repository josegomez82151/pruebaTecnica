
package pruebatecnica;

import java.util.ArrayList;
import java.util.List;

public class Digitos {
 
    private int fila, col, tam;

    //Constructor
    public Digitos(int tam) {
        this.tam = tam;
        fila = 2*tam + 3;
        col = tam+2;
    }
    
    //Getter and Setter
    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;       
        fila = 2*tam + 3;
        col = tam+2;
    }
    
    //Metodo que devuelve en un arreglo de matrices cada uno de los digitos ingresados
    public List<String[][]> obtenerDigitos(String numeros){       
        List<String[][]> lista = new ArrayList<>();
        for(int i = 0; i < numeros.length(); i++){
            lista.add(obtenerNumero(String.valueOf(numeros.charAt(i))));
        }      
        return lista;
    }
    
    //Método utilizado para seleccionar un digito en específico
    private String[][] obtenerNumero(String num){               
        int n = Integer.parseInt(num);
        switch (n) {
            case 1:
                return obtenerUno();            
            case 2:
                return obtenerDos();            
            case 3:
                return obtenerTres();
            case 4:
                return obtenerCuatro();
            case 5:
                return obtenerCinco();
            case 6:
                return obtenerSeis();
            case 7:
                return obtenerSiete();
            case 8:
                return obtenerOcho();
            case 9:
                return obtenerNueve();
            case 0:
                return obtenerCero();
            default:
                return null;

        }
        
    }
    
    //Conjunto de métodos para construir la matriz de cada dígito
    public String[][] obtenerCero(){        
        String[][] salida = new String[fila][col];
        int pos = 1;
        //Primer segmento
        salida[0] = llenarHorizontal();
        
        //Segundo segmento
        for(int i = 0; i < tam; i++){           
            salida[pos + i] = llenarVerticales();            
        }
        pos = pos + tam;
        salida[pos] = vaciar();
        pos ++;
        
        //Tercer segmento
        for(int i = 0; i < tam; i++){            
            salida[pos + i] = llenarVerticales();            
        }
        
        //Cuarto segmento
        salida[pos + tam] = llenarHorizontal();
       
        return salida;
    }
    
    private String[][] obtenerUno(){
        String[][] salida = new String[fila][col];
        int pos = 1;
        salida[0] = vaciar();
        
        for(int i = 0; i < tam; i++){           
            salida[pos + i] = verticalDerecha();
        }
        pos = pos + tam;
        salida[pos] = salida[0];
        pos++;

        for (int i = 0; i < tam; i++) {
            salida[pos + i] = verticalDerecha();          
        }        
        salida[pos + tam] = salida[0];

        return salida;
    }
    
    private String[][] obtenerDos(){
        String[][] salida = new String[fila][col];
        int pos = 1;
        salida[0] = llenarHorizontal();
        
       for(int i = 0; i < tam; i++){           
            salida[pos + i] = verticalDerecha();
        }
        pos = pos + tam;
        salida[pos] = salida[0];
        pos ++;
        
        for(int i = 0; i < tam; i++){           
            salida[pos + i] = verticalIzquierda();                        
        }
        
        salida[pos + tam] = salida[0];
       
        return salida;
    }
    
    private String[][] obtenerTres(){
        String[][] salida = new String[fila][col];
        int pos = 1;
        salida[0] = llenarHorizontal();
        
       for(int i = 0; i < tam; i++){           
            salida[pos + i] = verticalDerecha();
        }
        pos = pos + tam;
        salida[pos] = salida[0];
        pos ++;
        
        for(int i = 0; i < tam; i++){           
            salida[pos + i] = verticalDerecha();                        
        }
        
        salida[pos + tam] = salida[0];
       
        return salida;
    }
    
    private String[][] obtenerCuatro(){
        String[][] salida = new String[fila][col];
        int pos = 1;
        salida[0] = vaciar();
        
       for(int i = 0; i < tam; i++){           
            salida[pos + i] = llenarVerticales();
        }
        pos = pos + tam;
        salida[pos] = llenarHorizontal();
        pos ++;
        
        for(int i = 0; i < tam; i++){           
            salida[pos + i] = verticalDerecha();                        
        }
        
        salida[pos + tam] = salida[0];
       
        return salida;
    }
    
    private String[][] obtenerCinco(){
        String[][] salida = new String[fila][col];
        int pos = 1;
        salida[0] = llenarHorizontal();
        
       for(int i = 0; i < tam; i++){           
            salida[pos + i] = verticalIzquierda();
        }
        pos = pos + tam;
        salida[pos] = salida[0];
        pos ++;
        
        for(int i = 0; i < tam; i++){           
            salida[pos + i] = verticalDerecha();                        
        }
        
        salida[pos + tam] = salida[0];
       
        return salida;
    }
    
    private String[][] obtenerSeis(){
        String[][] salida = new String[fila][col];
        int pos = 1;
        salida[0] = llenarHorizontal();
        
       for(int i = 0; i < tam; i++){           
            salida[pos + i] = verticalIzquierda();
        }
        pos = pos + tam;
        salida[pos] = salida[0];
        pos ++;
        
        for(int i = 0; i < tam; i++){           
            salida[pos + i] = llenarVerticales();                        
        }
        
        salida[pos + tam] = salida[0];
       
        return salida;
    }
    
    private String[][] obtenerSiete(){
        String[][] salida = new String[fila][col];
        int pos = 1;
        salida[0] = llenarHorizontal();
        
       for(int i = 0; i < tam; i++){           
            salida[pos + i] = verticalDerecha();
        }
        pos = pos + tam;
        salida[pos] = vaciar();
        pos ++;
        
        for(int i = 0; i < tam; i++){           
            salida[pos + i] = verticalDerecha();                        
        }
        
        salida[pos + tam] = vaciar();
       
        return salida;
    }
    
    private String[][] obtenerOcho(){        
        String[][] salida = new String[fila][col];
        int pos = 1;
        salida[0] = llenarHorizontal();
        
        for(int i = 0; i < tam; i++){           
            salida[pos + i] = llenarVerticales();            
        }
        pos = pos + tam;
        salida[pos] = salida[0] ;
        pos ++;
        
        for(int i = 0; i < tam; i++){            
            salida[pos + i] = llenarVerticales();            
        }        
        salida[pos + tam] = salida[0];
       
        return salida;
    }
    
    private String[][] obtenerNueve(){        
        String[][] salida = new String[fila][col];
        int pos = 1;
        salida[0] = llenarHorizontal();
        
        for(int i = 0; i < tam; i++){           
            salida[pos + i] = llenarVerticales();            
        }
        pos = pos + tam;
        salida[pos] = salida[0] ;
        pos ++;
        
        for(int i = 0; i < tam; i++){            
            salida[pos + i] = verticalDerecha();            
        }        
        salida[pos + tam] = salida[0];
       
        return salida;
    }
    
    //Conjunto de métodos para llenar cada segmento del dígito
    private String[] llenarHorizontal(){
        String[] cadena = new String[col];
        cadena[0] = " ";
        cadena[col -1] = " ";
        for (int i = 1; i < cadena.length -1 ; i++){
            cadena[i] = "-";
        }
        return cadena;
    }
    
    private String[] vaciar(){
        String[] cadena = new String[col];       
        for (int i = 0; i < cadena.length ; i++){
            cadena[i] = " ";
        }
        return cadena;
    }
    
    private String[] llenarVerticales (){
        String[] cadena = new String[col];
        cadena[0] = "|";
        cadena[col -1] = "|";
        for (int i = 1; i < cadena.length -1 ; i++){
            cadena[i] = " ";
        }
        return cadena;
    }
    
    private String[] verticalDerecha() {
        String[] cadena = vaciar();        
        cadena[col - 1] = "|";
        return cadena;
    }

    private String[] verticalIzquierda() {
        String[] cadena = vaciar();        
        cadena[0] = "|";
        return cadena;
    }        

    
}
