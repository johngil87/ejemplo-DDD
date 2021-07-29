package co.com.bancolombia.usecase.user;

import co.com.bancolombia.model.user.Rate;
import co.com.bancolombia.model.user.User;
import co.com.bancolombia.model.user.gateways.UserRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RateMovieUseCase {

    private final UserRepository repository;

    public User execute(String userId, Rate rate){

        return null;
    }
}
