

package com.mycompany.colasadt;

/**
 *
 * @author salmachaveznavarro
 * @param <T>
 */
public class ColasADT {

    public static void main(String[] args) {
        BoundedPriorityQueue<String> Barco = new BoundedPriorityQueue<>(6);
        Barco.is_empty();
        
        Barco.length();
        
        Barco.enqueue(1, "Niñas");
        Barco.enqueue(2, "Niños");
        Barco.enqueue(2, "3era edad");
        Barco.enqueue(3, "Mujeres");
        Barco.enqueue(3, "Hombres");
        Barco.enqueue(4, "Maestre");
        Barco.enqueue(4, "Mecanico");
        Barco.enqueue(4,"Vigia");
        Barco.enqueue(4, "Tibonel");
        Barco.enqueue(5, "Capitan");
        
        Barco.dequeueBPQ();
        Barco.dequeueBPQ();
        Barco.dequeueBPQ();
        Barco.dequeueBPQ();
        Barco.dequeueBPQ();
        Barco.dequeueBPQ();
        Barco.dequeueBPQ();
        Barco.dequeueBPQ();
        Barco.dequeueBPQ();
        Barco.dequeueBPQ();

        Barco.toString();
    }
}
