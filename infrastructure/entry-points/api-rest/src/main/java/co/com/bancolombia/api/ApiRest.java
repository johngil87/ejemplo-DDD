package co.com.bancolombia.api;
import co.com.bancolombia.model.movie.Movie;
import co.com.bancolombia.model.user.User;
import co.com.bancolombia.usecase.movie.CrearMovieUseCase;
import co.com.bancolombia.usecase.movie.ObtenerMoviePorIdUseCase;
import co.com.bancolombia.usecase.movie.ObtenerMoviesUseCase;
import co.com.bancolombia.usecase.movie.ObtenerTopMoviesUseCase;
import co.com.bancolombia.usecase.user.AddFavoritesMovieUseCase;
import co.com.bancolombia.usecase.user.CreateUserUseCase;
import co.com.bancolombia.usecase.user.RemoveMovieFavoritesUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {

    private final CrearMovieUseCase createMovieUseCase;
    private final ObtenerMoviesUseCase obtenerMoviesUseCase;
    private final ObtenerMoviePorIdUseCase moviePorIdUseCase;
    private final CreateUserUseCase createUserUseCase;
    private final AddFavoritesMovieUseCase addFavoritesMovieUseCase;
    private final RemoveMovieFavoritesUseCase removeMovieFavoritesUseCase;
    private final ObtenerTopMoviesUseCase obtenerTopMoviesUseCase;
    private final MovieMapper movieMapper;
    private final UserMapper userMapper;

    @PostMapping(path = "/createmovie")
    public MovieDTO createMovie(@RequestBody MovieDTO movieDto) {
        Movie movie = movieMapper.dtoToMovie(movieDto);
        return movieMapper.movieToDto(createMovieUseCase.execute(movie));
    }

    @GetMapping(path = "/listmovies")
    public List<MovieDTO> listarMovies(){
        List<Movie> list = obtenerMoviesUseCase.execute();
        return movieMapper.listMovieToDto(list);
    }

    @GetMapping(path = "/movie/{id}")
    public MovieDTO obtenerMovie(@PathVariable("id") String id){
        return movieMapper.movieToDto(moviePorIdUseCase.obtenerMovie(id));
    }

    @PostMapping(path = "/usercreate")
    public UserDTO crearUser(@RequestBody UserDTO userDTO){
        User user = userMapper.dtoToUser(userDTO);
        return userMapper.userToDto(createUserUseCase.execute(user));
    }

    @PutMapping(path = "/addfavorite/{idUser}/{idMovie}")
    public ResponseEntity<UserDTO> addFavoriteMovie(@PathVariable("idUser") String idUser, @PathVariable("idMovie") String idMovie){
        try {
            User user = addFavoritesMovieUseCase.execute(idUser, idMovie);
            return new ResponseEntity<>(userMapper.userToDto(user), HttpStatus.OK);
        }catch (Exception ex){
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }

    @PutMapping(path = "/removefavorite/{idUser}/{idMovie}")
    public ResponseEntity<UserDTO> removeFavoriteMovie(@PathVariable("idUser") String idUser, @PathVariable("idMovie") String idMovie){
        try {
            User user = removeMovieFavoritesUseCase.execute(idUser, idMovie);
            return new ResponseEntity<>(userMapper.userToDto(user), HttpStatus.OK);
        }catch (Exception ex){
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }

    @GetMapping(path = "/listtopmovies")
    public List<MovieDTO> listarTopMovies(){
        List<Movie> list = obtenerTopMoviesUseCase.execute();
        return movieMapper.listMovieToDto(list);
    }
}
