package co.com.bancolombia.api;

import co.com.bancolombia.model.user.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserDTO userToDto(User user){
        return new UserDTO(
                user.getId(),
                user.getNombre(),
                user.getCorreo(),
                user.getImage(),
                user.getIdFavorites(),
                user.getRate()
        );
    }

    public User dtoToUser(UserDTO dto){
        return new User(
                dto.getId(),
                dto.getUserName(),
                dto.getUserEmail(),
                dto.getUserImage(),
                dto.getIdFavorites(),
                dto.getRate()
        );
    }
}
