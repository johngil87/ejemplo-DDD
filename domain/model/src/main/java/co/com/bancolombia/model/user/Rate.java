package co.com.bancolombia.model.user;

import co.com.bancolombia.model.movie.values.Puntaje;
import lombok.Builder;
import lombok.Data;


@Data
@Builder(toBuilder = true)
public class Rate {

    private String idUser;
    private String idMovie;
    private Puntaje puntaje;

    public Rate(String id, String idUser, String idMovie, Puntaje puntaje) {
        this.idUser = id;
        this.idMovie = idMovie;
        this.puntaje = puntaje;
    }

    public Rate(String idUser, String idMovie, Puntaje puntaje) {
        this.idMovie = idMovie;
        this.puntaje = puntaje;
    }

    public Rate() {
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(String idMovie) {
        this.idMovie = idMovie;
    }

    public Puntaje getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Puntaje puntaje) {
        this.puntaje = puntaje;
    }
}
