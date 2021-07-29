package co.com.bancolombia.model.movie.values;


public class Puntaje {

    private final Double puntaje;


    public Puntaje(Double puntaje) {
        if(puntaje < 0 || puntaje > 5){
            throw new IllegalArgumentException("el puntaje no puede ser superior a 5 o menor a 0");
        }
        this.puntaje = puntaje;
    }

    public Double getPuntaje(){
        return puntaje;
    }
}
