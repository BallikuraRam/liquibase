package com.programmer.api;

import com.programmer.model.Book;
import com.programmer.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class BookController {

    private final BookRepository bookRepository ;

    @PostMapping
    public Book addBookWithAuthor(@RequestBody Book book)
    {
        return bookRepository.save(book);
    }
    @GetMapping("/getbooks")
    public List<Book> getAllBooksWithAuthors()
    {
        List<Book> books = bookRepository.findAll();
        return books ;
    }
}
