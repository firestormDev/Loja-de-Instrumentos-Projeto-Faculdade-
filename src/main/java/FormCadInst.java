//Luiz Guilherme Veloso Tinti RA 2101190
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormCadInst extends javax.swing.JFrame {
    private Banco banco = new Banco();
    private Instrumento inst = new Instrumento();
    
    public FormCadInst() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rtId = new javax.swing.JLabel();
        cxId = new javax.swing.JTextField();
        rtMarca = new javax.swing.JLabel();
        cxMarca = new javax.swing.JTextField();
        btSai = new javax.swing.JButton();
        btLimpa = new javax.swing.JButton();
        btCad = new javax.swing.JButton();
        btCons = new javax.swing.JButton();
        btExc = new javax.swing.JButton();
        cxTipo = new javax.swing.JTextField();
        rtTipo = new javax.swing.JLabel();
        rtPre = new javax.swing.JLabel();
        cxPreço = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabInst = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaInst = new javax.swing.JList<>();
        comboInst = new javax.swing.JComboBox<>();
        btFormTab = new javax.swing.JButton();
        btFormLista = new javax.swing.JButton();
        btCombo = new javax.swing.JButton();
        mnBarPrinc = new javax.swing.JMenuBar();
        mnPrinc = new javax.swing.JMenu();
        mnItCad = new javax.swing.JMenuItem();
        mnItCons = new javax.swing.JMenuItem();
        mnItExc = new javax.swing.JMenuItem();
        mnItLimpa = new javax.swing.JMenuItem();
        mnItSai = new javax.swing.JMenuItem();
        mnJanela = new javax.swing.JMenu();
        mnItTab = new javax.swing.JMenuItem();
        mnItList = new javax.swing.JMenuItem();
        mnItCombo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rtId.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        rtId.setText("ID:");

        cxId.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N

        rtMarca.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        rtMarca.setText("MARCA:");

        cxMarca.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N

        btSai.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btSai.setText("Sair");
        btSai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaiActionPerformed(evt);
            }
        });

        btLimpa.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btLimpa.setText("Limpar");
        btLimpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpaActionPerformed(evt);
            }
        });

        btCad.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btCad.setText("Cadastrar");
        btCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadActionPerformed(evt);
            }
        });

        btCons.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btCons.setText("Consultar(ID)");
        btCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsActionPerformed(evt);
            }
        });

        btExc.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btExc.setText("Excluir(ID)");
        btExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcActionPerformed(evt);
            }
        });

        cxTipo.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N

        rtTipo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        rtTipo.setText("TIPO:");

        rtPre.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        rtPre.setText("PREÇO");

        cxPreço.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N

        tabInst.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "MARCA", "TIPO", "PREÇO"
            }
        ));
        tabInst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabInstMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabInst);

        listaInst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaInstMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaInst);

        comboInst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboInstActionPerformed(evt);
            }
        });

        btFormTab.setText("ABRIR TABELA");
        btFormTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFormTabActionPerformed(evt);
            }
        });

        btFormLista.setText("ABRIR LISTA");
        btFormLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFormListaActionPerformed(evt);
            }
        });

        btCombo.setText("ABRIR COMBO");
        btCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btComboActionPerformed(evt);
            }
        });

        mnPrinc.setText("Menuzinho");

        mnItCad.setText("Cadastrar");
        mnItCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItCadActionPerformed(evt);
            }
        });
        mnPrinc.add(mnItCad);

        mnItCons.setText("Consultar(ID)");
        mnItCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItConsActionPerformed(evt);
            }
        });
        mnPrinc.add(mnItCons);

        mnItExc.setText("Excluir(ID)");
        mnItExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItExcActionPerformed(evt);
            }
        });
        mnPrinc.add(mnItExc);

        mnItLimpa.setText("Limpar");
        mnItLimpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItLimpaActionPerformed(evt);
            }
        });
        mnPrinc.add(mnItLimpa);

        mnItSai.setText("Sair");
        mnItSai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItSaiActionPerformed(evt);
            }
        });
        mnPrinc.add(mnItSai);

        mnBarPrinc.add(mnPrinc);

        mnJanela.setText("Janelas");

        mnItTab.setText("ABRIR TABELA");
        mnItTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItTabActionPerformed(evt);
            }
        });
        mnJanela.add(mnItTab);

        mnItList.setText("ABRIR LISTA");
        mnItList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItListActionPerformed(evt);
            }
        });
        mnJanela.add(mnItList);

        mnItCombo.setText("ABRIR COMBO");
        mnItCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItComboActionPerformed(evt);
            }
        });
        mnJanela.add(mnItCombo);

        mnBarPrinc.add(mnJanela);

        setJMenuBar(mnBarPrinc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rtPre, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cxPreço, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rtMarca)
                                .addComponent(rtTipo)
                                .addComponent(rtId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cxId, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                                .addComponent(cxMarca)
                                .addComponent(cxTipo))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btCons, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                            .addComponent(btFormLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btCombo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btCad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btExc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btLimpa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btSai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btFormTab, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(comboInst, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtMarca)
                            .addComponent(cxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rtTipo))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtPre)
                            .addComponent(cxPreço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btCad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btExc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCons)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btLimpa)
                        .addGap(13, 13, 13)
                        .addComponent(btSai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btFormTab)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btFormLista)
                        .addGap(11, 11, 11)
                        .addComponent(btCombo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpaActionPerformed
      limp(); 
        
    }//GEN-LAST:event_btLimpaActionPerformed
    public void limp(){
        cxId.setText("");
        cxPreço.setText("");
        cxMarca.setText("");
        cxTipo.setText("");
        cxId.requestFocus();
    }
    private void btSaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaiActionPerformed
        dispose();
    }//GEN-LAST:event_btSaiActionPerformed

    private void btCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadActionPerformed
      cadInst();  
    
    }//GEN-LAST:event_btCadActionPerformed
                
          
    public void cadInst(){
        inst = new Instrumento();
        try{
        inst.setId(Integer.parseInt(cxId.getText()));
        inst.setPreço(Integer.parseInt(cxPreço.getText()));
        inst.setMarca(cxMarca.getText());
        inst.setTipo(cxTipo.getText());
        
            if(banco.consInstId(inst)== null){
                banco.getBanco().add(inst);
                JOptionPane.showMessageDialog(null,"Instrumento cadastrado com sucesso.","Cadastro concluido", 1);
                cxId.setText("");
                cxMarca.setText("");
                cxTipo.setText("");
                cxPreço.setText("");
                cxId.requestFocus();
                ShowTabInst();
                showListaInst();
                showComboInst();    
            }
            else{
                JOptionPane.showMessageDialog(null,"Ja existe instrumento com esse ID.","Erro", 1);
                cxId.setText("");
                cxId.requestFocus();
            }
           
    }                                     
        catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"O Valor deve ser Inteiro." , "Erro de ID !!",5);
            cxId.setText("");
            cxId.requestFocus();
            
        }
            
        
        }
    private void btConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsActionPerformed
       consInst();
    }//GEN-LAST:event_btConsActionPerformed
       public void consInst(){
            inst = new Instrumento();
        try{
            inst.setId(Integer.parseInt(cxId.getText()));
            inst = banco.consInstId(inst);
        
            if(inst != null){
                cxId.setText(Integer.toString(inst.getId()));
                cxPreço.setText(Integer.toString(inst.getPreço()));
                cxMarca.setText(inst.getMarca());
                cxTipo.setText(inst.getTipo());
                cxId.requestFocus();
            }
            else{
                JOptionPane.showMessageDialog(null,"Nao existe instrumento com esse ID.","Erro", 1);
                cxId.setText("");
                cxId.requestFocus();
            }
           
    }                                     
        catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"O Valor deve ser Inteiro." , "Erro de ID !!",5);
            cxId.setText("");
            cxId.requestFocus();
            
        }     
              
       }
       
    private void btExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcActionPerformed
       excInst();
    }//GEN-LAST:event_btExcActionPerformed
    public void excInst(){
        inst = new Instrumento();
        try{
            inst.setId(Integer.parseInt(cxId.getText()));
            inst = banco.consInstId(inst);
        
            if(inst != null){
                cxId.setText(Integer.toString(inst.getId()));
                cxPreço.setText(Integer.toString(inst.getPreço()));
                cxMarca.setText(inst.getMarca());
                cxTipo.setText(inst.getTipo());
                int resp= JOptionPane.showConfirmDialog(null,"Deseja mesmo excluir o Instrumento?","Confirmacao",1);
                
                if (resp == 0){
                    banco.excluiInst(inst);
                    JOptionPane.showMessageDialog(null,"Instrumento excluido com sucesso.","Exclusao concluida", 1);
                    cxId.setText("");
                    cxPreço.setText("");
                    cxMarca.setText(""); 
                    cxTipo.setText("");
                    cxId.requestFocus();
                    ShowTabInst();
                    showListaInst();
                    showComboInst();
                }
                else{
                    cxId.setText("");
                    cxPreço.setText("");
                    cxTipo.setText("");
                    cxMarca.setText("");                    
                    cxId.requestFocus();
                }
                
            }
            else{
                JOptionPane.showMessageDialog(null,"Ja existe instrumento com esse ID.","Erro", 1);
                cxId.setText("");
                cxId.requestFocus();
            }
           
        }                                     
        catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"O Valor deve ser Inteiro." , "Erro de ID !!",5);
            cxId.setText("");
            cxId.requestFocus();
            
        }
    }
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

    private void listaInstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaInstMouseClicked
        String nomeComp = listaInst.getSelectedValue().toString();
        JOptionPane.showMessageDialog(null,"Valor escolhido na lista: " +nomeComp, "Escolha na lista",1);
    }//GEN-LAST:event_listaInstMouseClicked

    private void comboInstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboInstActionPerformed
        if(comboInst.getSelectedIndex()>=1){
            //String nomeComp = "";
            String nomeComp = comboInst.getSelectedItem().toString();
            JOptionPane.showMessageDialog(null, "COMBOBOX: Valor escolhido no combo: "+nomeComp,"Escolha no ComboBox",1);
            
        
        }
    }//GEN-LAST:event_comboInstActionPerformed

    private void btFormTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFormTabActionPerformed
       new FormTabInst().ShowTabInst(banco);
    }//GEN-LAST:event_btFormTabActionPerformed

    private void btFormListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFormListaActionPerformed
        new FormListaInst().showListaInst(banco);
    }//GEN-LAST:event_btFormListaActionPerformed

    private void btComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btComboActionPerformed
        new FormComboInst().showComboInst(banco);
    }//GEN-LAST:event_btComboActionPerformed

    private void mnItCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItCadActionPerformed
        cadInst();
    }//GEN-LAST:event_mnItCadActionPerformed

    private void mnItConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItConsActionPerformed
        consInst();
    }//GEN-LAST:event_mnItConsActionPerformed

    private void mnItExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItExcActionPerformed
        excInst();
    }//GEN-LAST:event_mnItExcActionPerformed

    private void mnItLimpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItLimpaActionPerformed
        limp(); 
    }//GEN-LAST:event_mnItLimpaActionPerformed

    private void mnItSaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItSaiActionPerformed
        dispose();
    }//GEN-LAST:event_mnItSaiActionPerformed

    private void mnItTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItTabActionPerformed
         new FormTabInst().ShowTabInst(banco);
    }//GEN-LAST:event_mnItTabActionPerformed

    private void mnItListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItListActionPerformed
       new FormListaInst().showListaInst(banco);
    }//GEN-LAST:event_mnItListActionPerformed

    private void mnItComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItComboActionPerformed
       new FormComboInst().showComboInst(banco);
    }//GEN-LAST:event_mnItComboActionPerformed
    public void ShowTabInst(){ 
        this.setVisible(true);
        inst = new Instrumento();
        
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
     public void showListaInst(){
           inst = new Instrumento();
           DefaultListModel modListaInst = new DefaultListModel();
           
           modListaInst.removeAllElements();
           
           for(int posLinha = 0; posLinha < banco.getBanco().size(); posLinha++){
               inst.setId(banco.getBanco().get(posLinha).getId());
               inst.setMarca(banco.getBanco().get(posLinha).getMarca());
               inst.setTipo(banco.getBanco().get(posLinha).getTipo());
               inst.setPreço(banco.getBanco().get(posLinha).getPreço());
               
               modListaInst.addElement(inst.getId()+" - "+inst.getMarca()+" - "+inst.getTipo()+" - "+inst.getPreço());
               
           
           }
           listaInst.setModel(modListaInst);
        }
       public void showComboInst(){
        inst = new Instrumento();        
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
            java.util.logging.Logger.getLogger(FormCadInst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadInst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadInst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadInst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadInst().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCad;
    private javax.swing.JButton btCombo;
    private javax.swing.JButton btCons;
    private javax.swing.JButton btExc;
    private javax.swing.JButton btFormLista;
    private javax.swing.JButton btFormTab;
    private javax.swing.JButton btLimpa;
    private javax.swing.JButton btSai;
    private javax.swing.JComboBox<String> comboInst;
    private javax.swing.JTextField cxId;
    private javax.swing.JTextField cxMarca;
    private javax.swing.JTextField cxPreço;
    private javax.swing.JTextField cxTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaInst;
    private javax.swing.JMenuBar mnBarPrinc;
    private javax.swing.JMenuItem mnItCad;
    private javax.swing.JMenuItem mnItCombo;
    private javax.swing.JMenuItem mnItCons;
    private javax.swing.JMenuItem mnItExc;
    private javax.swing.JMenuItem mnItLimpa;
    private javax.swing.JMenuItem mnItList;
    private javax.swing.JMenuItem mnItSai;
    private javax.swing.JMenuItem mnItTab;
    private javax.swing.JMenu mnJanela;
    private javax.swing.JMenu mnPrinc;
    private javax.swing.JLabel rtId;
    private javax.swing.JLabel rtMarca;
    private javax.swing.JLabel rtPre;
    private javax.swing.JLabel rtTipo;
    private javax.swing.JTable tabInst;
    // End of variables declaration//GEN-END:variables

    private void showTabInst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
