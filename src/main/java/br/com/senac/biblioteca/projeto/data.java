/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.biblioteca.projeto;

import model.Book;
import model.Library;

/**
 *
 * @author Aluno TDS
 */
public class data {
    private Library library;
    
    public void data (){
        this.library = new Library();
        this.library.addBook(new Book("Biblia","Rafael Rosseto","Religião"));
        this.library.addBook(new Book("Turma da Mônica","Maurício de Souza","Infantil"));
        this.library.addBook(new Book("Harry Potter","J.K. Rownling","Fantasia"));
        this.library.addBook(new Book("O Código Da Vinci","Dan Brown","Ficção"));
        this.library.addBook(new Book("Vinte mil léguas submarinas","Julio Verne","Ficção"));

    }
    public Library getLibrary (){
        return this.library;
    }
    
}
