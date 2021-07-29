package co.com.bancolombia.model.user.values;

import java.util.Objects;

public class Correo {

    private final String correo;

    public Correo(String correo) {
        this.correo = Objects.requireNonNull(correo, "El correo es obligatorio");
        correoIsBlank(correo.isBlank(), "El correo no puede estar vacio");
        if(!correo.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
            throw new IllegalArgumentException("Coreo no valido");
        }
        if(this.correo.length() <= 5) {
            throw new IllegalArgumentException("Debe contener mas de 5 caracteres");
        }
    }

    private void correoIsBlank(boolean blank, String s) {
        if (blank) {
            throw new IllegalArgumentException(s);
        }
    }

    public String getCorreo() {
        return correo;
    }
}
