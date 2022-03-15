package com.example.obg.config;

import com.example.obg.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class InitData {

  @Autowired
  MovieRepository movieRepository;
}
