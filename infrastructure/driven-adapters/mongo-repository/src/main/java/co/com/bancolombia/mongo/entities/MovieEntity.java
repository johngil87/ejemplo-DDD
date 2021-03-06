package co.com.bancolombia.mongo.entities;

import co.com.bancolombia.model.movie.Category;
import co.com.bancolombia.model.movie.Character;
import co.com.bancolombia.model.movie.Director;
import co.com.bancolombia.model.movie.values.PlotMovie;
import co.com.bancolombia.model.movie.values.UrlResource;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.Set;

@Document
public class MovieEntity {

    @Id
    private String id;
    private String titulo;
    private Set<Character> characters;
    private Director director;
    private Double puntaje;
    private Set<Category> categoria;
    private UrlResource urlTrailer;
    private UrlResource urlImagen;
    private PlotMovie resumen;

    public MovieEntity(String id, String titulo, Set<Character> characters, Director director, Double puntaje, Set<Category>categoria, UrlResource urlTrailer, UrlResource urlImagen, PlotMovie resumen) {
        this.id = id;
        this.titulo = titulo;
        this.characters = characters;
        this.director = director;
        this.puntaje = puntaje;
        this.categoria = categoria;
        this.urlTrailer = urlTrailer;
        this.urlImagen = urlImagen;
        this.resumen = resumen;
    }

    public MovieEntity(String id, String titulo, Set<Character> characters, Director director, Double puntaje, Set<Category> categoria) {
        this.id = id;
        this.titulo = titulo;
        this.characters = characters;
        this.director = director;
        this.puntaje = puntaje;
        this.categoria = categoria;
    }

    public MovieEntity(String titulo, Set<Character> characters, Director director, Double puntaje, Set<Category> categoria) {
        this.titulo = titulo;
        this.characters = characters;
        this.director = director;
        this.puntaje = puntaje;
        this.categoria = categoria;
    }

    public MovieEntity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Set<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(Set<Character> characters) {
        this.characters = characters;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Double puntaje) {
        this.puntaje = puntaje;
    }

    public Set<Category> getCategoria() {
        return categoria;
    }

    public UrlResource getUrlTrailer() {
        return urlTrailer;
    }

    public void setUrlTrailer(UrlResource urlTrailer) {
        this.urlTrailer = urlTrailer;
    }

    public UrlResource getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(UrlResource urlImagen) {
        this.urlImagen = urlImagen;
    }

    public PlotMovie getResumen() {
        return resumen;
    }

    public void setResumen(PlotMovie resumen) {
        this.resumen = resumen;
    }

    public void setCategoria(Set<Category> categoria) {
        this.categoria = categoria;
    }
}
