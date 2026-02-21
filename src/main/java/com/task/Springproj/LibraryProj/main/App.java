package com.task.Springproj.LibraryProj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.task.Springproj.LibraryProj.config.AppConfig;
import com.task.Springproj.LibraryProj.model.Book;
import com.task.Springproj.LibraryProj.model.User;
import com.task.Springproj.LibraryProj.service.BookService;
import com.task.Springproj.LibraryProj.service.LibraryService;
import com.task.Springproj.LibraryProj.service.UserService;



public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        BookService bookService = context.getBean(BookService.class);
        UserService userService = context.getBean(UserService.class);
        LibraryService libraryService = context.getBean(LibraryService.class);

        
        bookService.addBook(new Book(1, "Spring Core"));
        bookService.addBook(new Book(2, "Java Basics"));

        userService.registerUser(new User(1, "Alice"));

        
        bookService.getAllBooks().forEach(System.out::println);

        
        libraryService.borrowBook(1);
        libraryService.returnBook(1);

        context.close();
    }
}

