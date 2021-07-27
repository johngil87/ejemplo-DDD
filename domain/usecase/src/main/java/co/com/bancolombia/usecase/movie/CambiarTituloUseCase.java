package co.com.bancolombia.usecase.movie;

import co.com.bancolombia.model.movie.Movie;
import co.com.bancolombia.model.movie.gateways.MovieRepository;
import co.com.bancolombia.model.movie.values.Nombre;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CambiarTituloUseCase {

    private final MovieRepository repository;

    public Movie execute(String id, Nombre nombre){
        Movie movie = repository.findMovieById(id);
        movie.cambiarTitulo(nombre);
        return repository.save(movie);
    }


}
