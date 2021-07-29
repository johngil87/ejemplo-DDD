package co.com.bancolombia.usecase.user;

import co.com.bancolombia.model.user.User;
import co.com.bancolombia.model.user.gateways.UserRepository;
import lombok.RequiredArgsConstructor;

import java.util.HashSet;

@RequiredArgsConstructor
public class AddFavoritesMovieUseCase {

    private final UserRepository repository;

    public User execute(String idUser, String idMovie){
        User user = repository.findUserById(idUser);
        if(user.getIdFavorites() == null){
            user.setIdFavorites(new HashSet<>());
        }
        user.addFavorites(idMovie);
        return repository.addFavorites(user);
    }
}
