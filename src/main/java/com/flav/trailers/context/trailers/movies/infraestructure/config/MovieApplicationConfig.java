package com.flav.trailers.context.trailers.movies.infraestructure.config;

import com.flav.trailers.context.trailers.movies.application.CreateMovieUseCase;
import com.flav.trailers.context.trailers.movies.application.FindAllMovieUseCase;
import com.flav.trailers.context.trailers.movies.application.FindByIdMovieUseCase;
import com.flav.trailers.context.trailers.movies.domain.repositories.IMovieCRUDRepository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MovieApplicationConfig {

    @Bean
    public FindAllMovieUseCase findAllMovieUseCase(IMovieCRUDRepository repo) {
        return new FindAllMovieUseCase(repo);
    }

    @Bean
    public FindByIdMovieUseCase findByIdMovieUseCase(IMovieCRUDRepository repo) {
        return new FindByIdMovieUseCase(repo);
    }

    @Bean
    public CreateMovieUseCase createMovieUseCase(IMovieCRUDRepository repo) {
        return new CreateMovieUseCase(repo);
    }

}
