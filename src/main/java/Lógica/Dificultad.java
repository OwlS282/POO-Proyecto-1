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
Clase: Dificultad
	........
*/
package Lógica;

public enum Dificultad 
{
    FACIL, MEDIO, DIFICIL, EXPERTO;
    
    @Override    
public String toString()
{
        return switch (this) {
            case FACIL -> "Fácil";
            case MEDIO -> "Medio";
            case DIFICIL -> "Difícil";
            case EXPERTO -> "Experto";
        };	
}

}
