package co.com.bancolombia.mongo;

import co.com.bancolombia.model.movie.Movie;
import co.com.bancolombia.model.movie.gateways.MovieRepository;
import co.com.bancolombia.model.movie.values.CategoryId;
import co.com.bancolombia.mongo.entities.MovieEntity;
import co.com.bancolombia.mongo.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieRepositoryAdapter extends AdapterOperations<MovieEntity, MovieEntity, String, MovieDBRepository> implements MovieRepository {

    public MovieRepositoryAdapter(MovieDBRepository repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, MovieEntity.class));
    }

    @Override
    public List<Movie> findAllMovie() {
        return null;
    }


    @Override
    public Movie findMovieById(String id) {
        return null;
    }

    @Override
    public Movie findByCategory(CategoryId id) {
        return null;
    }

    @Override
    public Movie save(Movie movie) {
        MovieEntity movieE = new MovieEntity(movie.getTitleMovie().getTitulo(), movie.getCharacter(), movie.getDirector(), movie.getPuntaje().getPuntaje(), movie.getCategory());
        MovieEntity newMovieEntity = this.repository.save(movieE);
        Movie movieA = movie;
        movieA.setId(newMovieEntity.getId());
        return movieA;
    }
}
