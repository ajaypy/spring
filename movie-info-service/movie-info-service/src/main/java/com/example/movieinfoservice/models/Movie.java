package com.example.movieinfoservice.models;

public class Movie {

	public Movie(String movieId, String name) {
		
		this.movieId = movieId;
		this.name = name;
	}
	private String movieId;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
}
