/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno TDS
 */
public class Library {

    public List<Book> books = new ArrayList<Book>();
    private int idCounter = 0;

    public List<Book> getBooks(){
        return this.books;
    }

    public void addBook(Book add){
        add.setId(++this.idCounter);
        this.books.add(add);
    }
    
    public void removeBook (Book remove){
        this.books.remove(remove);
    }
    
    public Book getBookByID (int id){
        return this.books.get(id);
    }
    
    public List<Book> findBook (String title, String author, String cathegory){
        List<Book> output = new ArrayList<>();
        for (Book book : this.books) {
            if(book.isBorrowed()){
                if(!title.isEmpty() && book.getTitle().toUpperCase().contains(title.toUpperCase()))
                    output.add(book);
                else if(!author.isEmpty() && book.getAuthors().toUpperCase().contains(author.toUpperCase()))
                    output.add(book);
                else if(!cathegory.isEmpty() && book.getCathegory().toUpperCase().contains(cathegory.toUpperCase()))
                    output.add(book);
            }
        }
        return output;
    }
}