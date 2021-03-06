package app;

import java.util.ArrayList;
import java.util.List;

public class Temporada{
    private String nombre; // Esto es el nombre de la temporada
    private List<Episodio> episodios = new ArrayList<>();
    private int numero;

    public List<Episodio> getEpisodios(){
        return this.episodios;
    }
 
    public void setActores(List<Episodio> episodios) {
        this.episodios = episodios;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public Episodio buscarEpisodio(int opcionEpisodio){ 
        //Episodio es lo que me va a devolver el metodo
        //buscarEpisodio es el nombre del metodo
        //int numeroEpisodio es el numero de episodio que tengo que buscar

        for (Episodio episodio: this.episodios){
            //Aca como tenemos que comparar (y para eso hay que leer),
            //No vamos a usar el setter sino el getter
            if (episodio.getNumero() == opcionEpisodio){
                return episodio;
            }
        }
        return null;
    }

    public void listaEpisodios() {
        System.out.println("Listando los episodios disponibles");

        System.out.println("***************");

        for (Episodio episodio: this.episodios){

            System.out.println("Episodio: " + episodio.getNumero()); 

        }
    }

    

}