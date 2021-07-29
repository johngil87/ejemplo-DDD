package co.com.bancolombia.usecase.movie;

import co.com.bancolombia.model.movie.Category;
import co.com.bancolombia.model.movie.Character;
import co.com.bancolombia.model.movie.Director;
import co.com.bancolombia.model.movie.Movie;
import co.com.bancolombia.model.movie.gateways.MovieRepository;
import co.com.bancolombia.model.movie.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


import java.util.HashSet;
import java.util.Set;

import static org.mockito.ArgumentMatchers.any;


 class CreateMovieUseCaseTest {


    private MovieRepository repository;
    private CrearMovieUseCase useCase;

    @BeforeEach
    public void setup(){
        repository = mock(MovieRepository.class);
        useCase = new CrearMovieUseCase(repository);
    }


    @Test
     void createMovieTest(){

        Director director = new Director("pedro");
        Category category = new Category( new Nombre("juan"));
        Set<Character> character = new HashSet<>();
        Character character1 = new Character(new Nombre("manuel"));
        Character character2 = new Character( new Nombre("manuel"));
        character.add(character1);
        character.add(character2);
        Nombre titleMovie = new Nombre("el capo");
        Puntaje puntaje = new Puntaje(5.0);

        Movie movie = new Movie("jose",director, category,character,titleMovie,puntaje);

        when(repository.save(any())).thenReturn(movie);
        Movie result = useCase.execute(movie);

        Assertions.assertEquals("el capo", result.getTitleMovie().getNombre());

    }

}
