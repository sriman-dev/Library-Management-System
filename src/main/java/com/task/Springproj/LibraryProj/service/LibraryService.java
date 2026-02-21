package com.task.Springproj.LibraryProj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.Springproj.LibraryProj.model.Book;

@Service
public class LibraryService {

    @Autowired
    private BookService bookService;

    public void borrowBook(int bookId) {
        Book book = bookService.getBookById(bookId);
        if (book != null && book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book not available");
        }
    }

    public void returnBook(int bookId) {
        Book book = bookService.getBookById(bookId);
        if (book != null && !book.isAvailable()) {
            book.setAvailable(true);
            System.out.println("Book returned successfully");
        } else {
            System.out.println("Invalid return operation");
        }
    }
}

