package co.com.bancolombia.config;

import co.com.bancolombia.model.movie.gateways.MovieRepository;
import co.com.bancolombia.model.user.gateways.UserRepository;
import co.com.bancolombia.usecase.movie.CrearMovieUseCase;
import co.com.bancolombia.usecase.movie.ObtenerMoviesUseCase;
import co.com.bancolombia.usecase.movie.ObtenerTopMoviesUseCase;
import co.com.bancolombia.usecase.user.CreateUserUseCase;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "co.com.bancolombia.usecase",
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.REGEX, pattern = "^.+UseCase$")
        },
        useDefaultFilters = false)
public class UseCasesConfig {

        public CrearMovieUseCase crearMovieUseCase(MovieRepository repository){
                return new CrearMovieUseCase(repository);
        }

        public ObtenerMoviesUseCase obtenerMoviesUseCase(MovieRepository repository){
                return new ObtenerMoviesUseCase(repository);
        }

        public CreateUserUseCase crearUserUseCase(UserRepository repository){
                return new CreateUserUseCase(repository);
        }

        public ObtenerTopMoviesUseCase obtenerTopMoviesUseCase(MovieRepository repository){
                return new ObtenerTopMoviesUseCase(repository);
        }
}
