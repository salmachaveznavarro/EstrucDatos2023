

package com.mycompany.ejemplotreemap;
/**
 *
 * @author salmachaveznavarro
 */
public class EjemploTreeMap {

    public static void main(String[] args) {
        TreeMapGrupo grupodeZumba;
        
        /* QUEREMOS CREAR UN GRUPO DE ZUMBA EN EL QUE
        LOS ALUMNOS ESTEN ORDENADOS POR SU EDAD */
        grupodeZumba= new TreeMapGrupo();
        
        // INGRESANDO AL GRUPO AL MISMO TIEMPO QUE CHECA QUE TODAVIA HAYA CUPO
        grupodeZumba.agregarAlumno(30, "Sandra");
        grupodeZumba.agregarAlumno(60, "Angelica");
        grupodeZumba.agregarAlumno(8, "Silvia");
        grupodeZumba.agregarAlumno(11, "Jose");
        grupodeZumba.agregarAlumno(67, "Juan");
        grupodeZumba.agregarAlumno(17, "Olga");
        grupodeZumba.agregarAlumno(34, "Diana");
        grupodeZumba.agregarAlumno(17, "Gustavo");
        
        // VERIFICANDO EL ORDEN
        grupodeZumba.mostrarAlumnos();
        
        // SE SALEN DEL GRUPO JOSE Y OLGA
        grupodeZumba.eliminarAlumno(11, "Jose");
        grupodeZumba.eliminarAlumno(17, "Olga");
        
        // SE QUIERE CONOCER EL ALUMNO MAS JOVEN
        grupodeZumba.elMasJoven();
        
        // SE QUIERE CONOCER EL ALUMNO MAS VIEJO
        grupodeZumba.elMasViejo();
    }
}
