package com.task.Springproj.LibraryProj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.Springproj.LibraryProj.model.Book;
import com.task.Springproj.LibraryProj.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(int id) {
        return bookRepository.findById(id);
    }
}

