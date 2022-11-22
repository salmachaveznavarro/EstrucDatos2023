package com.mycompany.colasadt;


import java.util.ArrayList;


/**
 *
 * @author salmachaveznavarro
 * @param <T>
 */
public class BoundedPriorityQueue <T> extends Cola<T>{
    ArrayList<T> ColadePrioridad;
    Cola<T> Colainterna;
    T sacado;
    public BoundedPriorityQueue(){
        super.dequeue();
        super.is_empty();
        super.length();
        Colainterna = new Cola<>();
        ColadePrioridad = new ArrayList<>();
        for (int i = 0; i<6; i++){
            ColadePrioridad.add((T) Colainterna);
        }
    }
    public void enqueue(int prioridad, T elemento){
        ColadePrioridad.add(prioridad, elemento);
    }
    public void dequeueBPQ(){
        ColadePrioridad.remove(sacado);
        T sacadointerno= ColadePrioridad.get(0);
        sacadointerno.dequeue();
    }
}