/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tedit;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author rajesh
 */
public class tedit extends javax.swing.JFrame {

    /**
     * Creates new form tedit
     */
    public tedit() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RajEditor");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 3, 14)); // NOI18N
        jLabel1.setText("File");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 3, 14)); // NOI18N
        jLabel2.setText("Edit");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 3, 14)); // NOI18N
        jLabel3.setText("Format");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 3, 14)); // NOI18N
        jLabel4.setText("Help");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Ubuntu", 3, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jComboBox1.setFont(new java.awt.Font("Ubuntu", 3, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "New", "Open", "Save as", "Exit" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Ubuntu", 3, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cut", "Copy", "Paste", "Delete", "Select all", "spell check" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox3.setFont(new java.awt.Font("Ubuntu", 3, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Upper case", "Lower case", "Length", "number of lines", "rows", "columns" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jComboBox4.setFont(new java.awt.Font("Ubuntu", 3, 14)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "About Developer", "send feedback", "About RajEditor" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        if(jComboBox4.getSelectedIndex()==0)
        { 
             JOptionPane.showMessageDialog(this,"hi .., i'm Rajesh Kumar student of IIIT Manipur \nhaving 'CSE' branch with roll number '15010105' .\n ");
        }
        if(jComboBox4.getSelectedIndex()==1)
        {  
            JOptionPane.showMessageDialog(this,"users can send there feedback on this details : \n email : rajesh.k@iiitmanipur.ac.in\n mobile number : 8259952348" );
        }
        if(jComboBox4.getSelectedIndex()==2)
        { 
            JOptionPane.showMessageDialog(this,"this RajEditor is made on netbeans and it contains four combo box , one text area , one text field , and four labels .");
            
        }
    }                                          

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
         String txtstr = jTextArea1.getSelectedText();
         int txtstart = jTextArea1.getSelectionStart();
         int txtend = jTextArea1.getSelectionEnd() ;
        if(jComboBox3.getSelectedIndex()==0)
        { 
            String ucase=txtstr.toUpperCase();
            //String replace =txtstr.replace(txtstr, ucase);
            //jTextArea1.insert(ucase, txtstart);
            //txtstr.trim();
            jTextArea1.replaceRange(ucase, txtstart, txtend);
        }
        if(jComboBox3.getSelectedIndex()==1)
        { 
             String lcase=txtstr.toLowerCase();
             jTextArea1.replaceRange(lcase, txtstart, txtend);
        }
        if(jComboBox3.getSelectedIndex()==2)
        {  
            int length = txtstr.length();
          //  JOptionPane.showConfirmDialog(rootPane, length);
          JOptionPane.showMessageDialog(rootPane, length);
        }
        if(jComboBox3.getSelectedIndex()==3)
        {  
            //line
            int line = jTextArea1.getLineCount();
          JOptionPane.showMessageDialog(rootPane, line);
        }
        if(jComboBox3.getSelectedIndex()==4)
        {  
           //row
            int row = jTextArea1.getRows();
          JOptionPane.showMessageDialog(rootPane, row);
        }
        if(jComboBox3.getSelectedIndex()==5)
        {  
           //column
            int column = jTextArea1.getColumns();
          JOptionPane.showMessageDialog(rootPane, column);
        }
        
    }                                          

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        if(jComboBox1.getSelectedIndex()==0)
        {   String message = "click yes if u want to save it \nelse click no to get new RajEditor";
            String title = "Do you want to save this file ?";
               // display the JOptionPane showConfirmDialog
            int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
    if (reply == JOptionPane.YES_OPTION)
    {  jTextField1.setText("");
       JFileChooser chooser1 = new JFileChooser();
       int chooservalue1 = chooser1.showSaveDialog(this);
       if(chooservalue1 == JFileChooser.APPROVE_OPTION)
        { 
            try{
                 
                try (PrintWriter fout = new PrintWriter(chooser1.getSelectedFile())) {
                    fout.print(jTextArea1.getText());
                    jTextField1.setText("Saved " + chooser1.getSelectedFile().getAbsolutePath());
                }
               }
            
            catch(FileNotFoundException ex)
               {
                   JOptionPane.showMessageDialog(this,ex);
               }
            
        }
      
    
    }
         if(reply == JOptionPane.NO_OPTION)
        {
            jTextArea1.setText("");
            jTextField1.setText("New File .");
         }  
                                                  
                                                 } 
        if(jComboBox1.getSelectedIndex()==1)
        { 
             JFileChooser chooser = new JFileChooser();
             int chooserValue = chooser.showOpenDialog(this);
             if(chooserValue==JFileChooser.APPROVE_OPTION)
             { 
                  try
                  {
                      try (Scanner fin = new Scanner(chooser.getSelectedFile())) {
                          String buffer = "";
                          while(fin.hasNext())
                          {
                              buffer += fin.nextLine() + "\n";
                          }
                          jTextArea1.setText(buffer);
                      }
                      jTextField1.setText("Loaded"+ chooser.getSelectedFile().getAbsolutePath());
                  } catch(FileNotFoundException ex)
                  { 
                      JOptionPane.showMessageDialog(this,"File Not Found....");
                  }
             } 
        }
          
        if(jComboBox1.getSelectedIndex()==2)
     
      { 
            JFileChooser chooser1 = new JFileChooser();
        int chooservalue1 = chooser1.showSaveDialog(this);
        if(chooservalue1 == JFileChooser.APPROVE_OPTION)
        { 
            try{
                 
                try (PrintWriter fout = new PrintWriter(chooser1.getSelectedFile())) {
                    fout.print(jTextArea1.getText());
                    jTextField1.setText("Saved " + chooser1.getSelectedFile().getAbsolutePath());
                }
               }
            
            catch(FileNotFoundException ex)
               {
                   JOptionPane.showMessageDialog(this,ex);
               }
            
        }
      }
        if(jComboBox1.getSelectedIndex()==3)
        { 
           /* int input = JOptionPane.showConfirmDialog(null, "Do you like bacon?");
        // 0=yes, 1=no, 2=cancel
        System.out.println(input);
        */
            int response = JOptionPane.showConfirmDialog(null, "Do you want to Exit the RajEditor?\n click yes if u dont want to save and want to close it .\n click no to save it first .", "Confirm",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            switch (response) {
                case JOptionPane.NO_OPTION:
                    System.out.println("No button clicked");
                    break;
                case JOptionPane.YES_OPTION:
                    System.exit(0);
                case JOptionPane.CLOSED_OPTION:
                    System.out.println("JOptionPane closed");
                    break;
                default:
                    break;
            }
        }
          
        
    }                                          

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
         String txtstr = jTextArea1.getSelectedText();
         int txtstart = jTextArea1.getSelectionStart();
         int txtend = jTextArea1.getSelectionEnd() ;
        
        if(jComboBox2.getSelectedIndex()==0)
        { 
           jTextArea1.cut();
        }
         if(jComboBox2.getSelectedIndex()==1)
        { 
            jTextArea1.copy();
        }
          if(jComboBox2.getSelectedIndex()==2)
        { 
            jTextArea1.paste();
        }
           if(jComboBox2.getSelectedIndex()==3)
        { 
           // txtstr.replaceAll(txtstr,"");
            String temp=txtstr.replace(txtstr,"");
             jTextArea1.replaceRange(temp, txtstart, txtend);
        }
            if(jComboBox2.getSelectedIndex()==4)
        { 
           
            jTextArea1.selectAll();
        }
          
         
    }                                          

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new tedit().setVisible(true);
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration                   

    private String nextLine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

