/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Lending;

/**
 *
 * @author User
 */
public class JTLendings extends AbstractTableModel{

    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private String[] columns = new String[] {
        "ID",
        "Title",
        "Author",
        "Cathegory",
        "Date",
        "Client",
        "Returned"
    };
    
    private Class[] types = new Class [] {
        java.lang.Integer.class, 
        java.lang.String.class, 
        java.lang.String.class, 
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
        false,
        false,
        false
    };
    
    List<Lending> itens;
    
    public JTLendings(List<Lending> input) {
        this.itens = input;
    }
    
    public void add (Lending item){
        this.itens.add(item);
        int row = itens.indexOf(item);
        fireTableRowsInserted(row, row);
    }
    
    public void remove (Lending item){
        if(this.itens.contains(item)){
            int row = itens.indexOf(item);
            itens.remove(item);
            fireTableRowsDeleted(row, row);
        }
    }
    
    
    
}
