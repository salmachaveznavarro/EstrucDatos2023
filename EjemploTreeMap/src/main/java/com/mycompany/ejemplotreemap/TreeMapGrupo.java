
package com.mycompany.ejemplotreemap;

import java.util.TreeMap;

/**
 *
 * @author salmachaveznavarro
 */
public class TreeMapGrupo {
    TreeMap<Integer, String> grupo = new TreeMap<>();
    
    public TreeMapGrupo(){
    }
    public void elMasJoven(){
        String menorEdad= grupo.get(grupo.firstKey());
        System.out.println("El alumno de menor edad es: " + menorEdad);
    }
    public void elMasViejo(){
        String mayorEdad= grupo.get(grupo.floorKey(grupo.size()));
        System.out.println("El alumno de mayor edad es: "+ mayorEdad);
    }
    public boolean checarCupo(){
        if (grupo.size() <30){
            int restantes = 30- grupo.size();
            System.out.println("Todavia hay "+ restantes + " lugares restantes.");
            return true;
        }else{
            System.out.println("Ya no hay lugares restantes.");
            return false;
        }
    }
    public void agregarAlumno(Integer edad, String nombre){
        
        if (((edad <80) & (15< edad))& (checarCupo()== true)){
            grupo.putIfAbsent(edad, nombre);
        }else if (edad < 15){
            System.out.println("Eres muy chico para entrar al grupo.");
        }else{
            System.out.println("Eres demasiado grande, ya jubilate.");
        }
    }
    public void eliminarAlumno(Integer edad ,String nombre){
        String eliminado= grupo.get(edad);
        grupo.remove(edad, nombre);
        System.out.println(eliminado);
    }
    public void mostrarAlumnos(){
        grupo.values();
    }
}
