package co.com.bancolombia.usecase.movie;

import co.com.bancolombia.model.movie.Movie;
import co.com.bancolombia.model.movie.gateways.MovieRepository;
import co.com.bancolombia.model.movie.values.Puntaje;

public class CambiarPuntajeUseCase {

    private MovieRepository repository;

    public Movie execute(String id,Puntaje puntaje){
        Movie movie = repository.findMovieById(id);
        movie.puntaje(puntaje);
        return repository.save(movie);
    }
}
