package co.com.bancolombia.usecase.movie;

import co.com.bancolombia.model.movie.Movie;
import co.com.bancolombia.model.movie.gateways.MovieRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
@RequiredArgsConstructor
public class ObtenerTopMoviesUseCase {

    private final MovieRepository repository;

    public List<Movie> execute(){
        return repository.findAllMovieTop();
    }
}
