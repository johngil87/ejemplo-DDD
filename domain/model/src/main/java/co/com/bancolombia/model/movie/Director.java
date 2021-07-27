package co.com.bancolombia.model.movie;

import co.com.bancolombia.model.movie.values.DirectorId;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Director {

    private DirectorId directorId;
    private String nombre;

    public Director(DirectorId directorId, String nombre) {
        this.directorId = directorId;
        this.nombre = nombre;
    }

    public Director() {
    }

    public DirectorId getDirectorId() {
        return directorId;
    }

    public void setDirectorId(DirectorId directorId) {
        this.directorId = directorId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
