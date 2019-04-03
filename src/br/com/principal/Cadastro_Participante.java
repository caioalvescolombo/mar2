package br.com.principal;
import net.proteanit.sql.DbUtils;
import br.com.principal.ModuloConexao;
import java.sql.*;
import javax.swing.JOptionPane;
public class Cadastro_Participante extends javax.swing.JInternalFrame {
    Connection con;
    PreparedStatement stnt ;
    ResultSet rs ;
    public Cadastro_Participante() {
        initComponents();
        
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
        tbcadastrar = new javax.swing.JButton();

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
        jScrollPane1.setViewportView(tbevento);

        txtparticipante.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtparticipante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtparticipanteKeyReleased(evt);
            }
        });

        tbparticipante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "CPF"
            }
        ));
        jScrollPane2.setViewportView(tbparticipante);

        txtevento_regi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtevento_regi.setEnabled(false);

        txtparticipante_regi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtparticipante_regi.setEnabled(false);

        tbcadastrar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tbcadastrar.setText("Cadastrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tbcadastrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtevento_regi))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtevento, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtevento_regi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtparticipante_regi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(tbcadastrar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     public void pesquisaevento(){
        String sql= "select nomeeve as Eventos from tbevento where nomeeve like ?";
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
         String sql ="select nome, cpf from tbgeral where nome like ?";
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
    private void txteventoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txteventoKeyReleased
        pesquisaevento();
    }//GEN-LAST:event_txteventoKeyReleased

    private void txtparticipanteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtparticipanteKeyReleased
        pesquisarparticipante();
    }//GEN-LAST:event_txtparticipanteKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton tbcadastrar;
    private javax.swing.JTable tbevento;
    private javax.swing.JTable tbparticipante;
    private javax.swing.JTextField txtevento;
    private javax.swing.JTextField txtevento_regi;
    private javax.swing.JTextField txtparticipante;
    private javax.swing.JTextField txtparticipante_regi;
    // End of variables declaration//GEN-END:variables
}
