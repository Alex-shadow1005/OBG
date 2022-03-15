package com.example.obg.model;


import javax.persistence.*;

@Entity
public class Movie {

  @Id
  @Column(name="movies")
  private int movieID;
  private String movieName;
  private String movielength;
  private String description;
  private String genre;
  private int PGrating;
  private String releaseDate;


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

  public String getMovielength() {
    return movielength;
  }

  public void setMovielength(String movielength) {
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

  public int getPGrating() {
    return PGrating;
  }

  public void setPGrating(int PGrating) {
    this.PGrating = PGrating;
  }

  public String getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  @Override
  public String toString() {
    return "Movie{" +
        "movieID=" + movieID +
        ", movieName='" + movieName + '\'' +
        ", movielength='" + movielength + '\'' +
        ", description='" + description + '\'' +
        ", genre='" + genre + '\'' +
        ", PGrating=" + PGrating +
        ", releaseDate='" + releaseDate + '\'' +
        '}';
  }
}


