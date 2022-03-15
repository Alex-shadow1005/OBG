package com.example.obg.controller;

import com.example.obg.model.Movie;
import com.example.obg.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class MovieRESTController {

  @Autowired
  MovieRepository movieRepository;

  @GetMapping("/movies")
  public List<Movie> getAllMovies() {
    return movieRepository.findAll();
  }

  @GetMapping("/movie/{id}")
  public Movie findMovieById(@PathVariable String id) {
    Optional<Movie> obj = movieRepository.findById(id);
    if (obj.isPresent()) {
      return obj.get();
    } else {
      return null;
    }

  }

  @PostMapping("/movie")
  @ResponseStatus(HttpStatus.CREATED)
  public Movie postMovie(@RequestBody Movie movie) {
    System.out.println(movie);
    return movieRepository.save(movie);
  }

  @PutMapping("/movie/{id}")
  public ResponseEntity<Movie> updateCount(@PathVariable String id, @RequestBody Movie movie) {
    Optional<Movie> optCounty = movieRepository.findById(id);
    if (optCounty.isPresent()) {
      movieRepository.save(movie);
      return new ResponseEntity<Movie>(movie,HttpStatus.OK);
    } else {
      Movie notfoundMovie = new Movie();
      notfoundMovie.setMovieName("Jeg kunne ikke finde id=" + id);
      return new ResponseEntity<Movie>(notfoundMovie, HttpStatus.NOT_FOUND);
    }
  }

  @DeleteMapping("/movie/{id}")
  public ResponseEntity<String> deleteMovie(@PathVariable String id) {
    try {
      movieRepository.deleteById(id);
      return new ResponseEntity<>("Slettet id=" + id, HttpStatus.OK);
    } catch (Exception err){
      return new ResponseEntity<>("Jeg kunnne ikke slet id=" + id, HttpStatus.NOT_FOUND);
    }

  }


}
