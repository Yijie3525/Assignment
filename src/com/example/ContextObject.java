package com.example;

import com.example.bean.Customer;
import com.example.bean.Movie;

import java.util.ArrayList;
import java.util.List;


public class ContextObject {
    InfoDispatcher infoDispatcher;
    int frequentRentPoint = 0;
    List<Movie> movies;
    Customer customer;
    double charge;
    public ContextObject(InfoDispatcher infoDispatcher) {
        this.infoDispatcher = infoDispatcher;
    }

    public Customer add(Customer customer) {
        customer = infoDispatcher.setCustomer(customer);
        this.customer = customer;
        return customer;
    }

    public void add(Movie movie) {
        movie = infoDispatcher.setMovie(movie);
        frequentRentPoint += movie.getFrequentRentPoint();
        charge += movie.getCharge();
        if (movies == null){
            movies = new ArrayList<>();
            movies.add(movie);
        }else {
            movies.add(movie);
        }


    }
}
 