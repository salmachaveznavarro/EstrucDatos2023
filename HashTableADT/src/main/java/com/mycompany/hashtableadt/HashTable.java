
package com.mycompany.hashtableadt;

import java.util.ArrayList;

/**
 *
 * @author salmachaveznavarro
 * @param <T>
 */
public class HashTable<T> {
    int posicion;
    ArrayList<T> tabla;
    int table_size;
    public HashTable(int table_size){
        tabla= new ArrayList(table_size);
    }
    public void add(int key, T value){
        posicion= key % table_size;
        tabla.add(posicion , value);
    }

    public T valueOf(int key){
        posicion= key % table_size;
        return tabla.get(posicion);
    }
    public void remove(int key){
        posicion= key % table_size;
        tabla.remove(posicion);
    }
    }

