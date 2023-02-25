package com.example;

import com.example.bean.Customer;
import com.example.bean.Movie;

import java.util.List;


public class MovieRentalApplication {

    ContextObject contextObject;

    public void setContentObject(ContextObject contextObject) {
        this.contextObject = contextObject;
    }

    public void statement() {
        System.out.println("=========start statement=========");
        Customer customer = contextObject.customer;
        System.out.println("movie rental app info " +customer.toString());
        List<Movie> movie = contextObject.movies;


        for (Movie movie1 : movie) {
            System.out.println( "Movie Info: "+movie1.getName());
        }
        int frps = contextObject.frequentRentPoint;
        System.out.println("Total FrequentRentalPonits : "+frps);
        System.out.println("=========end statement=========");
        System.out.println("total charge: " + contextObject.charge);
    }
}
 