package co.com.bancolombia.api;
import co.com.bancolombia.model.movie.Movie;
import co.com.bancolombia.usecase.movie.CrearMovieUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {

    private final CrearMovieUseCase createMovieUseCase;
    private final MovieMapper movieMapper;

    @PostMapping(path = "/crearmovie")
    public MovieDTO createMovie(@RequestBody MovieDTO movieDto) {
        Movie movie = movieMapper.dtoToMovie(movieDto);
        return movieMapper.movieToDto(createMovieUseCase.execute(movie));
    }
}
