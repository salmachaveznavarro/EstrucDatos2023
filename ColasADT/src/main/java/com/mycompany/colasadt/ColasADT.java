

package com.mycompany.colasadt;

/**
 *
 * @author salmachaveznavarro
 */
public class ColasADT {

    public static void main(String[] args) {
        Queue<String> cola = new Queue();
        cola.enqueue("hola");
        cola.enqueue("adios");
        cola.enqueue("buenos dias");
        cola.enqueue("buenas tardes");
        cola.enqueue("buenas noches");
        cola.dequeue();
        cola.dequeue();
        
             
    }
}
