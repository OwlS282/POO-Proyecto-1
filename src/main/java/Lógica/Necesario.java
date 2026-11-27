/*
Instituto Tecnologico de Costa Rica

Integrantes:	Owel Jafet Gutiérrez Ortiz,	2026800869
		Miranda Jiménez Alvarado,	2026008616
		Keishiro Gabriel Cubero Abe,	2026091245
		Eduardo Alfonso Moreno Pérez,	2025080891

Profesor : Mauricio Aviles Cisneros

Semana 18 : Proyecto 1 - Sistema de Recetas

Fecha de entrega : 01 / 12 / 2026

*/

/*
Clase: Necesario
	........
*/
package Lógica;

import java.io.Serializable;

public abstract class Necesario  implements Serializable, Comparable<Necesario> {
    
    //Atributos
    private static final long serialVersionUID = 1L;
    private String nombre;
    private boolean disponibilidad;
    
    
    //Constructor
    public Necesario(String nombre, boolean disponibilidad)
    {
        //DEBE VERIFICAR QUE NOMBRE NO SEA VACÍO
        this.nombre = nombre;
        this.disponibilidad = disponibilidad;
    }
    public Necesario(String nombre)
    {
        //DEBE VERIFICAR QUE NOMBRE NO SEA VACÍO
        this.nombre = nombre;
        disponibilidad = true;
    }
    
    //Getters
    public String getNombre()
    {
        return nombre;
    }
    public boolean getDisponibilidad()
    {
        return disponibilidad;
    }
    
    //Setters
    public void setNombre(String nombre)
    {
        //DEBE VERIFICAR QUE NOMBRE NO SEA VACÍO
        this.nombre = nombre;
    }
    public void setDisponibilidad(boolean disponibilidad)
    {
        this.disponibilidad = disponibilidad;
    }
    
    
    //Sobrescritos
     //CompareTo: Indica cuál de dos necesarios va primero.
    @Override
    public int compareTo(Necesario otro)
    {
        return this.nombre.compareToIgnoreCase(otro.nombre);
    }
    
    //Equals: Se asegura que dos objetos con el mismo nombre sean iguales.
    @Override
    public boolean equals(Object o) 
    {
        if (this == o) return true;
        if (!(o instanceof Necesario)) return false;
        Necesario otro = (Necesario) o;
        return nombre.equalsIgnoreCase(otro.nombre);
    }
    @Override
    public int hashCode() 
    {
        return nombre.toLowerCase().hashCode();
    }
    
    
}
