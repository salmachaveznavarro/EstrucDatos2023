
package com.mycompany.ejemplohashmap;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author salmachaveznavarro
 * 
 */
public class HashMapTienda {
    HashMap <String,Double> productos;
    public HashMapTienda(){
    }
    public void nuevoProducto(String codigo, double precio){
        productos.putIfAbsent(codigo, precio);
        System.out.println("Producto agregado: "+ codigo);
    }
    public void eliminarProducto(String codigo){
        productos.remove(codigo);
    }
    
    public void mostrarProductos() {
        String clave;
        Iterator<String> Productos;
        Productos = (Iterator<String>) productos.keySet().iterator();
        System.out.println("Hay los siguientes productos:");
        while(Productos.hasNext()){
        clave = Productos.next();
        System.out.println(clave + " --> $"+ productos.get(clave));
    
}
}
}
