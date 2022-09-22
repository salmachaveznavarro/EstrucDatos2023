

package com.mycompany.estrucdatos2023;

/**
 *
 * @author salmachaveznavarro
 */
public class Estrucdatos2023 {

    public static void main(String[] args) {
    System.out.println("Chavez Navarro Salma\n 1310\n Tarea 4:Conjuntos");
        ConjuntosADT<> conjunto;
        conjunto = new ConjuntosADT();
        ConjuntosADT<> conjunto2;
        conjunto2 = new ConjuntosADT();
    //agregar   
        conjunto.agregar(9);
        conjunto.agregar(6);
        conjunto.agregar(1);
        conjunto.agregar(7);
        conjunto.agregar(2);
        conjunto.agregar(0);
        conjunto.agregar(4);
        conjunto.agregar(3);
        
        conjunto2.agregar(8);
        conjunto2.agregar(79);
        conjunto2.agregar(1);
        conjunto2.agregar(22);
        conjunto2.agregar(56);
        conjunto2.agregar(900);
        conjunto2.agregar(81);
        conjunto2.agregar(3);
    //longitud
    System.out.println("Longitud: "+ conjunto.longitud());
    //contiene
    System.out.println("Contiene"+ conjunto.contiene(3));
    //eliminar
    conjunto.eliminar(2);
    //equals
    conjunto.equals(conjunto, conjunto2);
    //union
    conjunto.union(conjunto2);
    //interseccion
    conjunto.interseccion(conjunto2);
    //diferencia
    conjunto.diferencia(conjunto2);
    
    }
}