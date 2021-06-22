package com.company.task3;

import java.security.PrivilegedExceptionAction;

public class Department {
     private String name;
     private Book[] books;

     public boolean addBook(Book book, int index){
         if (book == null || index < 0 || index >= books.length) return false;

         books[index] = book;
         return true;
     }

     public void showBooks() {
         for (Book book : books) {
             if (book != null) {
                 System.out.println(book);
             }
         }
     }

     public void showInfo() {
         System.out.println("Department's name: " + name + "\nDepartment's books: ");
         showBooks();
     }

     public void findByAuthor(String author) {
         for (Book book : books) {
             if(book != null && book.getAuthor().equals(author)){
                 System.out.println(book);
                 return;
             }
         }
         System.out.println("Book by author " + author + " is absent");
     }

     public int getBooksCount() {
         int count = 0;
         for (Book book : books){
             if (book != null) {
                 count++;
             }
         }
         return count;
     }

    @Override
    public String toString() {
        return "Department's name: " + name + "\nBooks count: " + getBooksCount();
    }

    public Department(String name, Book[] books) {
        this.name = name;
        this.books = books;
    }

    public Department(String name, int length) {
        this.name = name;
        this.books = new Book[length];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getBooks() {
        return books;
    }



}
