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
    public List<Lending> lendings = new ArrayList<Lending>();
    private int lendCounter = 0;
    private int idCounter = 0;

    public List<Book> getBooks(){
        return this.books;
    }

    public void addBook(Book add){
        add.setId(++this.idCounter);
        this.books.add(add);
    }
    
    public void removeBook (Book remove){
        //não sei pq os metodos da list não tao funcionando direito
        
        Book delete = null;
        for (Book book : this.books) {
            if(remove.getId()==book.getId())
                delete=book;
                break;
        }
       
        this.books.remove(delete);
    }
    
    public Book getBookByID (int id){
        return this.books.get(id-1);
    }
    
    public void editBook(Book edit){
        if(edit.getId()>0){
            int index = findIndex(edit);
            
            if(index>=0)
                this.books.set(index, edit);
        } else {
            addBook(edit);
        }
    }
    
    public int findIndex(Book o){
        //.indexOf não tava funcionando por algum motivo
        
        for (int i = 0; i < this.books.size(); i++) {
            Book object = this.books.get(i);
            if(object.getId()==o.getId())
                return i;
        }
        
        return -1;
    }
    
    public List<Book> findBook (String title, String author, String cathegory){
        List<Book> output = new ArrayList<>();
        for (Book book : this.books) {
            if(book.isAvailable()){
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

  public void addLending(Lending add){
      this.lendings.add(add);
}
  
}