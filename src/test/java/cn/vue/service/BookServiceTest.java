package cn.vue.service;

import cn.vue.entity.Book;
import cn.vue.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookServiceTest {

    @Autowired
    BookService bookService;

    @Autowired
    BookRepository bookRepository;

    @Test
    void addBook() {
        Book book = bookRepository.findById(132).get();
        book.setName("567");
        bookService.addBook(book);
    }

    @Test
    void updateBook() {
    }
}