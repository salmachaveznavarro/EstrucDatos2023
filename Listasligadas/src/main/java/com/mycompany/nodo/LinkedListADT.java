
package com.mycompany.nodo;

/**
 *
 * @author salmachaveznavarro
 * @param <T>
 */

public class LinkedListADT<T> {

    public static void main(String[] args) {
        LinkedList<Integer> head = new LinkedList();
        System.out.println(head.esta_vacia());
        
        System.out.println(head.get_tamanio());
        
        head.agregar_al_final(10);
        head.agregar_al_final(12);
        head.agregar_al_final(14);
        head.agregar_al_final(16);
        head.agregar_al_inicio(8);
        head.agregar_al_inicio(6);
        head.agregar_al_inicio(4);
        head.agregar_al_inicio(2);
        
        head.agregar_despues_de(16, 18);
        
        head.Eliminar(2);
        
        head.Eliminar_el_primero();
        
        head.Eliminar_el_final();
        
        head.buscar(12);
        
        head.actualizar(10, 16);
        
        head.transversal();
        
        
        
    }
}
