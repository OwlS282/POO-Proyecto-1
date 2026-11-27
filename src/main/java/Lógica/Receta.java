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
     private List<String> fotos;
     private Double duracion;
     private Set<Utensilio> utensilios;
     private List<Cantidades> ingredientes;
     private Dificultad dificultad;
    
     //Válidaciones. 
     
     //Constructor.
     public Receta (String nombre, Integer porciones, String descripcion, Double duracion, Dificultad dificultad)  
     {
         //NOMBRE, DESCRIPCIÓN, DIFICULTAD NO VACÍO
         //DURACIÓN Y POCIONES PUEDEN SER NULL, PERO NO VALORES INVÁLIDOS
         
         this.nombre = nombre;
         this.porciones = porciones;
         this.descripcion = descripcion;
         etiquetas = new LinkedList<>();
         fotos = new LinkedList<>();
         this.duracion = duracion;
         ingredientes = new LinkedList<>();
         utensilios = new TreeSet<>();
         this.dificultad = dificultad;
                  
     }
     
     //Getters
     public String getNombre()
     {
         return nombre;
     }
     public Integer getPorciones()
     {
         return porciones;
     }
     public String getDescripcion()
     {
         return descripcion;
     }
     public List<String> getEtiquetas()
     {
         return etiquetas;
     }
     public List<String> getFotos()
     {
         return fotos;
     }
     public Double getDuracion()
     {
         return duracion;
     }
     public List<Cantidades> getIngredientes()
     {
         return ingredientes;
     }
     public Set<Utensilio> getUtensilios()
     {
         return utensilios;
     }
     public Dificultad getDificultad()
     {
         return dificultad;
     }
     
     //Setters
      public void setNombre(String nombre)
     {
         this.nombre = nombre;
     }
     public void setPorciones(Integer porciones)
     {
         this.porciones = porciones;
     }
     public void setDescripcion(String descripcion)
     {
         this.descripcion = descripcion;
     }
     public void setEtiquetas(List<String> etiquetas)
     {
         this.etiquetas = etiquetas; 
     }
     public void setFotos(List<String> fotos)
     {
         this.fotos = fotos;
     }
     public void setDuracion(Double duracion)
     {
         this.duracion = duracion;
     }
     public void setIngredientes(List<Cantidades> ingredientes)
     {
         this.ingredientes = ingredientes;
     }
     public void setUtensilios(Set<Utensilio> utensilios)
     {
         this.utensilios = utensilios;
     }
     public void setDificultad(Dificultad dificultad)
     {
         this.dificultad = dificultad;
     }
     
     
     //Métodos relacionados con Etiqueta
     public void agregarEtiqueta(String etiqueta)
     {
         //NO VACIA Y NO REPETIDA
         etiquetas.add(etiqueta);
     }
     public void borrarEtiqueta(String etiqueta)
     {
         etiquetas.remove(etiqueta);
     }
     
     
     //Métodos relacionados con Ingredientes
     public void agregarIngrediente(Ingrediente ingrediente, String cantidad)
     {
         //NO VACIA Y NO REPETIDA
         Cantidades c = new Cantidades(cantidad, ingrediente);
         ingredientes.add(c);
     }
     public void borrarIngrediente(Cantidades ingrediente)
     {
         ingredientes.remove(ingrediente);
     }
     
     
     //Métodos relacionados con Utensilios
       public void agregarUtensilio(Utensilio utensilio)
     {
         //NO VACIA Y NO REPETIDA
         utensilios.add(utensilio);
     }
     public void borrarUtensilio(Utensilio utensilio)
     {
         utensilios.remove(utensilio); 
     }
     
     //Métodos relacionados con Fotos
     public void agregarFoto(String foto)
     {
         //NO VACIA Y NO REPETIDA
         fotos.add(foto);
     }
     public void borrarFoto(String foto)
     {
         fotos.remove(foto);
     }
     
     //Métodos adicionales
     public int ingredientesFaltantes()
     {
         int disponibles = 0;
         for (Cantidades c : ingredientes)
         {
             if (c.getIngrediente().getDisponibilidad() == true)
                 disponibles++;
         }
         return disponibles;
     }
          public int utensiliosFaltantes()
     {
         int disponibles = 0;
         for (Utensilio u : utensilios)
         {
             if (u.getDisponibilidad() == true)
                 disponibles++;
         }
         return disponibles;
     }
     @Override 
     public String toString()
     {
         return nombre + "  " + "Horas de preparación: " + " " + duracion + " " + "Dificultad: " + dificultad;
     }
}
