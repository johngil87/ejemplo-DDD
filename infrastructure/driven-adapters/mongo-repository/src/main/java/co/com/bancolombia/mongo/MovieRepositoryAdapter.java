package co.com.bancolombia.mongo;

import co.com.bancolombia.model.movie.Movie;
import co.com.bancolombia.model.movie.gateways.MovieRepository;
import co.com.bancolombia.model.movie.values.CategoryId;
import co.com.bancolombia.model.movie.values.Nombre;
import co.com.bancolombia.model.movie.values.Puntaje;
import co.com.bancolombia.mongo.entities.MovieEntity;
import co.com.bancolombia.mongo.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        List<Movie> movieList = new ArrayList<>();
        List<MovieEntity> list = this.repository.findAll();
        Movie movie;
        for (int i=0; i<list.size(); i++ ){
            movie = new Movie(list.get(i).getId(), list.get(i).getDirector(), list.get(i).getCategoria(), list.get(i).getCharacters(),new Nombre(list.get(i).getTitulo()), new Puntaje(list.get(i).getPuntaje()));
            movieList.add(movie);
        }
        return movieList;
    }

    @Override
    public List<Movie> findAllMovieTop() {
        List<Movie> movieList = new ArrayList<>();
        List<MovieEntity> list = this.repository.findByPuntajeGreaterThanOrderByPuntajeDesc(4.5);
        Movie movie;
        for (int i=0; i<list.size(); i++ ){
            movie = new Movie(list.get(i).getId(), list.get(i).getDirector(), list.get(i).getCategoria(), list.get(i).getCharacters(),new Nombre(list.get(i).getTitulo()), new Puntaje(list.get(i).getPuntaje()));
            movieList.add(movie);
        }
        return movieList;
    }


    @Override
    public Movie findMovieById(String id) {
        Optional<MovieEntity> entity =  this.repository.findById(id);
        return new Movie(entity.get().getId(), entity.get().getDirector(), entity.get().getCategoria(),entity.get().getCharacters(), new Nombre(entity.get().getTitulo()), new Puntaje(entity.get().getPuntaje()));
    }

    @Override
    public Movie findByCategory(CategoryId id) {
        return null;
    }

    @Override
    public Movie save(Movie movie) {
        MovieEntity movieE = new MovieEntity(movie.getTitleMovie().getNombre(), movie.getCharacter(), movie.getDirector(), movie.getPuntaje().getPuntaje(), movie.getCategory());
        MovieEntity newMovieEntity = this.repository.save(movieE);
        Movie movieA = movie;
        movieA.setId(newMovieEntity.getId());
        return movieA;
    }
}
