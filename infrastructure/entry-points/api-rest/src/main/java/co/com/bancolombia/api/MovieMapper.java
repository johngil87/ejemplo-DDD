package co.com.bancolombia.api;

import co.com.bancolombia.model.movie.Movie;
import co.com.bancolombia.model.movie.values.Nombre;
import co.com.bancolombia.model.movie.values.Puntaje;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MovieMapper {

    public MovieDTO movieToDto(Movie movie){
        return new MovieDTO(
                movie.getId(),
                movie.getTitleMovie().getNombre(),
                movie.getPuntaje().getPuntaje(),
                movie.getDirector(),
                movie.getCharacter(),
                movie.getCategory(),
                movie.getUrlTrailer(),
                movie.getUrlImage(),
                movie.getPlot());
    }

    public Movie dtoToMovie(MovieDTO dto){
        Nombre nombre = new Nombre(dto.getTitle());
        Puntaje puntaje = new Puntaje(dto.getRate());
        return new Movie(
                dto.getId(),
                dto.getMovieDirector(),
                dto.getCategory(),
                dto.getCharacters(),
                nombre,
                puntaje,
                dto.getUrlTrailer(),
                dto.getUrlImage(),
                dto.getPlot());
    }

    public List<MovieDTO> listMovieToDto(List<Movie> list){
        List<MovieDTO> listDto = new ArrayList<>();
        list.forEach(it->
                listDto.add(movieToDto(it)));
        return listDto;
    }
}


