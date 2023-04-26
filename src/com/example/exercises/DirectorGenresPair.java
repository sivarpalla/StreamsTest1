package com.example.exercises;

import java.util.List;

import com.example.domain.Director;
import com.example.domain.Genre;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
public class  DirectorGenresPair{ 
	
	private Director director;
	private List<Genre> genres;
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	public List<Genre> getGenres() {
		return genres;
	}
	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}
	@Override
	public String toString() {
		return "DirectorGenresPair [director=" + director + ", genres=" + genres + "]";
	}
	public DirectorGenresPair(Director director, List<Genre> genres) {
		super();
		this.director = director;
		this.genres = genres;
	}
	public DirectorGenresPair() {
		super();
	}
	
}
