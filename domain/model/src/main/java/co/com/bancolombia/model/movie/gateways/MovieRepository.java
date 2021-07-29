package co.com.bancolombia.model.movie.gateways;

import co.com.bancolombia.model.movie.Movie;
import co.com.bancolombia.model.movie.values.CategoryId;

import java.util.List;

public interface MovieRepository {


    List<Movie> findAllMovie();

    List<Movie> findAllMovieTop();

    Movie findMovieById(String id);

    Movie findByCategory(CategoryId id);

    Movie save(Movie movie);
}
