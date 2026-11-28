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

import Lógica.Dificultad;
import Lógica.Ingrediente;
import Lógica.Necesario;
import Lógica.Receta;
import Lógica.Utensilio;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Recetario implements Serializable
{
    //Atributos
    private static final long serialVersionUID = 1L;
    private static final String dataFileName = "datos.dat";
    private Set<String> etiquetas;
    private static Recetario instance;
    private List<Receta> recetas;
    private Set<Ingrediente> alacena;
    private Set<Utensilio> instrumentos;
    
    //Constructor, instancia y guardado y cargado de datos
    private Recetario()
    {
        instance = null;
        etiquetas = new TreeSet<>();
        recetas = new LinkedList<>();
        alacena = new TreeSet<>();
        instrumentos = new TreeSet<>();
    }
    
    public static Recetario getInstance()
    {
        if (instance == null)
            instance = new Recetario();
        return instance;
    }
    
    public void cargarDatos() throws IOException, ClassNotFoundException
    {
        File dataFile = new File(dataFileName);
        if (!dataFile.exists()) 
        {
            return;
        }
        FileInputStream file = new FileInputStream(dataFileName);
        ObjectInputStream stream = new ObjectInputStream(file);
        instance = (Recetario)stream.readObject();
        stream.close();
        file.close();
    }
    public void guardarDatos() throws IOException
    {
        FileOutputStream file = new FileOutputStream(dataFileName);
        ObjectOutputStream stream = new ObjectOutputStream(file);
        stream.writeObject(instance);
        stream.close();
        file.close();
    }
    
    
    //Setters
    public void setAlacena(Set<Ingrediente> alacena)
    {
        this.alacena = alacena;
    }
    public void setInstrumentos(Set<Utensilio> instrumentos)
    {
        this.instrumentos = instrumentos;
    }
    public void setRecetas(List<Receta> recetas)
    {
        this.recetas = recetas;
    }
    public void setEtiquetas(Set<String> etiquetas)
    {
        this.etiquetas = etiquetas;
    }
    
    
    
    //Adicionales
    public List<Receta> queCocinar()
    {
        List<Receta> posiblesRecetas = new LinkedList<>();
        
        
        return posiblesRecetas;
    }
    public void MarcarDisponibilidad(Necesario necesario, boolean disponibilidad)
    {
        necesario.setDisponibilidad(disponibilidad);
    }
    
    
    //Filtrados 
    public List<Receta> filtradoDuracion(String criterio)
    {
        List<Receta> filtrado = new LinkedList<>();
        
        
        return filtrado;
    }
    
    public List<Receta> filtradoDificultad(Dificultad criterio)
    {
         List<Receta> filtrado = new LinkedList<>();
         
         
         return filtrado;
    }
    public List<Receta> filtradoEtiquetas(TreeSet<String> criterio)
    {
         List<Receta> filtrado = new LinkedList<>();
         
        return filtrado;
    }
    
    
    //Métodos relacionados con Ingredientes
    public Set<Ingrediente> verAlacena()
    {
        return alacena;
    }
    public void agregarIngrediente(String nombre, Boolean disponibilidad)
    {
        Ingrediente i = new Ingrediente(nombre, disponibilidad);
        alacena.add(i);
    }
    public void editarIngrediente(Ingrediente ingrediente, String nombre, Boolean disponibilidad)
    {
        ingrediente.setNombre(nombre);
        ingrediente.setDisponibilidad(disponibilidad);
    }
    public void eliminarIngrediente(Ingrediente ingrediente)
    {
        //Que las recetas no lo contengan
        alacena.remove(ingrediente);
    }
    
    
    //Métodos relacionados con Utensilios
    public Set<Utensilio> verInstrumento()
    {
        return instrumentos;
    }
    public void agregarInstrumento(String nombre, Boolean disponibilidad)
    {
        Utensilio u = new Utensilio(nombre, disponibilidad);
        instrumentos.add(u);
    }
    public void editarInstrumento(Utensilio utensilio, String nombre, Boolean disponibilidad)
    {
        utensilio.setDisponibilidad(disponibilidad);
        utensilio.setNombre(nombre);
    }
    public void eliminarInstrumento(Utensilio utensilio)
    {
        instrumentos.remove(utensilio);
    }
    
    
    //Métodos relacionados con Recetas
    public List<Receta> verRecetas()
    {
        return recetas;
    }
    public void verReceta()
    {
        for (Receta r : recetas)
            r.toString();
    }
    public void agregarReceta(String nombre, Integer porciones, String descripcion, Double duracion, Dificultad dificultad)  
    {
        Receta r = new Receta(nombre, porciones, descripcion, duracion, dificultad);
        recetas.add(r);
    }
    public void editarReceta(Receta receta, String nombre, Integer porciones, String descripción, Double duracion,  Dificultad dificultad)  
    {
        receta.setDescripcion(descripción);
        receta.setNombre(nombre);
        receta.setDificultad(dificultad);
        receta.setPorciones(porciones);
        receta.setDuracion(duracion);
    }
    public void eliminarReceta(Receta receta)
   {
       recetas.remove(receta);
   }
    
    
     //Métodos relacionados con Etiqueta
       public Set<String> verEtiquetas()
    {
        return etiquetas;
    }
    public void agregarEtiqueta(String etiqueta)
    {
        etiquetas.add(etiqueta);
    }
    public void eliminarEtiqueta(String etiqueta)
   {
        etiquetas.remove(etiqueta);
   }
 
    
     //Métodos relacionados con Foto
    public void agregarFoto(String foto, Receta receta)
    {
        receta.agregarFoto(foto);
    }
    public void eliminarFoto(String foto, Receta receta)
   {
       receta.borrarFoto(foto);
   }
    
    
}
