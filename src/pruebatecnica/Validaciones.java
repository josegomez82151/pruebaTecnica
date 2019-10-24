
package pruebatecnica;


public class Validaciones {
    
    public static boolean validarLinea(String linea) {
        Boolean valido = true;
        int i, digito;                
        
        //Se valida si es la linea de salida
        if (!linea.equals("0,0")) {
            String[] cadena = linea.split(",");
            //Se valida que solo haya una coma en la linea de entrada
            if (cadena.length != 2) {                
                valido = false;
                System.out.println("Error, la cadena ingresada tiene argumentos inválidos");
            } else {
                //Se valida que el tamaño y los dígitos sea de tipo entero
                try {
                    int size = Integer.parseInt(cadena[0]);
                    if (size < 1 || size > 10) {
                        System.out.println("Error, el tamaño debe ser mayor a 1 y menor a 10 ");
                        valido = false;
                    } else {
                        for (i = 0; i < (cadena[1].length()); i++) {
                            digito = Integer.parseInt(String.valueOf(cadena[1].charAt(i)));
                        }
                    }
                } catch (Exception e) {
                    valido = false;
                    System.out.println("El tamaño o los digitos ingresados no son válidos");
                }
            }
        }
        return valido;
    }

    

    
}
