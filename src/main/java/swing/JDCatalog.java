/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package swing;

import br.com.senac.biblioteca.projeto.data;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.Book;


/**
 *
 * @author Aluno TDS
 */
public class JDCatalog extends javax.swing.JDialog {

    public data data;
    /**
     * Creates new form JDCatalog
     */
    public JDCatalog(Home parent) {
        super(parent);
        this.data=parent.getData();
        initComponents();
        this.JTResults.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int index = JTResults.getSelectedRow();
                if(index >= 0) {
                    Book book = data.getLibrary().getBooks().get(index);
                    JTFId.setText(String.valueOf(book.getId()));
                    JTFTitle.setText(book.getTitle());
                    JTFAuthor.setText(book.getAuthors());
                    JCBCathegory.setSelectedItem(book.getCathegory());
                    JCBAvaiable.setSelected(book.isAvailable());
                }
            }
        });
    
    }
    
    public void clear() {
        this.JTFTitle.setText("");
        this.JTFAuthor.setText("");
        this.JTFId.setText("");
        this.JCBCathegory.setSelectedItem("");
        this.JCBAvaiable.setSelected(false);
        this.JTResults.setModel(initTable());
        //this.jTableCatalogo.clearSelection();
    }
    
    public JTBooksResult initTable(){
        return new JTBooksResult(this.data.getLibrary().getBooks());
    }
    
    public Book createBook (){
        Book output = new Book(this.JTFTitle.getText(), this.JTFAuthor.getText(), this.JCBCathegory.getSelectedItem().toString());
        output.setAvaiable(this.JCBAvaiable.isSelected());
        output.available = this.JCBAvaiable.isSelected();
        if(!this.JTFId.getText().isEmpty())
            output.setId(Integer.parseInt(this.JTFId.getText()));

        return output;
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
        jLabel2 = new javax.swing.JLabel();
        JCBCathegory = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        JTFAuthor = new javax.swing.JTextField();
        JTFTitle = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTResults = new javax.swing.JTable();
        JCBAvaiable = new javax.swing.JCheckBox();
        JTFId = new javax.swing.JTextField();
        JLId = new javax.swing.JLabel();
        JBSave = new javax.swing.JButton();
        JBDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Title");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Author");

        JCBCathegory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Infantil", "Religião", "Fantasia", "Ficção", "Auto-ajuda", "Informática" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Cathegory");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        JTResults.setModel(initTable());
        JTResults.setColumnSelectionAllowed(true);
        JTResults.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(JTResults);
        JTResults.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        JCBAvaiable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JCBAvaiable.setText("Available");
        JCBAvaiable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBAvaiableActionPerformed(evt);
            }
        });

        JTFId.setEditable(false);
        JTFId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFIdActionPerformed(evt);
            }
        });

        JLId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLId.setText("ID");

        JBSave.setText("Save");
        JBSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSaveActionPerformed(evt);
            }
        });

        JBDelete.setText("Delete");
        JBDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(JCBAvaiable, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBDelete))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(JLId))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTFId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JCBCathegory, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83))
                            .addComponent(JTFTitle)
                            .addComponent(JTFAuthor))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTFTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTFAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLId)
                    .addComponent(JTFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(JCBCathegory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBSave)
                    .addComponent(JBDelete)
                    .addComponent(JCBAvaiable, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JCBAvaiableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBAvaiableActionPerformed
        
    }//GEN-LAST:event_JCBAvaiableActionPerformed

    private void JTFIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFIdActionPerformed

    private void JBSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSaveActionPerformed
        this.data.getLibrary().editBook(createBook());
        clear();
        
    }//GEN-LAST:event_JBSaveActionPerformed

    private void JBDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBDeleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBDelete;
    private javax.swing.JButton JBSave;
    private javax.swing.JCheckBox JCBAvaiable;
    private javax.swing.JComboBox<String> JCBCathegory;
    private javax.swing.JLabel JLId;
    private javax.swing.JTextField JTFAuthor;
    private javax.swing.JTextField JTFId;
    private javax.swing.JTextField JTFTitle;
    private javax.swing.JTable JTResults;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
