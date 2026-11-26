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
Clase: Receta
	........
*/
package Lógica;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Receta  implements Serializable {
    
     private static final long serialVersionUID = 1L;
     private String nombre;
     private Integer porciones;
     private String descripcion;
     private List<String> etiquetas;
     private String foto;
     private Integer duracion;
     private Set<Utensilio> utensilios;
     private List<Cantidades> ingredientes;
     private Dificultad dificultad;
    
     //Válidaciones. 
     
     //Constructor.
     //Recibe las cantidades ya creadas
     public Receta (String nombre, Integer porciones, String descripción, LinkedList<String>etiquetas, 
String foto, Integer duracion, LinkedList<Cantidades> ingredientes, Dificultad dificultad, 
TreeSet<Utensilio> utensilios)  
     {
         
     }
     //Recibe la cantidad y el ingrediente por separado
     public Receta (String nombre, Integer porciones, String descripción, LinkedList<String>etiquetas, 
String foto, Integer duracion, Ingrediente ingrediente, Double cantidad, Dificultad dificultad, 
TreeSet<Utensilio> utensilios)
     {
         
     }
     
     
     //Getters
     public String getNombre()
     {
         
     }
     public Integer getPorciones()
     {
         
     }
     public String getDescripcion()
     {
         
     }
     public LinkedList<String> getEtiquetas()
     {
         
     }
     public String getFoto()
     {
         
     }
     public Integer getDuracion()
     {
         
     }
     public LinkedList<Cantidades> getIngredientes()
     {
         
     }
     public TreeSet<Utensilio> getUtensilios()
     {
         
     }
     
     //Setters
      public void setNombre(String nombre)
     {
         
     }
     public void setPorciones(Integer porciones)
     {
         
     }
     public void setDescripcion(String Descripcion)
     {
         
     }
     public void setEtiquetas(LinkedList<String> etiquetas)
     {
         
     }
     public void setFoto(String foto)
     {
         
     }
     public void setDuracion(Integer duracion)
     {
         
     }
     public void setIngredientes(LinkedList<Cantidades> ingredientes)
     {
         
     }
     public void setUtensilios(TreeSet<Utensilio> utensilios)
     {
         
     }
     
     
     //Métodos relacionados con Etiqueta
     public void agregarEtiqueta(String etiqueta)
     {
         
     }
     public void borrarEtiqueta(String etiqueta)
     {
         
     }
     
     
     //Métodos relacionados con Ingredientes
     public void agregarIngrediente(Ingrediente ingrediente, Double cantidad)
     {
         
     }
     public void borrarIngrediente(Ingrediente ingrediente)
     {
         
     }
     
     
     //Métodos relacionados con Utensilios
       public void agregarUtensilio(Utensilio utensilio)
     {
         
     }
     public void borrarUtensilio(Utensilio utensilio)
     {
         
     }
}
