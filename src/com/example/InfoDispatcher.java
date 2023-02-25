package com.example;

import com.example.bean.Customer;
import com.example.bean.Movie;


public class InfoDispatcher {
    LoggerInterceptor loggerInterceptor;
    public InfoDispatcher(LoggerIntercpetorImpl loggerInterceptor) {
        this.loggerInterceptor =
                loggerInterceptor;
    }

    public Customer setCustomer(Customer customer) {
        //check wether customer exist
        if(customer.getName() == "Joe"){
            loggerInterceptor.setCustomer(customer);
            return customer;
        }

        return null;

    }
    public Movie setMovie(Movie movie){
            loggerInterceptor.setMovie(movie);
            return movie;


    }
}
 