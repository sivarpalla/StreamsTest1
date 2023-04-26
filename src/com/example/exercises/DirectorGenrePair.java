package com.example.exercises;

import java.util.List;

import com.example.domain.Director;
import com.example.domain.Genre;

/**
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 */
public class DirectorGenrePair{ 
	
	private Director director;
	private Genre genre;
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "DirectorGenrePair [director=" + director + ", genre=" + genre + "]";
	}
	public DirectorGenrePair(Director director, Genre genre) {
		super();
		this.director = director;
		this.genre = genre;
	}
	public DirectorGenrePair() {
		super();
	}
	
}
