package co.com.bancolombia.usecase.movie;

import co.com.bancolombia.model.movie.Movie;
import co.com.bancolombia.model.movie.gateways.MovieRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ObtenerMoviePorIdUseCase {

    private  final MovieRepository repository;

    public Movie obtenerMovie(String id){
        return repository.findMovieById(id);
    }

}
