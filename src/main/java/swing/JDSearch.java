/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package swing;

import br.com.senac.biblioteca.projeto.data;
import java.util.List;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.Book;

/**
 *
 * @author User
 */
public class JDSearch extends javax.swing.JDialog {
    data data;
    Book selected;
    
    /**
     * Creates new form NewJDialog
     */
    public JDSearch(JFLending parent) {
        super(parent);
        this.data = parent.data;
        initComponents();
        this.JTBooks.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int row = JTBooks.getSelectedRow();
                if(row >= 0){
                    int id = (int)JTBooks.getModel().getValueAt(row, 0);
                    Book book = data.getLibrary().getBookByID(id);
                    selected = book;
                    dispose();
                }
            }
        });
    }
    
    public void clear() {
        this.JTFTitle.setText("");
        this.JTFAuthor.setText("");
        this.JCBCathegory.setSelectedItem("Infantil");
    }
    
    public JTBooksResult initTable(){
        return new JTBooksResult(searchBooks());
    }
    
    public List<Book> searchBooks() {
        return this.data.getLibrary().findBook(
                this.JTFTitle.getText(), 
                this.JTFAuthor.getText(), 
                this.JCBCathegory.getSelectedItem().toString());
    }
    
    public Book getSelected(){
        return this.selected;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JTFTitle = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTBooks = new javax.swing.JTable();
        JBSearch = new javax.swing.JButton();
        JLTitle = new javax.swing.JLabel();
        JLAuthor = new javax.swing.JLabel();
        JCBCathegory = new javax.swing.JComboBox<>();
        JLCathegory = new javax.swing.JLabel();
        JTFAuthor = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JTBooks.setModel(initTable());
        JTBooks.setColumnSelectionAllowed(true);
        JTBooks.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(JTBooks);
        JTBooks.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        JBSearch.setText("Search");
        JBSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSearchActionPerformed(evt);
            }
        });

        JLTitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLTitle.setText("Title");

        JLAuthor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLAuthor.setText("Author");

        JCBCathegory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Infantil", "Religião", "Fantasia", "Ficção", "Auto-ajuda", "Informática" }));

        JLCathegory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLCathegory.setText("Cathegory");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLCathegory)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFAuthor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JCBCathegory, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JBSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(JLAuthor)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(JLTitle)
                            .addGap(54, 54, 54)
                            .addComponent(JTFTitle)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(JTFAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLCathegory)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JCBCathegory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JBSearch)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JLTitle)
                        .addComponent(JTFTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLAuthor)
                    .addGap(439, 439, 439)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSearchActionPerformed
        initTable();
        this.JTBooks.setModel(new JTBooksResult(searchBooks()));
        this.JTBooks.clearSelection();
    }//GEN-LAST:event_JBSearchActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBSearch;
    private javax.swing.JComboBox<String> JCBCathegory;
    private javax.swing.JLabel JLAuthor;
    private javax.swing.JLabel JLCathegory;
    private javax.swing.JLabel JLTitle;
    private javax.swing.JTable JTBooks;
    private javax.swing.JTextField JTFAuthor;
    private javax.swing.JTextField JTFTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
