
package br.com.principal;

import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    
    public Principal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        Menu_principal = new javax.swing.JMenuBar();
        cadastro_geral = new javax.swing.JMenu();
        novo_cadastro = new javax.swing.JMenuItem();
        escola_lideres = new javax.swing.JMenu();
        criar_turma = new javax.swing.JMenuItem();
        cadastrar_professor = new javax.swing.JMenuItem();
        cadastrar_aluno = new javax.swing.JMenuItem();
        menu_evento = new javax.swing.JMenu();
        criar_evento = new javax.swing.JMenuItem();
        cadastrar_participante = new javax.swing.JMenuItem();
        gerenciar = new javax.swing.JMenu();
        alunos = new javax.swing.JMenuItem();
        gerenciar_cadastro_geral = new javax.swing.JMenuItem();
        eventos = new javax.swing.JMenuItem();
        turmas = new javax.swing.JMenuItem();
        participantes = new javax.swing.JMenuItem();
        professores = new javax.swing.JMenuItem();
        relatorios = new javax.swing.JMenu();
        relatorios_alunos = new javax.swing.JMenuItem();
        relatorios_cadastro_geral = new javax.swing.JMenuItem();
        relatorios_eventos = new javax.swing.JMenuItem();
        relatorios_turmas = new javax.swing.JMenuItem();
        relatorios_participantes = new javax.swing.JMenuItem();
        relatorios_professores = new javax.swing.JMenuItem();
        sobre = new javax.swing.JMenu();
        sair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MarnoBrasil / Tela Principal");
        setMaximumSize(new java.awt.Dimension(1250, 550));
        setMinimumSize(new java.awt.Dimension(1250, 550));
        setResizable(false);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1250, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );

        cadastro_geral.setText("Cadastro Geral");

        novo_cadastro.setText("Novo Cadastro");
        novo_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novo_cadastroActionPerformed(evt);
            }
        });
        cadastro_geral.add(novo_cadastro);

        Menu_principal.add(cadastro_geral);

        escola_lideres.setText("Escola de Lideres");

        criar_turma.setText("Criar Turma");
        escola_lideres.add(criar_turma);

        cadastrar_professor.setText("Cadastrar Professor");
        cadastrar_professor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_professorActionPerformed(evt);
            }
        });
        escola_lideres.add(cadastrar_professor);

        cadastrar_aluno.setText("Cadastrar Alunos");
        cadastrar_aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_alunoActionPerformed(evt);
            }
        });
        escola_lideres.add(cadastrar_aluno);

        Menu_principal.add(escola_lideres);

        menu_evento.setText("Eventos");

        criar_evento.setText("Criar Evento");
        criar_evento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criar_eventoActionPerformed(evt);
            }
        });
        menu_evento.add(criar_evento);

        cadastrar_participante.setText("Cadastrar Participante");
        cadastrar_participante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_participanteActionPerformed(evt);
            }
        });
        menu_evento.add(cadastrar_participante);

        Menu_principal.add(menu_evento);

        gerenciar.setText("Gerenciar");

        alunos.setText("Alunos");
        gerenciar.add(alunos);

        gerenciar_cadastro_geral.setText("Cadastro Geral");
        gerenciar.add(gerenciar_cadastro_geral);

        eventos.setText("Eventos");
        gerenciar.add(eventos);

        turmas.setText("Turmas");
        gerenciar.add(turmas);

        participantes.setText("Participantes");
        gerenciar.add(participantes);

        professores.setText("Professores");
        gerenciar.add(professores);

        Menu_principal.add(gerenciar);

        relatorios.setText("Relatórios");

        relatorios_alunos.setText("Alunos");
        relatorios.add(relatorios_alunos);

        relatorios_cadastro_geral.setText("Cadastro Geral");
        relatorios.add(relatorios_cadastro_geral);

        relatorios_eventos.setText("Eventos");
        relatorios.add(relatorios_eventos);

        relatorios_turmas.setText("Turmas");
        relatorios.add(relatorios_turmas);

        relatorios_participantes.setText("Participantes");
        relatorios.add(relatorios_participantes);

        relatorios_professores.setText("Professores");
        relatorios.add(relatorios_professores);

        Menu_principal.add(relatorios);

        sobre.setText("Sobre");
        sobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sobreMousePressed(evt);
            }
        });
        sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreActionPerformed(evt);
            }
        });
        Menu_principal.add(sobre);

        sair.setText("Sair");
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sairMousePressed(evt);
            }
        });
        Menu_principal.add(sair);

        setJMenuBar(Menu_principal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void novo_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novo_cadastroActionPerformed
        Cadastro_Geral painel = new Cadastro_Geral();
        painel.setVisible(true);
        desktop.add(painel);
    }//GEN-LAST:event_novo_cadastroActionPerformed

    private void sairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMousePressed
        int sair =  JOptionPane . showConfirmDialog ( null , " Tem certeza que deseja sair? " , " Atenção! " , JOptionPane . YES_NO_OPTION );
        if (sair ==  JOptionPane . YES_OPTION ) {
           // Sistema . saída ( 0 );
        }
    }//GEN-LAST:event_sairMousePressed

    private void criar_eventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criar_eventoActionPerformed
        Cadastro_Evento painel = new Cadastro_Evento();
        painel.setVisible(true);
        desktop.add(painel);
    }//GEN-LAST:event_criar_eventoActionPerformed

    private void cadastrar_professorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_professorActionPerformed
        Cadastro_Professor painel = new Cadastro_Professor();
        painel.setVisible(true);
        desktop.add(painel);
    }//GEN-LAST:event_cadastrar_professorActionPerformed

    private void cadastrar_alunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_alunoActionPerformed
       Cadastro_Alunos painel = new Cadastro_Alunos();
        painel.setVisible(true);
        desktop.add(painel);
    }//GEN-LAST:event_cadastrar_alunoActionPerformed

    private void cadastrar_participanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_participanteActionPerformed
        Cadastro_Participante painel = new Cadastro_Participante();
        painel.setVisible(true);
        desktop.add(painel);
    }//GEN-LAST:event_cadastrar_participanteActionPerformed

    private void sobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sobreActionPerformed

    private void sobreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sobreMousePressed
        Sobre painel = new Sobre();
        painel.setVisible(true);
        desktop.add(painel);
    }//GEN-LAST:event_sobreMousePressed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu_principal;
    private javax.swing.JMenuItem alunos;
    private javax.swing.JMenuItem cadastrar_aluno;
    private javax.swing.JMenuItem cadastrar_participante;
    private javax.swing.JMenuItem cadastrar_professor;
    private javax.swing.JMenu cadastro_geral;
    private javax.swing.JMenuItem criar_evento;
    private javax.swing.JMenuItem criar_turma;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu escola_lideres;
    private javax.swing.JMenuItem eventos;
    private javax.swing.JMenu gerenciar;
    private javax.swing.JMenuItem gerenciar_cadastro_geral;
    private javax.swing.JMenu menu_evento;
    private javax.swing.JMenuItem novo_cadastro;
    private javax.swing.JMenuItem participantes;
    private javax.swing.JMenuItem professores;
    private javax.swing.JMenu relatorios;
    private javax.swing.JMenuItem relatorios_alunos;
    private javax.swing.JMenuItem relatorios_cadastro_geral;
    private javax.swing.JMenuItem relatorios_eventos;
    private javax.swing.JMenuItem relatorios_participantes;
    private javax.swing.JMenuItem relatorios_professores;
    private javax.swing.JMenuItem relatorios_turmas;
    private javax.swing.JMenu sair;
    private javax.swing.JMenu sobre;
    private javax.swing.JMenuItem turmas;
    // End of variables declaration//GEN-END:variables
}
