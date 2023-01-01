package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.domain.Book;

/**
 * @program: SpringBoot2
 * @description:
 * @author: lzy
 * @create: 2022-12-29 17:37
 **/

public interface IBookService extends IService<Book> {

    boolean saveBook(Book book);

    boolean modify(Book book);

    boolean delete(Integer id);

    IPage<Book> getPage(Integer currentPage, Integer pageSize,Book book);

}
