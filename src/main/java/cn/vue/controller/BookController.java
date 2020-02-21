package cn.vue.controller;

import cn.vue.entity.Book;
import cn.vue.repository.BookRepository;
import cn.vue.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookService bookService;

    @GetMapping("findAll")
    public List<Book> findAll(){
        return bookRepository.findAll();
    }

    @GetMapping("findAllPage/{pageNum}/{pageSize}")
    public Page<Book> findPage(@PathVariable("pageNum") Integer pageNum, @PathVariable("pageSize") Integer pageSize){
        return bookService.findAll(pageNum,pageSize);
    }

    @PostMapping("addBook")
    public String addBook(@RequestBody Book book){
        Book addBook = bookService.addBook(book);
        if (addBook!=null){
            return "success";
        }
        return "fail";
    }

    @GetMapping("findBookById/{id}")
    public Book findBookById( @PathVariable("id") Integer id){
        return bookRepository.findById(id).get();
    }

    @PutMapping("updateBook")
    public String update(@RequestBody Book book){
        Book addBook = bookService.addBook(book);
        if (addBook!=null){
            return "success";
        }
        return "fail";
    }

    @DeleteMapping("deleteBookById/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        bookRepository.deleteById(id);
    }



}
