package com.task.Springproj.LibraryProj.repository;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.task.Springproj.LibraryProj.model.Book;

@Repository
public class BookRepository {
	
	 private List<Book> books = new ArrayList<>();

	    public void save(Book book) {
	        books.add(book);
	    }

	    public List<Book> findAll() {
	        return books;
	    }

	    public Book findById(int id) {
	        for (Book book : books) {
	            if (book.getId() == id) {
	                return book;
	            }
	        }
	        return null;
	    }

}
