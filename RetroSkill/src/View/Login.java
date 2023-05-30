/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Usuario;
import java.awt.Color;
import static java.awt.Color.red;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author Aluno Tarde
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login_Cadastro
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        SenhaLogin = new javax.swing.JPasswordField();
        NomeLogin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Botaoentrar = new javax.swing.JLabel();
        Versao = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Retro Skill");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Esqueceu a senha?");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 340, -1, 20));

        SenhaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaLoginActionPerformed(evt);
            }
        });
        SenhaLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SenhaLoginKeyPressed(evt);
            }
        });
        getContentPane().add(SenhaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 300, 230, 30));

        NomeLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeLoginActionPerformed(evt);
            }
        });
        NomeLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NomeLoginKeyPressed(evt);
            }
        });
        getContentPane().add(NomeLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 240, 230, 30));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Não tem conta? Cadastre-se");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 570, -1, -1));

        Botaoentrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/roxoprontotranspa_1.png"))); // NOI18N
        Botaoentrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoentrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoentrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoentrarMouseExited(evt);
            }
        });
        Botaoentrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BotaoentrarKeyPressed(evt);
            }
        });
        getContentPane().add(Botaoentrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 370, 200, 40));

        Versao.setForeground(new java.awt.Color(255, 255, 255));
        Versao.setText("Versão 1.0");
        Versao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VersaoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VersaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VersaoMouseExited(evt);
            }
        });
        getContentPane().add(Versao, new org.netbeans.lib.awtextra.AbsoluteConstraints(1345, 682, -1, 20));

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/1500por698.png"))); // NOI18N
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        RecupSenha recupSenha=new RecupSenha();
        recupSenha.setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
  
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setText("<html><u>Não tem conta? Cadastre-se</u></html>");
        jLabel1.setForeground(Color.blue);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        Cadastro cadastro = new Cadastro();
        cadastro.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        jLabel1.setText("<html>Não tem conta? Cadastre-se</html>");
        jLabel1.setForeground(Color.white);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        // TODO add your handling code here:
        jLabel11.setText("<html><u>Esqueceu a senha?</u></html>");
        jLabel11.setForeground(Color.blue);
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        // TODO add your handling code here:
        jLabel11.setText("<html>Esqueceu a senha?</html>");
        jLabel11.setForeground(Color.white);
    }//GEN-LAST:event_jLabel11MouseExited

    private void NomeLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeLoginActionPerformed

    private void SenhaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenhaLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SenhaLoginActionPerformed

    private void BotaoentrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoentrarMouseClicked
        // TODO add your handling code here:
        String VSenhaLogin=null;
        VSenhaLogin=(String.valueOf(SenhaLogin.getPassword()));
        if(NomeLogin.getText().equals("")||VSenhaLogin.equals("")){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Login Incorreto", JOptionPane.WARNING_MESSAGE);
        }else{
            Usuario usuario = new Usuario(NomeLogin.getText());
            usuario.setSenha(String.valueOf(SenhaLogin.getPassword()));
            if(Usuario.logar(usuario)){
                TelaDeSelecao telaDeSelecao= new TelaDeSelecao(usuario);
                telaDeSelecao.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Nome de usuario ou senha incorretos", "Login Incorreto", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_BotaoentrarMouseClicked

    private void BotaoentrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoentrarMouseEntered
        // TODO add your handling code here:
        Botaoentrar.setIcon(new ImageIcon(getClass().getResource("imagens/brancoprontotranspa_1.png")));
    }//GEN-LAST:event_BotaoentrarMouseEntered

    private void BotaoentrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoentrarMouseExited
        // TODO add your handling code here:
        Botaoentrar.setIcon(new ImageIcon(getClass().getResource("imagens/roxoprontotranspa_1.png")));
    }//GEN-LAST:event_BotaoentrarMouseExited

    private void VersaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VersaoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_VersaoMouseClicked

    private void VersaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VersaoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_VersaoMouseEntered

    private void VersaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VersaoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_VersaoMouseExited

    private void BotaoentrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BotaoentrarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoentrarKeyPressed

    private void NomeLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NomeLoginKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {                    
             String VSenhaLogin=null;
        VSenhaLogin=(String.valueOf(SenhaLogin.getPassword()));
        if(NomeLogin.getText().equals("")||VSenhaLogin.equals("")){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Login Incorreto", JOptionPane.WARNING_MESSAGE);
        }else{
            Usuario usuario = new Usuario(NomeLogin.getText());
            usuario.setSenha(String.valueOf(SenhaLogin.getPassword()));
            if(Usuario.logar(usuario)){
                TelaDeSelecao telaDeSelecao= new TelaDeSelecao(usuario);
                telaDeSelecao.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Nome de usuario ou senha incorretos", "Login Incorreto", JOptionPane.WARNING_MESSAGE);
            }
        }
        }
    }//GEN-LAST:event_NomeLoginKeyPressed

    private void SenhaLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SenhaLoginKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {                    
             String VSenhaLogin=null;
        VSenhaLogin=(String.valueOf(SenhaLogin.getPassword()));
        if(NomeLogin.getText().equals("")||VSenhaLogin.equals("")){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Login Incorreto", JOptionPane.WARNING_MESSAGE);
        }else{
            Usuario usuario = new Usuario(NomeLogin.getText());
            usuario.setSenha(String.valueOf(SenhaLogin.getPassword()));
            if(Usuario.logar(usuario)){
                TelaDeSelecao telaDeSelecao= new TelaDeSelecao(usuario);
                telaDeSelecao.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Nome de usuario ou senha incorretos", "Login Incorreto", JOptionPane.WARNING_MESSAGE);
            }
        }
        }
    }//GEN-LAST:event_SenhaLoginKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Botaoentrar;
    private javax.swing.JLabel Fundo;
    private javax.swing.JTextField NomeLogin;
    private javax.swing.JPasswordField SenhaLogin;
    private javax.swing.JLabel Versao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    // End of variables declaration//GEN-END:variables
}