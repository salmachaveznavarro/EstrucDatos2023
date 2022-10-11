
package com.mycompany.nodo;

/**
 *
 * @author salmachaveznavarro
 * @param <T>
 */

public class LinkedList<T> extends Nodo<T>{
    Nodo<T> head;
    int tamanio= 0;
    public LinkedList() {
   
    }
    public boolean esta_vacia(){
        if (get_tamanio()== 0){
            System.out.println("Está vacio");
            return true;
        }else{
        System.out.println("No está vacio");
            return false;
        } 
        
    }
    public int get_tamanio(){
        while (getSiguiente() != null){
            tamanio++;
        }
        return tamanio;
    }
    public void agregar_al_final(T valor){
        if (this.head == null){
        head= new Nodo<> (valor);
        }else{
        Nodo<T> nuevo = new Nodo(valor);
        Nodo<T> aux = this.head;
        while (aux.getSiguiente() != null){
            aux=aux.getSiguiente();
        }
        aux.setSiguiente(nuevo);
        }
    }
    public void agregar_al_inicio(T valor){
        if(head== null){
            head = new Nodo(valor);
        }else{
            Nodo<T> nuevo = new Nodo(valor);
            nuevo.setSiguiente(head);
            head= nuevo;
        }
    }
    public void agregar_despues_de(T referencia,T valor){
        while (getDato() != referencia){
            getSiguiente();
        }
        head.getSiguiente().setDato(valor);
    }
    public void Eliminar(int posicion){
        int i= 0;
        while (i != (posicion-1)){
            head.getSiguiente();
            i++;
        }
        setDato(null);
    }
    public void Eliminar_el_primero(){
        head= new Nodo<>(null);
    }
    public void Eliminar_el_final(){
        if (this.head != null){
        Nodo<T> aux = this.head;
        while (aux.getSiguiente() != null){
            aux=aux.getSiguiente();
        }
        aux.setSiguiente(null);
        }
    }
    public int buscar(T valor){
        int posicion= 0;
        while (getDato() != valor){
            getSiguiente();
            posicion++;
        }
        return posicion;
    }
    
    public void actualizar(T a_buscar, T valor ){
        if ((buscar(a_buscar)) < 0){
            return;
        }
        Nodo<T> recorrido = head;
        while(recorrido != null && recorrido.getDato() != a_buscar){
            recorrido = recorrido.getSiguiente();
        }
        if(recorrido.getDato() == a_buscar) {
        } else {
            recorrido.setDato(valor);
        }
    }
    public void transversal(){
        Nodo<T> aux = head;
        while (aux != null) {
            System.out.print(aux);
            aux = aux.getSiguiente();
        }
    }
}
