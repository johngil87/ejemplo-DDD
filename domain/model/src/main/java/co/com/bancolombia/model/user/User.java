package co.com.bancolombia.model.user;
import co.com.bancolombia.model.movie.values.Nombre;
import co.com.bancolombia.model.user.values.Correo;
import co.com.bancolombia.model.user.values.UrlImage;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder(toBuilder = true)
public class User {
    private String id;
    private Nombre nombre;
    private Correo correo;
    private UrlImage image;
    private Set<String> idFavorites;
    private Set<Rate> rate;

    public User(String id, Nombre nombre, Correo correo, UrlImage image, Set<String> idFavorites, Set<Rate> rate) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.image = image;
        this.idFavorites = idFavorites;
        this.rate = rate;
    }

    public User(Nombre nombre, Correo correo, UrlImage image, Set<String> idFavorites, Set<Rate>  rate) {
        this.nombre = nombre;
        this.correo = correo;
        this.image = image;
        this.idFavorites = idFavorites;
        this.rate = rate;
    }

    public User() {
    }

    public void addFavorites(String idMovie){
        this.idFavorites.add(idMovie);
    }

    public void removeFavorites(String idMovie){
        this.idFavorites.remove(idMovie);
    }

    public void rateMovie(Set<Rate> rate){
        this.rate = rate;
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

    public Correo getCorreo() {
        return correo;
    }

    public void setCorreo(Correo correo) {
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
}
