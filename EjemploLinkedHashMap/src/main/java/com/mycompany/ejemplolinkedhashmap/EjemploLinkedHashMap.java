
package com.mycompany.ejemplolinkedhashmap;
/**
 *
 * @author salmachaveznavarro
 */
public class EjemploLinkedHashMap {

    public static void main(String[] args) {
        LinkedHashMapRegistro pacientes;
        pacientes= new LinkedHashMapRegistro(30);
         
        /* 
        EN ESTE CASO, UN DOCTOR QUIERE REALIZAR UN REGISTRO DE 
        ANONIMO DE LA ALTURA DE 30 DE SUS PACIENTES JUNTO CON 
        SU PESO ALTURA ES EL PRIMER VALOR, EL PESO EL SEGUNDO
        */
        pacientes.AgregarPaciente(1.53,48);
        pacientes.AgregarPaciente(1.67, 65);
        pacientes.AgregarPaciente(1.80, 75);
        pacientes.AgregarPaciente(1.90, 100);
        pacientes.AgregarPaciente(1.94, 80);
        
        // AHORA EL DOCTOR QUIERE VER LAS ALTURAS DE SUS PACIENTES
        pacientes.MostrarAlturas();
        
        // Y SUS PESOS
        pacientes.MostrarPesos();
        
        
    }
}
