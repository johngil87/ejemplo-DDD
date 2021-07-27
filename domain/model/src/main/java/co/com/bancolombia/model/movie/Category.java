package co.com.bancolombia.model.movie;

import co.com.bancolombia.model.movie.values.CategoryId;
import co.com.bancolombia.model.movie.values.CharacterId;
import co.com.bancolombia.model.movie.values.Nombre;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Category {

    private CategoryId categoryId;
    private Nombre nombre;

    public Category(CategoryId categoryId, Nombre nombre) {
        this.categoryId = categoryId;
        this.nombre = nombre;
    }

    public Category() {
    }

    public CategoryId getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(CategoryId categoryId) {
        this.categoryId = categoryId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }
}
