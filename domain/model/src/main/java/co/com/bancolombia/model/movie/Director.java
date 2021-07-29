package co.com.bancolombia.model.movie;


import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Director {

    private String nombre;

    public Director(String nombre) {
        this.nombre = nombre;
    }

    public Director() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
