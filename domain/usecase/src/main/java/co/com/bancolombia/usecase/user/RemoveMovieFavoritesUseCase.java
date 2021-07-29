package co.com.bancolombia.usecase.user;

import co.com.bancolombia.model.user.User;
import co.com.bancolombia.model.user.gateways.UserRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RemoveMovieFavoritesUseCase {

    private final UserRepository repository;

    public User execute(String idUser, String idMovie){
        User user = repository.findUserById(idUser);
        if(user == null){
            throw new IllegalArgumentException("no existe usuario");
        }
        user.removeFavorites(idMovie);
        return repository.addFavorites(user);
    }
}
