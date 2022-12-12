
package com.mycompany.ejemplolinkedhashmap;
import java.util.LinkedHashMap;
/**
 *
 * @author salmachaveznavarro
 * @param T
 */
public class LinkedHashMapRegistro {
    LinkedHashMap<Double, Integer> registro;
    
    public LinkedHashMapRegistro(int cupo){
        registro = new LinkedHashMap(cupo);
    }
    public void AgregarPaciente(double altura, int peso){
        registro.put(altura, peso);
        System.out.println("Paciente agregado, altura--> "+ altura + " y peso--> "+ peso);
    }
    public void EliminarPaciente(double altura, int peso){
        System.out.println("Paciente eliminado, altura--> "+ altura + " y peso--> "+ peso);
        registro.remove(altura,peso);
    }
    public void MostrarAlturas(){
        System.out.println(registro.keySet());
    }
    public void MostrarPesos(){
        System.out.println(registro.values());
    }
}

