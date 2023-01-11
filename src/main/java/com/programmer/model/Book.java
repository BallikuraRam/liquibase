package com.programmer.model;


import com.programmer.model.Author;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {

     @Id  @Column(name = "id", nullable = false, unique = true)
     int id ;
     @Column(name = "name", nullable = false, unique = true)
     String name ;
     @OneToOne(cascade = CascadeType.ALL)
     @JoinColumn(name = "author")
     Author author ;

     public Author getAuthor() {
          return author;
     }

     public void setAuthor(Author author) {
          this.author = author;
     }

     public Book() {
     }

     public Book(int id, String name, Author author) {
          this.id = id;
          this.name = name;
          this.author = author;
     }

}
