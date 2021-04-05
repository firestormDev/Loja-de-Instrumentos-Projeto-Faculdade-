//Luiz Guilherme Veloso Tinti RA 2101190
import javax.swing.JOptionPane;
public class FormComboInst extends javax.swing.JFrame {

   
    public FormComboInst() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btFecha = new javax.swing.JButton();
        comboInst = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btFecha.setText("Fechar");
        btFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFechaActionPerformed(evt);
            }
        });

        comboInst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboInstActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(325, Short.MAX_VALUE)
                .addComponent(btFecha)
                .addContainerGap())
            .addComponent(comboInst, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(comboInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addComponent(btFecha)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFechaActionPerformed
        dispose();
    }//GEN-LAST:event_btFechaActionPerformed

    private void comboInstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboInstActionPerformed
         if(comboInst.getSelectedIndex()>=1){
            //String nomeComp = "";
            String nomeComp = comboInst.getSelectedItem().toString();
            JOptionPane.showMessageDialog(null, "COMBOBOX: Valor escolhido no combo: "+nomeComp,"Escolha no ComboBox",1);          
        
        }
    }//GEN-LAST:event_comboInstActionPerformed
public void showComboInst(Banco banco){
        this.setVisible(true);
        Instrumento inst = new Instrumento();        
        comboInst.removeAllItems();
        comboInst.addItem("Escolha uma opção");
        
            for(int posLinha = 0; posLinha < banco.getBanco().size(); posLinha++){
               inst.setId(banco.getBanco().get(posLinha).getId());
               inst.setMarca(banco.getBanco().get(posLinha).getMarca());
               inst.setTipo(banco.getBanco().get(posLinha).getTipo());
               inst.setPreço(banco.getBanco().get(posLinha).getPreço());               
               comboInst.addItem(inst.getId()+" - "+inst.getMarca()+" - "+inst.getTipo()+" - "+inst.getPreço());
               
                
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
            java.util.logging.Logger.getLogger(FormComboInst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormComboInst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormComboInst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormComboInst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormComboInst().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFecha;
    private javax.swing.JComboBox<String> comboInst;
    // End of variables declaration//GEN-END:variables
}
