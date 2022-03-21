package com.example.obg.repository;

import com.example.obg.model.Showing;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ShowingRepository extends  JpaRepository<Showing, Integer>{
    //List<Showing> findByShowing_date(Date date);
}
