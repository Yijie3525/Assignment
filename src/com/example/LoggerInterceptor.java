package com.example;

import com.example.bean.Customer;
import com.example.bean.Movie;

public interface LoggerInterceptor {
    public String setCustomer(Customer customer);
    public Movie setMovie(Movie movie);

}
