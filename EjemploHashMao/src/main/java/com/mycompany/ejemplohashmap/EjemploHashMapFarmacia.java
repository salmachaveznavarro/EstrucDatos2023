
package com.mycompany.ejemplohashmap;


/**
 *
 * @author salmachaveznavarro
 */
public class EjemploHashMapFarmacia {

    public static void main(String[] args) {
        HashMapTienda Inventario = new HashMapTienda();
        
        // AGREGANDO EL IBUPROFENO,PARACETAMOL Y OMEPRAZOL
        Inventario.nuevoProducto("ibuprofeno 600 mg",92.0);
        Inventario.nuevoProducto("paracetamol 650 mg",25.0);
        Inventario.nuevoProducto("omeprazol 20 mg", 58.0);
        Inventario.nuevoProducto("metoclopramida 10 mg", 79.5);
        Inventario.nuevoProducto("metamizol sódico 500 mg", 37.0);
        
        // SE AGOTA EL IBUPROFENO Y EL OMEPRAZOL
        Inventario.eliminarProducto("ibuprofeno 600 mg");
        Inventario.eliminarProducto("omeprazol 20 mg");
        
        //AHORA QUEREMOS SABER NUESTRAS EXISTENCIAS PARA VOLVER A SURTIR
        Inventario.mostrarProductos();
        
    }
}
    

