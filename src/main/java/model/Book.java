/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Aluno TDS
 */
public class Book {
    private String author;
    private String title;
    private int pages;
    private boolean borrowed = false;
    private String cathegory;
    private int id;

    public Book(String author, String title, int pages) {
        this.author = author;
        this.title = title;
        this.pages = pages;
        this.cathegory = cathegory;
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public String getAuthors() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPages() {
        return this.pages;
    }

    public boolean isBorrowed() {
        return this.borrowed;
    }
    
    public String getCathegory (){
        return this.cathegory;
    }

    public void Return(){
        this.borrowed=false;
    }

    public void borrow(){
        this.borrowed=true;
    }

}

