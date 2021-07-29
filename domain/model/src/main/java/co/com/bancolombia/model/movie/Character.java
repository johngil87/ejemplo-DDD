package co.com.bancolombia.model.movie;


import co.com.bancolombia.model.movie.values.Nombre;

public class Character {


    private Nombre nombre;

    public Character(Nombre nombre) {
        this.nombre = nombre;
    }

    public Character() {
    }

    public Nombre getNombre() {
        return nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }
}
