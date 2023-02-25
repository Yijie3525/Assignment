package com.example;

import com.example.bean.Customer;
import com.example.bean.Movie;


public class LoggerIntercpetorImpl implements LoggerInterceptor{
    @Override
    public String setCustomer(Customer customer) {
        System.out.println("login" + customer.toString());
        return customer.getName();
    }

    @Override
    public Movie setMovie(Movie movie) {
        System.out.println( "renting movie" +movie.toString());
        movie.setFrequentRentPoint(movie.getFrequentRentPoint());
        return movie;
    }


}
 