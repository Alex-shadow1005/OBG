package com.example.obg.model;


import javax.persistence.*;

@Entity
public class Movie {

  @Id
  @Column(name="movies")
  private int movieID;
  private String movieName;
  private int movielength;
  private String description;
  private String genre;
  private String PGrating;
  private int releaseDate;


  public int getMovieID() {
    return movieID;
  }

  public void setMovieID(int movieID) {
    this.movieID = movieID;
  }

  public String getMovieName() {
    return movieName;
  }

  public void setMovieName(String movieName) {
    this.movieName = movieName;
  }

  public int getMovielength() {
    return movielength;
  }

  public void setMovielength(int movielength) {
    this.movielength = movielength;
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

  public String getPGrating() {
    return PGrating;
  }

  public void setPGrating(String PGrating) {
    this.PGrating = PGrating;
  }

  public int getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(int releaseDate) {
    this.releaseDate = releaseDate;
  }
}


