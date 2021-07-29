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
    private Set<Category> category;
    private Set<Character> character;
    private Nombre titleMovie;
    private Puntaje puntaje;
    private UrlResource urlTrailer;
    private UrlResource urlImage;
    private PlotMovie plot;

    public Movie(String id, Director director, Set<Category> category, Set<Character> character, Nombre titleMovie, Puntaje puntaje, UrlResource urlTrailer, UrlResource urlImage, PlotMovie plot) {
        this.id = id;
        this.director = director;
        this.category = category;
        this.character = character;
        this.titleMovie = titleMovie;
        this.puntaje = puntaje;
        this.urlTrailer = urlTrailer;
        this.urlImage = urlImage;
        this.plot = plot;
    }

    public Movie(String id, Director director, Set<Category> category, Set<Character> characters, Nombre titleMovie, Puntaje puntaje) {
        this.id = id;
        this.director = director;
        this.puntaje = puntaje;
        this.category = category;
        this.character = characters;
        this.titleMovie = titleMovie;
    }

    public Movie(Director director, Set<Category> category, Set<Character> character, Nombre titleMovie, Puntaje puntaje) {
        this.director = director;
        this.category = category;
        this.character = character;
        this.titleMovie = titleMovie;
        this.puntaje = puntaje;
    }

    public void cambiarTitulo(Nombre nombre) {
        this.titleMovie = nombre;
    }

    public void cambiarDirector(Director director) {
        this.director = director;
    }

    public void puntaje(Puntaje puntaje) {
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

    public Set<Category> getCategory() {
        return category;
    }

    public void setCategory(Set<Category> category) {
        this.category = category;
    }

    public Set<Character> getCharacter() {
        return character;
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

    public void setCharacter(Set<Character> character) {
        this.character = character;
    }

    public UrlResource getUrlTrailer() {
        return urlTrailer;
    }

    public void setUrlTrailer(UrlResource urlTrailer) {
        this.urlTrailer = urlTrailer;
    }

    public UrlResource getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(UrlResource urlImage) {
        this.urlImage = urlImage;
    }

    public PlotMovie getPlot() {
        return plot;
    }

    public void setPlot(PlotMovie plot) {
        this.plot = plot;
    }
}
