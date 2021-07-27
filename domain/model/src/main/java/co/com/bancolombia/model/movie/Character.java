package co.com.bancolombia.model.movie;

import co.com.bancolombia.model.movie.values.CharacterId;
import co.com.bancolombia.model.movie.values.Nombre;

public class Character {

    private CharacterId characterId;
    private Nombre nombre;

    public Character(CharacterId characterId, Nombre nombre) {
        this.characterId = characterId;
        this.nombre = nombre;
    }

    public Character() {
    }

    public CharacterId getCharacterId() {
        return characterId;
    }

    public void setCharacterId(CharacterId characterId) {
        this.characterId = characterId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }
}
