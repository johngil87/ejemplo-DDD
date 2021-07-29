package co.com.bancolombia.model.user.gateways;

import co.com.bancolombia.model.user.User;

public interface UserRepository {

    User loginUser(User user);

    User findUserById(String id);

    User saveUser(User user);

    User addFavorites(User user);
}
