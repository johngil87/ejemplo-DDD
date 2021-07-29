package co.com.bancolombia.model.movie;

import co.com.bancolombia.model.movie.values.Nombre;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Category {

    private Nombre nombre;

    public Category( Nombre nombre) {
        this.nombre = nombre;
    }

    public Category() {
    }


    public Nombre getNombre() {
        return nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }
}
