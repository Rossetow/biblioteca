/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Aluno TDS
 */
public class Lending {
    
    private String client;
    private String title;
    private String author;
    private String cathegory;
    private int id;
    private String date;
    private boolean returned;
    

    public Lending( String title, String author, String cathegory, String date, String client) {
        this.title = title;
        this.author = author;
        this.cathegory = cathegory;
        this.date = date;
        this.client = client;
    }

    public String getClient() {
        return client;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public boolean isReturned() {
        return returned;
    }

    public String getCathegory() {
        return cathegory;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setReturned(boolean returned) {
        this.returned = returned;
    }

    
    
 
}
