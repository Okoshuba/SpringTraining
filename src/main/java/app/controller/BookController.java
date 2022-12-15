package app.controller;

import app.helpers.BookNotFoundException;
import app.model.Book;
import app.repo.BookRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("books")
public class BookController {

    private final BookRepository repository;

    BookController(BookRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Book> getAll(){
        return repository.findAll();
    }

    @GetMapping("{id}")
    public Book getBook(@PathVariable long id) {
        return repository.findById(id).orElseThrow(() -> new BookNotFoundException(id));
    }

    @PostMapping
    public Book createNewBook(@RequestBody Book newBook){
        return repository.save(newBook);
    }

}
