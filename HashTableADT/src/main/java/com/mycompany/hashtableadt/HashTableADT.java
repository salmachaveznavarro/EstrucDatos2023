

package com.mycompany.hashtableadt;

/**
 *
 * @author salmachaveznavarro
 */
public class HashTableADT {

    public static void main(String[] args) {
        HashTable<String> tabla = new HashTable<>(6);
        // Funcion add
        tabla.add(60,"Anciano");
        tabla.add(80, "muy Anciano");
        tabla.add(10, "niño");
        tabla.add(25, "joven");
        tabla.add(2, "bebe");
        
        // Funcion valueOf
        tabla.valueOf(60);
        tabla.valueOf(80);
        tabla.valueOf(25);
        
        // Funcion remove
        tabla.remove(60);
        tabla.remove(2);
        tabla.remove(10);
    }
}
