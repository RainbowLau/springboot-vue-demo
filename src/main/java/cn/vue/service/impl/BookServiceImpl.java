package cn.vue.service.impl;

import cn.vue.entity.Book;
import cn.vue.repository.BookRepository;
import cn.vue.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;


    @Override
    public Page<Book> findAll(Integer pageNum, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNum,pageSize);
        return bookRepository.findAll(pageable);
    }

    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

}
