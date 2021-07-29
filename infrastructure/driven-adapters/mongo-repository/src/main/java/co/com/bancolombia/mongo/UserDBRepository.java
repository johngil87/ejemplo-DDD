package co.com.bancolombia.mongo;

import co.com.bancolombia.model.user.values.Correo;
import co.com.bancolombia.mongo.entities.MovieEntity;
import co.com.bancolombia.mongo.entities.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface UserDBRepository extends MongoRepository<UserEntity, String>, QueryByExampleExecutor<UserEntity> {
    UserEntity findUserEntityByCorreo(String correo);
}
