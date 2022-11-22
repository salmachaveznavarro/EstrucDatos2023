
package com.mycompany.colasadt;

import java.util.ArrayList;

/**
 *
 * @author salmachaveznavarro
 * @param <T>
 */
public class Cola<T> {
    ArrayList<T> cola;
    
    public Cola(){
        cola = new ArrayList<>();
    }
    public boolean is_empty(){
        return cola.isEmpty();
    }
    public int length(){
        return cola.size();
    }
    public void enqueue (T element){
        cola.add(element);
    }
    public T dequeue(){
        T eliminado = cola.get(cola.size());
        cola.remove(cola.size());
        return eliminado;
    }
    @Override
    public String toString(){
    String edo = "";
    for (T dato: cola){
        edo+= dato;
    }
    return edo;
    }
}
