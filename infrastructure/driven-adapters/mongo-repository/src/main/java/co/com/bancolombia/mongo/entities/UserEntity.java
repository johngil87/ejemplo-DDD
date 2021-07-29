package co.com.bancolombia.mongo.entities;

import co.com.bancolombia.model.movie.values.Nombre;
import co.com.bancolombia.model.user.Rate;
import co.com.bancolombia.model.user.values.Correo;
import co.com.bancolombia.model.user.values.UrlImage;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Document
public class UserEntity {
    @Id
    private String id;
    private Nombre nombre;
    private String correo;
    private UrlImage image;
    private Set<String> idFavorites;
    private Set<Rate>  rate;

    public UserEntity(String id, Nombre nombre, String correo, UrlImage image, Set<String> idFavorites, Set<Rate> rate) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.image = image;
        this.idFavorites = idFavorites;
        this.rate = rate;
    }

    public UserEntity(Nombre nombre, String correo, UrlImage image, Set<String> idFavorites, Set<Rate> rate) {
        this.nombre = nombre;
        this.correo = correo;
        this.image = image;
        this.idFavorites = idFavorites;
        this.rate = rate;
    }

    public UserEntity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public UrlImage getImage() {
        return image;
    }

    public void setImage(UrlImage image) {
        this.image = image;
    }

    public Set<String> getIdFavorites() {
        return idFavorites;
    }

    public void setIdFavorites(Set<String> idFavorites) {
        this.idFavorites = idFavorites;
    }

    public Set<Rate> getRate() {
        return rate;
    }

    public void setRate(Set<Rate>  rate) {
        this.rate = rate;
    }
}
