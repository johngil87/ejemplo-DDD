package co.com.bancolombia.config;

import co.com.bancolombia.model.movie.gateways.MovieRepository;
import co.com.bancolombia.usecase.movie.CrearMovieUseCase;
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
}
