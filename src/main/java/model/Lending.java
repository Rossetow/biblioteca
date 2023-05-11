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
    private Book book;
    private int id;
    private String date;

    public Lending(String client, Book book, int id, String date) {
        this.client = client;
        this.book = book;
        this.date = date;
        this.id = id;
    }
 
}
