package com.example.obg.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
public class Showing {

    @Id
    @Column(name="showingID")
    private int showingID;

    @Column(name="showing_date")
    private Date showing_date;

    @Column(name="showing_time")
    private Time showing_time;


    @ManyToOne
    @JoinColumn(name = "movieID")
    private Movie movie;

    public Date getShowing_date() {
        return showing_date;
    }

    public void setShowing_date(Date showing_Date) {
        this.showing_date = showing_Date;
    }

    public Time getShowing_time() {
        return showing_time;
    }

    public void setShowing_time(Time showing_time) {
        this.showing_time = showing_time;
    }

    public int getShowingID() {
        return showingID;
    }

    public void setShowingID(int showingID) {
        this.showingID = showingID;
    }


    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
