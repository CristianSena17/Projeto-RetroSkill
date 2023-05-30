/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberproject;


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
public class SetaLugar implements Runnable {
    
    @Override
    public void run() {try {
        while(true){
        BomberProject.tela.player1.setLocation(BomberProject.move.compx, BomberProject.move.compy);
        BomberProject.tela.TP1.setLocation(BomberProject.move.compx-4, BomberProject.move.compy-28);
        BomberProject.tela.player2.setLocation(BomberProject.move2.compx, BomberProject.move2.compy);
        BomberProject.tela.TP2.setLocation(BomberProject.move2.compx-4, BomberProject.move2.compy-28);
        Thread.sleep(20);
            
            
        }
        } catch (InterruptedException ex) {
            Logger.getLogger(SetaLugar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
