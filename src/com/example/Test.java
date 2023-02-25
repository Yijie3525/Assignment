package com.example;


import com.example.bean.Customer;
import com.example.bean.Movie;
import com.example.bean.extend.ChildrenPrice;
import com.example.bean.extend.NewReleasePrice;
import com.example.bean.extend.RegularPrice;


public class Test {
    public static void main(String[] args) {
        MovieRentalApplication movieRentalApplication = new MovieRentalApplication();
        LoggerIntercpetorImpl loggerIntercpetor = new LoggerIntercpetorImpl();
        InfoDispatcher infoDispatcher = new InfoDispatcher(loggerIntercpetor);
        ContextObject contextObject = new ContextObject(infoDispatcher);
        movieRentalApplication.setContentObject(contextObject);



        Customer customer = new  Customer("Joe");
        contextObject.add(customer);
        //print add customer from info dispatcher
        Movie movie1 = new Movie("movie1",3,new NewReleasePrice());
        Movie movie2 = new Movie("movie2",4,new ChildrenPrice());
        Movie movie3 = new Movie("movie3",5,new RegularPrice());
        contextObject.add(movie1);
        contextObject.add(movie2);
        contextObject.add(movie3);
        movieRentalApplication.statement();












    }
}
 