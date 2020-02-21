package cn.vue.service;

import cn.vue.entity.Book;
import org.springframework.data.domain.Page;



public interface BookService {


    /**
     *
     * @param pageNum 0开始
     * @param pageSize 每页几个
     *                 totalElements 总记录数
     *                 totalPages 总页数
     *                 size 页数
     *                 numberOfElement
     * @return
     */
    Page<Book> findAll(Integer pageNum, Integer pageSize);


    /**
     * 新增和修改用同一种方法
     * @param book
     * @return
     */
    Book addBook(Book book);






}
