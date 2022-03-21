package com.example.obg.model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Movie {

  @Id
  @Column(name="movieID")
  private int movieID;
  private String movie_name;
  private int movie_length;
  private String description;
  private String genre;
  private String pg_rating;
  private int release_date;

  @OneToMany
  @JoinColumn(name="movieID")
  Set<Showing> showings = new HashSet<>();

  public Set<Showing> getShowings() {
    return showings;
  }

  public void setShowings(Set<Showing> showings) {
    this.showings = showings;
  }



  public int getMovieID() {
    return movieID;
  }

  public void setMovieID(int movieID) {
    this.movieID = movieID;
  }

  public String getMovie_name() {
    return movie_name;
  }

  public void setMovie_name(String movieName) {
    this.movie_name = movieName;
  }

  public int getMovie_length() {
    return movie_length;
  }

  public void setMovie_length(int movielength) {
    this.movie_length = movielength;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String getPg_rating() {
    return pg_rating;
  }

  public void setPg_rating(String PGrating) {
    this.pg_rating = PGrating;
  }

  public int getRelease_date() {
    return release_date;
  }

  public void setRelease_date(int releaseDate) {
    this.release_date = releaseDate;
  }

  @Override
  public String toString() {
    return "Movie{" +
            "movieID=" + movieID +
            ", movie_name='" + movie_name + '\'' +
            ", movie_length=" + movie_length +
            ", description='" + description + '\'' +
            ", genre='" + genre + '\'' +
            ", pg_rating='" + pg_rating + '\'' +
            ", release_date=" + release_date +
            '}';
  }
}


