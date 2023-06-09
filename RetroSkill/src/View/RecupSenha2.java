/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Usuario;
import static Model.Usuario.RecuperarSenha;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author CLP
 */
public class RecupSenha2 extends javax.swing.JFrame {

    Usuario usuario=new Usuario();
    
    /**
     * Creates new form RecupSenha2
     */
    public RecupSenha2(Usuario usuario) {
        initComponents();
        setLocationRelativeTo(null);
        CampoPSeguranca.setEditable(false);
        
        //this.usuario=usuario;
        CampoPSeguranca.setText(usuario.getPSeguranca());
        
        this.usuario=usuario;
    }

    private RecupSenha2() {
        
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CampoPSeguranca = new javax.swing.JTextField();
        CampoRSeguranca = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Recuperação de Senha");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CampoPSeguranca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CampoPSegurancaKeyPressed(evt);
            }
        });
        getContentPane().add(CampoPSeguranca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 35, 360, 34));

        CampoRSeguranca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CampoRSegurancaKeyPressed(evt);
            }
        });
        getContentPane().add(CampoRSeguranca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 95, 360, 38));

        jButton1.setText("Redefinir Senha");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 140, 140, -1));

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/RecSenha2.png"))); // NOI18N
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        usuario.setRSeguranca(CampoRSeguranca.getText());
        if(CampoRSeguranca.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo", "Erro", JOptionPane.WARNING_MESSAGE);
        }else{
            if(RecuperarSenha(usuario)){
                RecupSenha3 recupsenha3 = new RecupSenha3(usuario);
                recupsenha3.setVisible(true);
                dispose();
            }else{
                
//                System.out.println(usuario.getNome());
//                System.out.println(usuario.getPSeguranca());
//                System.out.println(usuario.getRSeguranca());
                
                JOptionPane.showMessageDialog(null, "Resposta errada", "Erro", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CampoPSegurancaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoPSegurancaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoPSegurancaKeyPressed

    private void CampoRSegurancaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoRSegurancaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {
             usuario.setRSeguranca(CampoRSeguranca.getText());
            if(CampoRSeguranca.getText().equals("")){
                 JOptionPane.showMessageDialog(null, "Preencha o campo", "Erro", JOptionPane.WARNING_MESSAGE);
            }else{
            if(RecuperarSenha(usuario)){
                RecupSenha3 recupsenha3 = new RecupSenha3(usuario);
                recupsenha3.setVisible(true);
                dispose();
            }else{
                
//                System.out.println(usuario.getNome());
//                System.out.println(usuario.getPSeguranca());
//                System.out.println(usuario.getRSeguranca());
                
                JOptionPane.showMessageDialog(null, "Resposta errada", "Erro", JOptionPane.WARNING_MESSAGE);
            }
        }
        }
    }//GEN-LAST:event_CampoRSegurancaKeyPressed

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
            java.util.logging.Logger.getLogger(RecupSenha2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecupSenha2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecupSenha2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecupSenha2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecupSenha2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoPSeguranca;
    private javax.swing.JTextField CampoRSeguranca;
    private javax.swing.JLabel Fundo;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
