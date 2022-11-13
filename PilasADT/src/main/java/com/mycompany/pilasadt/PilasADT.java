
package com.mycompany.pilasadt;

/**
 *
 * @author salmachaveznavarro
 * @param <T>
 */
public class PilasADT {

    public static void main(String[] args) {
       Pilas<String> pila = new Pilas<>();
       //isEmpty
       pila.isEmpty();
       // push
       pila.push("Salma");
       pila.push("Jorge");
       pila.push("Cassandra");
       pila.push("Carolina");
       // peek
       pila.peek();
       //pop
       pila.pop();
       //getLength
       pila.getLength();
       //toString
       pila.toString();
    }
}
