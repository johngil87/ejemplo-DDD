package co.com.bancolombia.api;

import co.com.bancolombia.model.movie.Category;
import co.com.bancolombia.model.movie.Character;
import co.com.bancolombia.model.movie.Director;
import co.com.bancolombia.model.movie.values.Puntaje;

import java.util.List;
import java.util.Set;

public class MovieDTO {

    private String id;
    private String nombre;
    private Double puntaje;
    private Director movieDirector;
    private Set<Character> actores;
    private Category categoria;

    public MovieDTO(String id, String nombre, Double puntaje, Director director, Set<Character> actores, Category categoria) {
        this.id = id;
        this.nombre = nombre;
        this.puntaje = puntaje;
        this.movieDirector = director;
        this.actores = actores;
        this.categoria = categoria;
    }

    public MovieDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Double puntaje) {
        this.puntaje = puntaje;
    }

    public Director getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(Director movieDirector) {
        this.movieDirector = movieDirector;
    }

    public Set<Character> getActores() {
        return actores;
    }

    public void setActores(Set<Character> actores) {
        this.actores = actores;
    }

    public Category getCategoria() {
        return categoria;
    }

    public void setCategoria(Category categoria) {
        this.categoria = categoria;
    }
}
