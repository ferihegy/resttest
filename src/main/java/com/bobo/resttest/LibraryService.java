package com.bobo.resttest;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@LocalBean
@Path("/library")
public class LibraryService {

    @GET
    @Path("available-books")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Book> getAvailableBooks() {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("Java The Complete Reference, 8th Edition", "Herbert Schildt", 479));
        books.add(new Book("Jboss As 7 Configuration, Deployment, And Administration", "Francesco Marchioni", 450));
        books.add(new Book("RESTful Java with JAX-RS 2.0 2ed", "Bill Burke", 2018));
        return books;
    }
}