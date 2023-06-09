/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Usuario;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import spaceship.battle.SpaceshipBattle;

/**
 *
 * @author Aluno
 */
public class TelaDeSelecao extends javax.swing.JFrame {
    //armazena o usuario que chamou a tela
    Usuario usuario = new Usuario();
    
    /**
     * Creates new form TelaDeSelecao
     */
    public TelaDeSelecao(Usuario usuario) {
        initComponents();
        setLocationRelativeTo(null);

        this.usuario=usuario;
    }

    private TelaDeSelecao() {
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JogarSpace = new javax.swing.JLabel();
        RankingSpace = new javax.swing.JLabel();
        RankingRetroWar = new javax.swing.JLabel();
        jogarRetroWar = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seleção de Jogos");
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JogarSpace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JogarSpaceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JogarSpaceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JogarSpaceMouseExited(evt);
            }
        });
        getContentPane().add(JogarSpace, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 135, 183, 254));

        RankingSpace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RankingSpaceMouseClicked(evt);
            }
        });
        getContentPane().add(RankingSpace, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 438, 195, 45));

        RankingRetroWar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RankingRetroWarMouseClicked(evt);
            }
        });
        getContentPane().add(RankingRetroWar, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 438, 195, 45));

        jogarRetroWar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jogarRetroWarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jogarRetroWarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jogarRetroWarMouseExited(evt);
            }
        });
        getContentPane().add(jogarRetroWar, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 135, 183, 254));

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/PRINCIPAL.png"))); // NOI18N
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 874, 492));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowLostFocus

    private void JogarSpaceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JogarSpaceMouseClicked
        SpaceshipBattle.iniciar(usuario.getNome());
        //System.out.println("Nome na tela: "+usuario.getNome());
        
//        dispose();      
    }//GEN-LAST:event_JogarSpaceMouseClicked

    private void RankingSpaceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RankingSpaceMouseClicked
        // TODO add your handling code here:
        TelaPontos telapontos = new TelaPontos(1);
        telapontos.setVisible(true);
    }//GEN-LAST:event_RankingSpaceMouseClicked

    private void jogarRetroWarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jogarRetroWarMouseClicked
        // TODO add your handling code here:
        bomberproject.BomberProject.iniciar(usuario.getNome());
        //System.out.println("Nome Antes de chamer: "+usuario.getNome());
    }//GEN-LAST:event_jogarRetroWarMouseClicked

    private void RankingRetroWarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RankingRetroWarMouseClicked
        // TODO add your handling code here:
        TelaPontos telapontos = new TelaPontos(2);
        telapontos.setVisible(true);
    }//GEN-LAST:event_RankingRetroWarMouseClicked

    private void JogarSpaceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JogarSpaceMouseEntered
        // TODO add your handling code here:
        JogarSpace.setIcon(new ImageIcon(getClass().getResource("imagens/BORDABRANCA.png")));
    }//GEN-LAST:event_JogarSpaceMouseEntered

    private void JogarSpaceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JogarSpaceMouseExited
        // TODO add your handling code here:
        JogarSpace.setIcon(null);
    }//GEN-LAST:event_JogarSpaceMouseExited

    private void jogarRetroWarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jogarRetroWarMouseEntered
        // TODO add your handling code here:
        jogarRetroWar.setIcon(new ImageIcon(getClass().getResource("imagens/BORDABRANCA.png")));
    }//GEN-LAST:event_jogarRetroWarMouseEntered

    private void jogarRetroWarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jogarRetroWarMouseExited
        // TODO add your handling code here:
        jogarRetroWar.setIcon(null);
    }//GEN-LAST:event_jogarRetroWarMouseExited

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
            java.util.logging.Logger.getLogger(TelaDeSelecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeSelecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeSelecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeSelecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeSelecao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel JogarSpace;
    private javax.swing.JLabel RankingRetroWar;
    private javax.swing.JLabel RankingSpace;
    private javax.swing.JLabel jogarRetroWar;
    // End of variables declaration//GEN-END:variables
}
