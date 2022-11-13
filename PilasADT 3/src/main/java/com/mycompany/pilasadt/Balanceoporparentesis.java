
package com.mycompany.pilasadt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author salmachaveznavarro
 * @param <T>
 */
public class Balanceoporparentesis {
    static int lineastotales;
    String parentesisA = "(";
    String parentesisC = ")";
    Pilas<String> pila = new Pilas<>();
    
    public void main(String[] args) {
       File archivo1 = new File("texto1.txt");
       File archivo2 = new File("texto2.txt");
       buscarPalabra(archivo1, parentesisA, parentesisC);
       buscarPalabra(archivo2, parentesisA, parentesisC);
       
    }
    public void buscarPalabra(File archivo, String parentesisA, String parentesisC) {
        try{
            if (archivo.exists()){
                BufferedReader leerArchivo = new BufferedReader(new FileReader(archivo));
                String linealeida;
                while((linealeida = leerArchivo.readLine())!= null){
                    lineastotales ++;
                    String [] palabras = linealeida.split(" ");
                    for (String palabra : palabras) {
                        if (palabra.equals(parentesisA)) {
                            pila.push("PARENTESIS");
                        } else if (palabra.equals(parentesisC)) {
                            pila.pop();                     
                        }
                    }
                    if (pila.getLength()== 0){
                        System.out.println("Su código está balanceado");
                    }else{
                        System.out.println("Su codigo tiene errores en el balanceo de paréntesis");
                    }
                }
            }
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
    }

