package co.com.bancolombia.model.movie;
import co.com.bancolombia.model.movie.values.*;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder(toBuilder = true)
public class Movie {

    private String id;
    private Director director;
    private Category category;
    private Set<Character> character;
    private Nombre titleMovie;
    private Puntaje puntaje;

    public Movie(String id, Director director, Category category, Set<Character> characters, Nombre titleMovie, Puntaje puntaje) {
        this.id = id;
        this.director = director;
        this.puntaje = puntaje;
        this.category = category;
        this.character = characters;
        this.titleMovie = titleMovie;
    }

    public Movie(Director director, Category category, Set<Character> character, Nombre titleMovie, Puntaje puntaje) {
        this.director = director;
        this.category = category;
        this.character = character;
        this.titleMovie = titleMovie;
        this.puntaje = puntaje;
    }

    public void cambiarTitulo(Nombre nombre){
        this.titleMovie = nombre;
    }

    public void cambiarDirector(Director director){
        this.director = director;
    }

    public void puntaje(Puntaje puntaje){
        this.puntaje = puntaje;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<Character> getCharacter() {
        return character;
    }

    public void setCaracter(Set<Character> caracter) {
        this.character = caracter;
    }

    public Nombre getTitleMovie() {
        return titleMovie;
    }

    public void setTitleMovie(Nombre titleMovie) {
        this.titleMovie = titleMovie;
    }

    public Puntaje getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Puntaje puntaje) {
        this.puntaje = puntaje;
    }
}
