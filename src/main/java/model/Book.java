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
    private int id;
    private String title;
    private String author;
    private String cathegory;
    public boolean available = true;

    public Book(String title, String author, String cathegory) {
        this.title = title;
        this.author = author;
        this.cathegory = cathegory;
    }

    public void setId(int setId) {
        this.id = setId;
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

    public boolean isAvailable() {
        return this.available;
    }
    
    public String getCathegory (){
        return this.cathegory;
    }

    public void setAvaiable(boolean set){
        this.available=set ;
    }
}

