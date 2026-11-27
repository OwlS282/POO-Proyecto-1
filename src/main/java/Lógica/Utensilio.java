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
Clase: Utensilio
	........
*/
package Lógica;

import java.io.Serializable;

public class Utensilio extends Necesario implements Serializable{
    private static final long serialVersionUID = 1L;
    
    public Utensilio(String nombre, boolean disponibilidad) {
        super(nombre, disponibilidad);
    }
     public Utensilio(String nombre) {
        super(nombre, true);
    }
     @Override
    public String toString()
    {
        return "Utensilio:  " + getNombre();
    }
}
