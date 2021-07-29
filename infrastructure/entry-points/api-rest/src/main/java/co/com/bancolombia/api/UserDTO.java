package co.com.bancolombia.api;

import co.com.bancolombia.model.movie.values.Nombre;
import co.com.bancolombia.model.user.Rate;
import co.com.bancolombia.model.user.values.Correo;
import co.com.bancolombia.model.user.values.UrlImage;

import java.util.Set;

public class UserDTO {

    private String id;
    private Nombre userName;
    private Correo userEmail;
    private UrlImage userImage;
    private Set<String> idFavorites;
    private Set<Rate> rate;

    public UserDTO(String id, Nombre nombre, Correo correo, UrlImage image, Set<String> idFavorites, Set<Rate> rate) {
        this.id = id;
        this.userName = nombre;
        this.userEmail = correo;
        this.userImage = image;
        this.idFavorites = idFavorites;
        this.rate = rate;
    }

    public UserDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Nombre getUserName() {
        return userName;
    }

    public void setUserName(Nombre userName) {
        this.userName = userName;
    }

    public Correo getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(Correo userEmail) {
        this.userEmail = userEmail;
    }

    public UrlImage getUserImage() {
        return userImage;
    }

    public void setUserImage(UrlImage userImage) {
        this.userImage = userImage;
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

    public void setRate(Set<Rate> rate) {
        this.rate = rate;
    }
}
