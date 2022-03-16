package com.example.obg.model;


import javax.persistence.*;

@Entity
public class Movie {

  @Id
  @Column(name="movieID")
  private int movieID;
  private String movieName;
  private int movieLength;
  private String description;
  private String genre;
  private String pgRating;
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

  public int getMovieLength() {
    return movieLength;
  }

  public void setMovieLength(int movielength) {
    this.movieLength = movielength;
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

  public String getPgRating() {
    return pgRating;
  }

  public void setPgRating(String PGrating) {
    this.pgRating = PGrating;
  }

  public int getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(int releaseDate) {
    this.releaseDate = releaseDate;
  }

  @Override
  public String toString() {
    return "Movie{" +
            "movieID=" + movieID +
            ", movieName='" + movieName + '\'' +
            ", movieLength=" + movieLength +
            ", description='" + description + '\'' +
            ", genre='" + genre + '\'' +
            ", pgRating='" + pgRating + '\'' +
            ", releaseDate=" + releaseDate +
            '}';
  }
}


