
package pruebatecnica;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
        
public class PruebaTecnica {

    //Método principal de la clase
    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        String linea;       
        System.out.println("Ingrese la linea con el tamaño y los numeros a imprimir (cada argumento debe estar searado por una coma):");
        System.out.println("Para finalizar la entrada de datos ingrese '0,0'");        
        do {
            
            Scanner entrada = new Scanner(System.in);
            linea = entrada.nextLine();
                        
            if(Validaciones.validarLinea(linea)){
                if(!linea.equals("0,0")){
                    data.add(linea);
                }                
            }            
        } while(!linea.equals("0,0"));                
        new MostrarSalida().MostrarDigitos(data);                
    }        
}
