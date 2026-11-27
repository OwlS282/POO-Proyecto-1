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
Clase: Cantidades
	........
*/

package Lógica;

import java.io.Serializable;

public class Cantidades implements Serializable {
    
    //Atributos.
    private static final long serialVersionUID = 1L;
    private String cantidad;
    private Ingrediente ingrediente;
    
    //Contructor.
    public Cantidades(String cantidad, Ingrediente ingrediente) 
    {
        //DEBE VÁLIDAR QUE INGREDIENTE Y CANTIDAD NO SEAN NULOS.
        this.cantidad = cantidad;
        this.ingrediente = ingrediente; 
    }
    //Getters
    public String getCantidad()
    {
        return cantidad;
    }
    public Ingrediente getIngrediente()
    {
        return ingrediente;
    }
    //Setters
    public void setCantidad(String cantidad)
    {
        //CANTIDAD NO PUEDE SER NULL
        this.cantidad = cantidad;
    }
    public void setIngrediente(Ingrediente ingrediente)
    {
        //INGREDIENTE NO PUEDE SER NULL
        this.ingrediente = ingrediente;
    }
    
}
