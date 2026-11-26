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
    private Double cantidad;
    private Ingrediente ingrediente;
    
    //Contructor.
    public Cantidades(Double cantidad, Ingrediente ingrediente) 
    {
        //FALTA IMPLEMENTAR
        //EXCEPCIONES
    }
    //Getters
    public Double getCantidad()
    {
        return cantidad;
    }
    public Ingrediente getIngrediente()
    {
        return ingrediente;
    }
    //Setters
    public void setCantidad(Double cantidad)
    {
        this.cantidad = cantidad;
    }
    public void setIngrediente(Ingrediente ingrediente)
    {
        this.ingrediente = ingrediente;
    }
    
}
