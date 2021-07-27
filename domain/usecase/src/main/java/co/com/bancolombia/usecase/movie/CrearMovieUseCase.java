package co.com.bancolombia.usecase.movie;


import co.com.bancolombia.model.movie.Movie;
import co.com.bancolombia.model.movie.gateways.MovieRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CrearMovieUseCase {

    private final MovieRepository repository;

    public Movie execute(Movie movie){
       return repository.save(movie);
    }
}
