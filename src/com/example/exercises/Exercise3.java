package com.example.exercises;

import java.util.Collection;
import java.util.stream.Collectors;

import com.example.service.InMemoryMovieService;
import com.example.service.MovieService;

/**
 * 
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
public class Exercise3 {
	private static final MovieService movieService = InMemoryMovieService.getInstance();

	public static void main(String[] args) {
		// Find the number of genres of each director's movies
		var directorGenreNumbers = 
		movieService.findAllMovies()
		            .stream()
		            .map( movie -> movie.getDirectors().stream().map(director -> new DirectorGenresPair(director,movie.getGenres())).collect(Collectors.toList()))
		            .flatMap(Collection::stream)
		            .map( directorGenres -> directorGenres.getGenres().stream().map( genre -> new DirectorGenrePair(directorGenres.getDirector(),genre)).collect(Collectors.toList()))
		            .flatMap(Collection::stream)
		            .collect(Collectors.groupingBy(DirectorGenrePair::getDirector,Collectors.groupingBy(DirectorGenrePair::getGenre,Collectors.counting())));
		directorGenreNumbers.forEach((director,genreCounts)->{
			System.out.printf("%s\n",director.getName());
			genreCounts.forEach( (genre,count) -> System.out.printf("\t%s: %s\n",genre.getName(),count));
		});
		
	}

}