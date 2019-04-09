package br.com.principal;
import net.proteanit.sql.DbUtils;
import br.com.principal.ModuloConexao;
import java.sql.*;
import javax.swing.JOptionPane;
public class Cadastro_Participante extends javax.swing.JInternalFrame {
    Connection con;
    PreparedStatement stnt ;
    ResultSet rs ;
    private conector conexao = new conector();
    private Geral geral;
    private Evento evento;
    public Cadastro_Participante() {
        initComponents();
        pesquisaevento();
        pesquisarparticipante();
         conexao.conectar();
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtevento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbevento = new javax.swing.JTable();
        txtparticipante = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbparticipante = new javax.swing.JTable();
        txtevento_regi = new javax.swing.JTextField();
        txtparticipante_regi = new javax.swing.JTextField();
        btcadastrar = new javax.swing.JButton();
        cp_evento = new javax.swing.JTextField();
        cp_participante = new javax.swing.JTextField();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Eve:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Part:");

        txtevento.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtevento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txteventoKeyReleased(evt);
            }
        });

        tbevento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Eventos"
            }
        ));
        tbevento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbeventoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbevento);

        txtparticipante.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtparticipante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtparticipanteKeyReleased(evt);
            }
        });

        tbparticipante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF"
            }
        ));
        tbparticipante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbparticipanteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbparticipante);

        txtevento_regi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtevento_regi.setEnabled(false);

        txtparticipante_regi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtparticipante_regi.setEnabled(false);

        btcadastrar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btcadastrar.setText("Cadastrar");
        btcadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btcadastrarMousePressed(evt);
            }
        });

        cp_evento.setEnabled(false);

        cp_participante.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btcadastrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtevento, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cp_evento, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cp_participante, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtevento_regi))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtparticipante_regi))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtparticipante, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtevento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtparticipante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtevento_regi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtparticipante_regi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(btcadastrar)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cp_evento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cp_participante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     public void pesquisaevento(){
        String sql= "select ideve as ID , nomeeve as Eventos from tbevento where nomeeve like ?";
        try {
            con =  ModuloConexao.conectar();
            stnt = con.prepareStatement(sql);
            stnt.setString(1,txtevento.getText()+"%");
            rs=stnt.executeQuery();
            tbevento.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
                
        }
    }
     public void pesquisarparticipante(){
         String sql ="select id as ID ,nome, cpf from tbgeral where nome like ?";
         try {
            con =  ModuloConexao.conectar();
            stnt = con.prepareStatement(sql);
            stnt.setString(1,txtparticipante.getText()+"%");
            rs=stnt.executeQuery();
            tbparticipante.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
                
        }
     
     }
     
     private void cadastroevento(){
     int cadastro = tbevento.getSelectedRow();
     cp_evento.setText(tbevento.getModel().getValueAt(cadastro,0).toString());
     txtevento_regi.setText(tbevento.getModel().getValueAt(cadastro,1).toString());  
     }
     
     private void cadastroparticipante(){
     int cadastro = tbparticipante.getSelectedRow();
     cp_participante.setText(tbparticipante.getModel().getValueAt(cadastro,0).toString());
     txtparticipante_regi.setText(tbparticipante.getModel().getValueAt(cadastro,1).toString());
     }
    private void txteventoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txteventoKeyReleased
        pesquisaevento();
    }//GEN-LAST:event_txteventoKeyReleased

    private void txtparticipanteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtparticipanteKeyReleased
        pesquisarparticipante();
    }//GEN-LAST:event_txtparticipanteKeyReleased

    private void tbeventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbeventoMouseClicked
        cadastroevento();
    }//GEN-LAST:event_tbeventoMouseClicked

    private void tbparticipanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbparticipanteMouseClicked
        cadastroparticipante();
    }//GEN-LAST:event_tbparticipanteMouseClicked

    private void btcadastrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcadastrarMousePressed
        Geral geral = new Geral();
        Evento evento = new Evento();
        geral.setIdgeral(Integer.parseInt(cp_participante.getText()));
        evento.setIdvento(Integer.parseInt(cp_evento.getText()));
        conexao.inserirparticipante(geral, evento);
        JOptionPane.showMessageDialog(null,"Cadastro Realizado com Sucesso!");
    }//GEN-LAST:event_btcadastrarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcadastrar;
    private javax.swing.JTextField cp_evento;
    private javax.swing.JTextField cp_participante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbevento;
    private javax.swing.JTable tbparticipante;
    private javax.swing.JTextField txtevento;
    private javax.swing.JTextField txtevento_regi;
    private javax.swing.JTextField txtparticipante;
    private javax.swing.JTextField txtparticipante_regi;
    // End of variables declaration//GEN-END:variables
}
