/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Book;

/**
 *
 * @author Aluno TDS
 */
public class JTBooksResult extends AbstractTableModel{

    private List<Book> itens;

    JTBooksResult(List<Book> books) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void JTBookResult (List<Book> input){
        this.itens=input;
    }
    private String[] columns = new String[] {
        "ID",
        "Title",
        "Author",
        "Cathegory",
        "Available"
    };
    private Class[] types = new Class [] {
        java.lang.Integer.class, 
        java.lang.String.class, 
        java.lang.String.class, 
        java.lang.String.class, 
        java.lang.Boolean.class
    };
    private boolean[] canEdit = new boolean [] {
        false, 
        false, 
        false, 
        false, 
        false
    };

    @Override
    public int getRowCount() {
        return itens.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Book item = itens.get(rowIndex);
        switch(columnIndex){
            case 0: return item.getId();
            case 1: return item.getTitle();
            case 2: return item.getAuthors();
            case 3: return item.getCathegory();
            case 4: return item.isBorrowed();
        }
      return null;
    }
    
    public void add (Book item){
        this.itens.add(item);
    }
    
    public void remove (Book item){
        if(this.itens.contains(item)){
            int row = itens.indexOf(item);
            itens.remove(item);
            fireTableRowsDeleted(row, row);
        }
    }
    
    
}
