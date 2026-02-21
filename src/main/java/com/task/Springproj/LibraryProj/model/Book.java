package com.task.Springproj.LibraryProj.model;

public class Book {
	
	 private int id;
	    private String title;
	    private boolean available = true;

	    public Book(int id, String title) {
	        this.id = id;
	        this.title = title;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public boolean isAvailable() {
	        return available;
	    }

	    public void setAvailable(boolean available) {
	        this.available = available;
	    }

	    @Override
	    public String toString() {
	        return "Book [id=" + id + ", title=" + title + ", available=" + available + "]";
	    }

}
