package com.trimindtech.training.Home5;

public class Dvd {
     String title;
      double length;


       MovieStatus movieStatus;

    public String getTitle() {
        return title;
    }

    public MovieStatus getMovieStatus() {
        return movieStatus;
    }

    public void setMovieStatus(MovieStatus movieStatus) {
        this.movieStatus = movieStatus;
    }

    @Override
    public String toString() {
        return "Dvd{" +
                "title='" + title + '\'' +
                ", length=" + length +
                ", movieStatus=" + movieStatus +
                '}';
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Dvd(String title, double length) {
        this.title = title;
        this.length = length;
    }
}
