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
  private String release_date;
  private String image_link;

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

  public String getRelease_date() {
    return release_date;
  }

  public void setRelease_date(String releaseDate) {
    this.release_date = releaseDate;
  }

  public String getImage_link() {
    return image_link;
  }

  public void setImage_link(String image_link) {
    this.image_link = image_link;
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
            ", image_link='" + image_link + '\'' +
            '}';
  }
}


