package co.com.bancolombia.usecase.movie;

import co.com.bancolombia.model.movie.Director;
import co.com.bancolombia.model.movie.Movie;
import co.com.bancolombia.model.movie.gateways.MovieRepository;

public class CambiarDirectorUseCase {

    private MovieRepository repository;

    public Movie execute(String id,Director director){
        Movie movie = repository.findMovieById(id);
        movie.cambiarDirector(director);
        return repository.save(movie);
    }


}
