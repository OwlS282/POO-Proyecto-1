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
Clase: Controladora
	........
*/
package Control;

import Lógica.Cantidades;
import Lógica.Dificultad;
import Lógica.Ingrediente;
import Lógica.Necesario;
import Lógica.Receta;
import Lógica.Utensilio;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Controladora implements Serializable
{
    //Atributos
    private static final long serialVersionUID = 1L;
    private Set<String> etiquetas;
    private Controladora instance;
    private List<Receta> recetas;
    private Set<Ingrediente> alacena;
    private Set<Utensilio> instrumentos;
    
    //Constructor, instancia y guardado y cargado de datos
    private Controladora()
    {
        
    }
    public Controladora getInstance()
    {
        
    }
    public void cargarDatos()
    {
        
    }
    public void guardarDatos()
    {
        
    }
    
    //Getters
    public TreeSet<Ingrediente> getAlacena()
    {
        
    }
    public TreeSet<Utensilio> getInstrumentos()
    {
        
    }
    public LinkedList<Receta> getRecetas()
    {
        
    }
    
    //Setters
    public void setAlacena(TreeSet<Ingrediente> alacena)
    {
        
    }
    public void setInstrumentos(TreeSet<Utensilio> instrumentos)
    {
        
    }
    public void setRecetas(LinkedList<Receta> recetas)
    {
        
    }
    
    
    //Adicionales
    public LinkedList<Receta> queCocinar()
    {
        
    }
    public void MarcarDisponibilidad(Necesario necesario)
    {
        
    }
    
    
    //Filtrados 
    public LinkedList<Receta> filtradoDuracion(Integer criterio)
    {
        
    }
    public LinkedList<Receta> filtradoDificultad(Dificultad criterio)
    {
        
    }
    public LinkedList<Receta> filtradoEtiquetas(TreeSet<String> criterio)
    {
        
    }
    
    
    //Métodos relacionados con Ingredientes
    public void verIngredientes()
    {
        
    }
    public void agregarIngrediente(String nombre, Boolean disponibilidad)
    {
        
    }
    public void editarIngrediente(Ingrediente ingrediente, String nombre, Boolean disponibilidad)
    {
        
    }
    public void eliminarIngrediente(Ingrediente ingrediente)
    {
        
    }
    
    
    //Métodos relacionados con Utensilios
    public void verInstrumento()
    {
        
    }
    public void agregarInstrumento(String nombre, Boolean disponibilidad)
    {
        
    }
    public void editarInstrumento(Utensilio utensilio, String nombre, Boolean disponibilidad)
    {
        
    }
    public void eliminarInstrumento(Utensilio utensilio)
    {
        
    }
    
    
    //Métodos relacionados con Recetas
    public void verRecetas()
    {
        
    }
    public void verReceta()
    {
        
    }
    public void agregarReceta(String nombre, Integer porciones, String descripción, LinkedList<String>etiquetas, 
String foto, Integer duracion, LinkedList<Cantidades> ingredientes, Dificultad dificultad, 
TreeSet<Utensilio> utensilios)  
    {
        
    }
    public void editarReceta(String nombre, Integer porciones, String descripción, LinkedList<String>etiquetas, 
String foto, Integer duracion, LinkedList<Cantidades> ingredientes, Dificultad dificultad, 
TreeSet<Utensilio> utensilios)  
    {
        
    }
    public void eliminarReceta(Receta receta)
   {
        
   }
    
    
     //Métodos relacionados con Etiqueta
    public void agregarEtiqueta(String etiqueta)
    {
        
    }
    public void eliminarEtiqueta(String etiqueta)
   {
        
   }
    
     //Métodos relacionados con Foto
    public void agregarFoto(String foto, Receta receta)
    {
        
    }
    public void eliminarFoto(String foto, Receta receta)
   {
        
   }
    
    

    
}
