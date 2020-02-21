package cn.vue.repository;

import cn.vue.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookRepositoryTest {

    @Autowired
    BookRepository bookRepository;


    @Test
    void find() {
        List<Book> books = bookRepository.findAll();
        for (Book book : books) {
            System.out.println(book);
        }
    }

    @Test
    void pageAbleTest() {
        PageRequest pageRequest = PageRequest.of(0, 3);
        Page<Book> books = bookRepository.findAll(pageRequest);
        int totalPages = books.getTotalPages();
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println(totalPages);
    }


    @Test
    void addTest() {
        Book book = new Book();
        //book.setId(17);
        book.setName("霍乱时期的爱情");
        Book save = bookRepository.save(book);
        System.out.println(save);
    }

    @Test
    void update() {
        Book book = bookRepository.findById(132).get();
        book.setName("222");
        book.setId(132);
        Book save = bookRepository.save(book);
        System.out.println(save);
    }

    @Test
    void deleTest() {
        bookRepository.deleteById(131);
    }
}