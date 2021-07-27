package co.com.bancolombia.api;

import co.com.bancolombia.model.movie.Movie;
import co.com.bancolombia.model.movie.values.Nombre;
import co.com.bancolombia.model.movie.values.Puntaje;
import org.springframework.stereotype.Component;

@Component
public class MovieMapper {

    public MovieDTO movieToDto(Movie movie){
        return new MovieDTO(
                movie.getId(),
                movie.getTitleMovie().getTitulo(),
                movie.getPuntaje().getPuntaje(),
                movie.getDirector(),
                movie.getCharacter(),
                movie.getCategory());
    }

    public Movie dtoToMovie(MovieDTO dto){
        Nombre nombre = new Nombre(dto.getNombre());
        Puntaje puntaje = new Puntaje(dto.getPuntaje());
        return new Movie(
                dto.getId(),
                dto.getMovieDirector(),
                dto.getCategoria(),
                dto.getActores(),
                nombre,
                puntaje);
    }
}


