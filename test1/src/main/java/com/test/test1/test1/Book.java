package com.test.test1.test1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String name;
    private String author;
    private String isbn;

    protected Book() {}

    public Book(String name, String author,String isbn) {
        //this.id=id;
        this.name = name;
        this.author = author;
        this.isbn=isbn;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, name='%s', author='%s',isbn='%s']",
                id, name, author,isbn);
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getIsbn(){
        return this.isbn;
    }


}
