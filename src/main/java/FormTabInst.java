//Luiz Guilherme Veloso Tinti RA 2101190
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class FormTabInst extends javax.swing.JFrame {
   
    public FormTabInst() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sair = new javax.swing.JButton();
        tabInst2 = new javax.swing.JScrollPane();
        tabInst = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        tabInst.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "MARCA", "TIPO", "MODELO"
            }
        ));
        tabInst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabInstMouseClicked(evt);
            }
        });
        tabInst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabInstKeyPressed(evt);
            }
        });
        tabInst2.setViewportView(tabInst);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Sair)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabInst2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(tabInst2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(Sair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
       dispose();
    }//GEN-LAST:event_SairActionPerformed

    private void tabInstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabInstMouseClicked
        String nomeComp = "" ;
        int linhaTabela = tabInst.getSelectedRow();
        int coluna = 0;
        
        for(coluna =0; coluna < tabInst.getColumnCount(); coluna ++){
            nomeComp += tabInst.getModel().getValueAt(linhaTabela, coluna).toString();
            if(coluna < tabInst.getColumnCount()){
                nomeComp += " - ";
            }
            JOptionPane.showMessageDialog(null,"Vc escolheu o instrumento" + nomeComp, "Escolha na tabela",1);
            
        }
    }//GEN-LAST:event_tabInstMouseClicked

    private void tabInstKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabInstKeyPressed
        
    }//GEN-LAST:event_tabInstKeyPressed


    public void ShowTabInst(Banco banco){
        this.setVisible(true);
        Instrumento inst = new Instrumento();
        DefaultTableModel modTabInst = new DefaultTableModel();
        
        modTabInst = (DefaultTableModel) tabInst.getModel();
        
        modTabInst.setRowCount(0);
        
        for(int posLinha = 0; posLinha < banco.getBanco().size(); posLinha++){
            inst.setId(banco.getBanco().get(posLinha).getId());  
            inst.setMarca(banco.getBanco().get(posLinha).getMarca()); 
            inst.setTipo(banco.getBanco().get(posLinha).getTipo());
            inst.setPreço(banco.getBanco().get(posLinha).getPreço());
            
            modTabInst.insertRow(posLinha, new Object[]{inst.getId(),inst.getMarca(),inst.getTipo(), inst.getPreço()});
          
        }       
       
        
    
    
    
    }
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
            java.util.logging.Logger.getLogger(FormTabInst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTabInst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTabInst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTabInst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTabInst().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Sair;
    private javax.swing.JTable tabInst;
    private javax.swing.JScrollPane tabInst2;
    // End of variables declaration//GEN-END:variables
}
