
package com.mycompany.pilasadt;

import java.util.ArrayList;

/**
 *
 * @author salmachaveznavarro
 * @param <T>
 */

public class Pilas<T> {
    
    ArrayList<T> datos;
    int tope= datos.size()-1;
    T sacado;
    
    public Pilas(){
        datos = new ArrayList<>();
        
    }
    public boolean isEmpty(){
        return datos.isEmpty();
    }
    public int getLength(){
        return datos.size();
    }
    public T pop(){
    sacado = datos.remove(tope);
    tope--;
    return sacado;
    }
    public T peek(){
        return datos.get(tope);
    }
    public void push(T dato){
        datos.add(dato);
        tope = datos.size()-1;
    }
    @Override
    public String toString(){
    String edo = "";
    for (T dato: datos){
        edo+= dato;
    }
    return edo;
    }
    
}
