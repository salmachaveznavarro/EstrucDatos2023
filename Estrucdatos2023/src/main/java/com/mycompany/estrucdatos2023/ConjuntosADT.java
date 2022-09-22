
package com.mycompany.estrucdatos2023;

/**
 *
 * @author salmachaveznavarro
 */
import java.util.ArrayList;
import java.util.Iterator;

public class ConjuntosADT<T> {      
    ArrayList<T> conjunto= new ArrayList<>();
    ArrayList<T> conjunto2= new ArrayList<>();
    public void ConjuntosADT(String[] args){

    }
    public int longitud(){
         return conjunto.size();
    }
    public boolean contiene(T elemento){
        return conjunto.contains(elemento);
    }
    public void agregar(T elemento){
       conjunto.add(elemento); 
    }
    public void eliminar(T elemento){
        conjunto.remove(elemento);
    }
    public boolean equals(T conjunto, T conjunto2){
        if(longitud() != conjunto2.size()) {
            return false;
        }
        for(int i = 0; i < longitud(); i++) {
            if(!conjunto2.contains(conjunto.get(i))) {
                return false;
            }
        }
        return true;
    }
    public void union(T conjunto2){
        for(int i = 0; i < conjunto2.size(); i++) {
            conjunto.add(conjunto2.get(i));
        }
    }
    public ConjuntosADT<T> interseccion(ConjuntosADT<T> conjunto2){
        ConjuntosADT<T> resultado = new ConjuntosADT();
        for(int i = 0; i < conjunto.size(); i++) {
            if(conjunto2.contiene(conjunto.get(i))) {
                resultado.agregar(conjunto.get(i));
            }
        }
        return resultado;
    }
    public ConjuntosADT<T> diferencia(ConjuntosADT<T> conjunto2){
                ConjuntosADT<T> resultado = new ConjuntosADT();
                for(int i = 0; i < conjunto.size(); i++) {
                if(!conjunto2.contiene(conjunto.get(i))) {
                resultado.agregar(conjunto.get(i));
                }
            }
                for(int i = 0; i < (conjunto2.size()); i++) {
                if(!contiene(conjunto2.conjunto.get(i))) {
                    resultado.agregar(conjunto2.conjunto.get(i));
                }
            }
        return resultado;
    }
    @Override
    public String toString() {
        return conjunto.toString();
    }
    public int iterator(){
        Iterator<T> iter;
        iter = conjunto.iterator();
        int num;
        while (iter.hasNext()){
            num = (int) iter.next();
            System.out.println(num);
        }
    }

}
