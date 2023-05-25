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
        return this.itens.size();
        }

    @Override
    public int getColumnCount() {
        return 7;
        }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
    Lending item = this.itens.get(rowIndex);
        switch(columnIndex){
            case 0: return item.getId();
            case 1: return item.getTitle();
            case 2: return item.getAuthor();
            case 3: return item.getCathegory();
            case 4: return item.getDate();
            case 5: return item.getClient();
            case 6: return item.isReturned();
        }
      return null;
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
    
     
    @Override
    public Class getColumnClass(int columnIndex) {
        return types[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
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
