package co.com.bancolombia.mongo;

import co.com.bancolombia.mongo.entities.MovieEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import java.util.List;

public interface MovieDBRepository extends MongoRepository<MovieEntity, String> , QueryByExampleExecutor<MovieEntity> {
    List<MovieEntity> findByPuntajeGreaterThanOrderByPuntajeDesc(Double puntaje);
}
